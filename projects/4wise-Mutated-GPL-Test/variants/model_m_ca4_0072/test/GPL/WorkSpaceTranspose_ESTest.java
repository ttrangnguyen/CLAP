/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 08:18:16 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Vertex;
import GPL.WorkSpaceTranspose;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WorkSpaceTranspose_ESTest extends WorkSpaceTranspose_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WorkSpaceTranspose workSpaceTranspose0 = new WorkSpaceTranspose();
      // Undeclared exception!
      try { 
        workSpaceTranspose0.preVisitAction((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.WorkSpaceTranspose", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WorkSpaceTranspose workSpaceTranspose0 = new WorkSpaceTranspose();
      Vertex vertex0 = new Vertex();
      vertex0.nodeSearch(workSpaceTranspose0);
      workSpaceTranspose0.preVisitAction(vertex0);
      assertEquals(0, vertex0.strongComponentNumber);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WorkSpaceTranspose workSpaceTranspose0 = new WorkSpaceTranspose();
      Vertex vertex0 = new Vertex();
      workSpaceTranspose0.preVisitAction(vertex0);
      assertEquals(0, vertex0.strongComponentNumber);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WorkSpaceTranspose workSpaceTranspose0 = new WorkSpaceTranspose();
      workSpaceTranspose0.nextRegionAction((Vertex) null);
  }
}
