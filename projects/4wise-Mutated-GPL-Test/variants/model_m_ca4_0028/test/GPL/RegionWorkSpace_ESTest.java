/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 06:13:26 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Edge;
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
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      edge0.end = vertex0;
      regionWorkSpace0.postVisitAction(edge0.end);
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      edge0.end = vertex0;
      regionWorkSpace0.init_vertex(edge0.end);
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      Edge edge0 = new Edge();
      // Undeclared exception!
      try { 
        regionWorkSpace0.postVisitAction(edge0.end);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.RegionWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      Edge edge0 = new Edge();
      regionWorkSpace0.nextRegionAction(edge0.end);
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegionWorkSpace regionWorkSpace0 = new RegionWorkSpace();
      Edge edge0 = new Edge();
      // Undeclared exception!
      try { 
        regionWorkSpace0.init_vertex(edge0.end);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.RegionWorkSpace", e);
      }
  }
}