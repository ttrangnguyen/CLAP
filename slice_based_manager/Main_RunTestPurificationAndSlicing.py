import AntManager
import TestManager

from FileManager import list_dir, lock_project
from slice_based_manager import TestPurificationManager

if __name__ == "__main__":
    # ------ START CONFIG ------
    mutants_dir = "/Users/tuanngokien/Desktop/Software_Analysis/configurable_system/dataset/4wise-Email-FH-JML-NOB3"
    # ------ END CONFIG ------

    mutated_project_dirs = list_dir(mutants_dir, full_path=True)

    # clone ant directory
    cloned_ant_name = AntManager.clone_ant_plugin()

    # run junit test with coverage and write to project's configs report
    for mutated_project_dir in mutated_project_dirs:
        try:
            lock_project(mutated_project_dir)
        except BlockingIOError as e:
            continue

        failed_variant_dirs = TestManager.get_failed_variant_dirs_from_config_report(mutated_project_dir)
        TestManager.run_batch_junit_test_cases_on_project(mutated_project_dir,
                                                          custom_ant=cloned_ant_name,
                                                          custom_variant_dirs=failed_variant_dirs)
        TestPurificationManager.generate_purified_test_suite(mutated_project_dir, failed_variant_dirs)
