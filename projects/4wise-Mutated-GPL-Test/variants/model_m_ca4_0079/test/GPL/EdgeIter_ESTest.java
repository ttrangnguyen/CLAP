/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 08:39:36 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import GPL.EdgeIfc;
import GPL.EdgeIter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EdgeIter_ESTest extends EdgeIter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EdgeIter edgeIter0 = new EdgeIter();
      boolean boolean0 = edgeIter0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EdgeIter edgeIter0 = new EdgeIter();
      EdgeIfc edgeIfc0 = edgeIter0.next();
      assertNull(edgeIfc0);
  }
}