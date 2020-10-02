import os
import threading

from ExperimentResultManager import ranking_with_coverage_rate
from FileManager import join_path
from Spectrum_Expression import RUSSELL_RAO, SIMPLE_MATCHING, ROGERS_TANIMOTO, AMPLE, JACCARD, COHEN, SCOTT, ROGOT1, \
    GEOMETRIC_MEAN, M2, TARANTULA, OCHIAI, OP2, BARINEL, DSTAR, WONG1, SOKAL

if __name__ == "__main__":

    base_dir = "/home/huent/Documents/Trang/"
    system_names = ["BankAccountTP", "Elevator", "Email", "ExamDB", "GPL"]
    project_names = ["1wise", "2wise", "3wise", "4wise", "5wise"]

    filtering_coverage_rate_list = [0.5, 0.8, 0.95]
    for coverage_index in range(0, len(filtering_coverage_rate_list)):
        for system in system_names:
             system_dir = join_path(base_dir, system)
             print(system)
             for project_index in range(0, len(project_names)):
                 k_wise_dir = join_path(system_dir, project_names[project_index])
                 print(k_wise_dir)
                 if os.path.isdir(k_wise_dir):
                    #ranking_with_coverage_rate(base_dir, project_names[project_index], filtering_coverage_rate_list[coverage_index], [TARANTULA, OCHIAI, OP2, BARINEL, DSTAR])
                    ranking_with_coverage_rate(system_dir, system, project_names[project_index],
                                               filtering_coverage_rate_list[coverage_index],
                                               [TARANTULA, OCHIAI, OP2, BARINEL, DSTAR, RUSSELL_RAO, SIMPLE_MATCHING, ROGERS_TANIMOTO, AMPLE, JACCARD, COHEN, SCOTT, ROGOT1, GEOMETRIC_MEAN, M2, WONG1, SOKAL])
                    #ranking_with_coverage_rate(base_dir, system_name, project_names[project_index],
                    #                           filtering_coverage_rate_list[coverage_index],
                     #                          [TARANTULA])




