/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 08:21:36 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import GPL.Vertex;
import GPL.WorkSpace;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WorkSpace_ESTest extends WorkSpace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WorkSpace workSpace0 = new WorkSpace();
      workSpace0.checkNeighborAction((Vertex) null, (Vertex) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorkSpace workSpace0 = new WorkSpace();
      workSpace0.init_vertex((Vertex) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorkSpace workSpace0 = new WorkSpace();
      Vertex vertex0 = new Vertex();
      workSpace0.preVisitAction(vertex0);
      assertEquals(0, vertex0.VertexNumber);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WorkSpace workSpace0 = new WorkSpace();
      workSpace0.nextRegionAction((Vertex) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WorkSpace workSpace0 = new WorkSpace();
      workSpace0.postVisitAction((Vertex) null);
  }
}
