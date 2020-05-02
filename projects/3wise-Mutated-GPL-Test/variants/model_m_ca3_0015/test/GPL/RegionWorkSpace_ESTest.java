/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 03:10:09 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.RegionWorkSpace;
import GPL.Vertex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegionWorkSpace_ESTest extends RegionWorkSpace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      // Undeclared exception!
      try { 
        regionWorkSpace0.postVisitAction((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.RegionWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      // Undeclared exception!
      try { 
        regionWorkSpace0.init_vertex((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.RegionWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      Vertex vertex0 = new Vertex();
      regionWorkSpace0.nextRegionAction(vertex0);
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      Vertex vertex0 = new Vertex();
      regionWorkSpace0.init_vertex(vertex0);
      assertEquals((-1), vertex0.componentNumber);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      Vertex vertex0 = new Vertex();
      regionWorkSpace0.postVisitAction(vertex0);
      assertEquals(0, vertex0.componentNumber);
  }
}
