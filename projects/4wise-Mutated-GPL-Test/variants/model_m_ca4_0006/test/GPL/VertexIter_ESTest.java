/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 05:11:34 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import GPL.Vertex;
import GPL.VertexIter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VertexIter_ESTest extends VertexIter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VertexIter vertexIter0 = new VertexIter();
      boolean boolean0 = vertexIter0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VertexIter vertexIter0 = new VertexIter();
      Vertex vertex0 = vertexIter0.next();
      assertNull(vertex0);
  }
}
