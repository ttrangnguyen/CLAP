/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 06:10:51 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import GPL.Main;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Main.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Main main0 = new Main();
  }
}
