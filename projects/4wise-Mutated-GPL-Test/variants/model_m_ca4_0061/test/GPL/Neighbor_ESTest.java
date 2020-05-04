/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 07:49:00 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Neighbor;
import GPL.Vertex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Neighbor_ESTest extends Neighbor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      Vertex vertex1 = neighbor0.getOtherVertex(vertex0);
      assertSame(vertex0, vertex1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor((Vertex) null);
      Vertex vertex0 = neighbor0.getEnd();
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor((Vertex) null);
      // Undeclared exception!
      try { 
        neighbor0.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Neighbor", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      neighbor0.NeighborConstructor(neighbor0.neighbor);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.display();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = neighbor0.getStart();
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.adjustAdorns(neighbor0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      Vertex vertex1 = neighbor0.getEnd();
      assertFalse(vertex1.visited);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.setWeight(0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = neighbor0.getOtherVertex((Vertex) null);
      assertNull(vertex0);
  }
}