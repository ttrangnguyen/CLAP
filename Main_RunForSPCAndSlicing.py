from FileManager import list_dir, get_spc_log_file_path, join_path, lock_project
from spc import SPCsManager
from suspicious_statements_manager import SlicingManager

if __name__ == "__main__":
    mutants_dir = "/home/huent/Documents/Trang/Debug/ExamDB/1Bug/4wise/"
    mutated_project_dirs = list_dir(mutants_dir, full_path=True)
    coverage = 0.0
    coverage_verions = ["INoT_1_", "INoT_2_"]
    for mutated_project_dir in mutated_project_dirs:
        for verion in coverage_verions:
            # try:
            #     lock_project(mutated_project_dir)
            # except BlockingIOError as e:
            #     continue
            #SPCsManager.find_SPCs(mutated_project_dir, coverage)
            spc_log_file_path = get_spc_log_file_path(mutated_project_dir, coverage)
            slicing_runtime = SlicingManager.do_slice(spc_log_file_path, coverage, verion)