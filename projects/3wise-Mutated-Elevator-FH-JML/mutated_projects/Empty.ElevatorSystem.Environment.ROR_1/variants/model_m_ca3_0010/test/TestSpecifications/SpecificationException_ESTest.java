/*
 * This file was automatically generated by EvoSuite
 * Sat May 09 18:50:55 GMT 2020
 */

package TestSpecifications;

import org.junit.Test;
import static org.junit.Assert.*;
import TestSpecifications.SpecificationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpecificationException_ESTest extends SpecificationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpecificationException specificationException0 = new SpecificationException((String) null, "");
      String string0 = specificationException0.getSpecificationName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpecificationException specificationException0 = new SpecificationException("]~=GkoFCW<", "");
      String string0 = specificationException0.getSpecificationName();
      assertEquals("]~=GkoFCW<", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SpecificationException specificationException0 = new SpecificationException("", "");
      String string0 = specificationException0.getSpecificationName();
      assertEquals("", string0);
  }
}