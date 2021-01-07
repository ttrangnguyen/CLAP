import os

from xlsxwriter import Workbook

from ranking import RankingManager
from ranking.RankingManager import VARCOP_SPC_LAYER, VARCOP_LAYER, SPECTRUM, \
    ranking_multiple_bugs
from FileManager import join_path, EXPERIMENT_RESULT_FOLDER, get_mutated_projects_dir, list_dir
from suspicious_statements_manager.SuspiciousStatementManager import get_multiple_buggy_statements, get_suspicious_statement

PROJECT_NAME_COL = 0
ISOLATION_STM_COL = 1
ISOLATION_RANK_COL = 2
ISOLATION_SPACE_COL = 3

WITHOUT_ISOLATION_STM_COL = 4
WITHOUT_ISOLATION_RANK_COL = 5
WITHOUT_ISOLATION_SPACE_COL = 6

SBFL_STM_COL = 7
SBFL_RANK_COL = 8
SBFL_SPACE_COL = 9

PROJECT_NAME_HEADER = "Project"
ISOLATION_STM_HEADER = "Isolation_stm"
ISOLATION_RANK_HEADER = "Isolation_rank"
ISOLATION_SPACE_HEADER = "Isolation_space"

WITHOUT_ISOLATION_STM_HEADER = "without_Isolation_stm"
WITHOUT_ISOLATION_RANK_HEADER = "without_Isolation_rank"
WITHOUT_ISOLATION_SPACE_HEADER = "without_Isolation_space"

SBFL_STM_HEADER = "SBFL_stm"
SBFL_RANK_HEADER = "SBFL_rank"
SBFL_RANK_SPACE = "SBFL_space"
def write_header_in_result_file(row, sheet):
    sheet.write(row, PROJECT_NAME_COL, PROJECT_NAME_HEADER)
    sheet.write(row, ISOLATION_STM_COL, ISOLATION_STM_HEADER)
    sheet.write(row, ISOLATION_RANK_COL, ISOLATION_RANK_HEADER)
    sheet.write(row, ISOLATION_SPACE_COL, ISOLATION_SPACE_HEADER)

    sheet.write(row, WITHOUT_ISOLATION_STM_COL, WITHOUT_ISOLATION_STM_HEADER)
    sheet.write(row, WITHOUT_ISOLATION_RANK_COL, WITHOUT_ISOLATION_RANK_HEADER)
    sheet.write(row, WITHOUT_ISOLATION_SPACE_COL, WITHOUT_ISOLATION_SPACE_HEADER)

    sheet.write(row, SBFL_STM_COL, SBFL_STM_HEADER)
    sheet.write(row, SBFL_RANK_COL, SBFL_RANK_HEADER)
    sheet.write(row, SBFL_SPACE_COL, SBFL_RANK_SPACE)

def write_result_to_file(row, sheet, ranking_results, space):

    temp = row

    for stm in ranking_results[VARCOP_SPC_LAYER].keys():
        sheet.write(temp, ISOLATION_STM_COL, stm)
        sheet.write(temp, ISOLATION_RANK_COL, ranking_results[VARCOP_SPC_LAYER][stm])
        sheet.write(temp, ISOLATION_SPACE_COL, space[VARCOP_SPC_LAYER])
        temp += 1

    temp = row
    for stm in ranking_results[VARCOP_LAYER]:
        sheet.write(temp, WITHOUT_ISOLATION_STM_COL, stm)
        sheet.write(temp, WITHOUT_ISOLATION_RANK_COL, ranking_results[VARCOP_LAYER][stm])
        sheet.write(temp, WITHOUT_ISOLATION_SPACE_COL, space[VARCOP_LAYER])
        temp += 1

    temp = row
    for stm in ranking_results[SPECTRUM]:
        sheet.write(temp, SBFL_STM_COL, stm)
        sheet.write(temp, SBFL_RANK_COL, ranking_results[SPECTRUM][stm])
        sheet.write(temp, SBFL_SPACE_COL, space[SPECTRUM])
        temp += 1
    row = temp
    return row

def mutiple_bugs_ranking(result_folder, system_name, system_dir, spectrum_expressions, filtering_coverage_rate):
    aggregations = [RankingManager.AGGREGATION_ARITHMETIC_MEAN]
    normalizations = [RankingManager.NORMALIZATION_ALPHA_BETA]
    mutated_projects_dir = get_mutated_projects_dir(system_dir)
    mutated_projects = list_dir(mutated_projects_dir)
    for aggregation_type in aggregations:
        for normalization_type in normalizations:
            sheet = []

            row = 0
            search_rank_type_dir = join_path(EXPERIMENT_RESULT_FOLDER,
                                            result_folder + str(aggregation_type)) + "_" + str(normalization_type)
            system_result_dir = join_path(search_rank_type_dir, system_name)
            if not os.path.exists(system_result_dir):
                os.makedirs(system_result_dir)
            experiment_file_name = join_path(system_result_dir,
                                             str(filtering_coverage_rate) + "_" + ".xlsx")

            wb = Workbook(experiment_file_name)

            for i in range(0, len(spectrum_expressions)):
                sheet.append(wb.add_worksheet(spectrum_expressions[i]))
                write_header_in_result_file(row, sheet[i])
            row += 1
            num_of_bugs = 0
            for mutated_project_name in mutated_projects:
                num_of_bugs += 1
                mutated_project_dir = join_path(mutated_projects_dir, mutated_project_name)
                #spc_log_file_path = SPCsManager.find_SPCs(mutated_project_dir, filtering_coverage_rate)

                #spc_log_file_path = get_spc_log_file_path(mutated_project_dir, filtering_coverage_rate)
                #SlicingManager.do_slice(spc_log_file_path, filtering_coverage_rate, "")
                suspicious_stms_list = get_suspicious_statement(mutated_project_dir, filtering_coverage_rate)
                buggy_statements = get_multiple_buggy_statements(mutated_project_name, mutated_project_dir)
                # print(buggy_statements)
                #

                row_temp = row
                for sbfl_expression in range(0, len(spectrum_expressions)):
                     ranking_results, space = ranking_multiple_bugs(buggy_statements, mutated_project_dir,
                                                               suspicious_stms_list, spectrum_expressions[sbfl_expression], aggregation_type,
                                                               normalization_type, coverage_rate=0.0)
                #
                     sheet[sbfl_expression].write(row_temp, PROJECT_NAME_COL, mutated_project_name)
                     row = write_result_to_file(row_temp, sheet[sbfl_expression],  ranking_results, space)
                if(num_of_bugs >= 30):
                    break
            wb.close()

