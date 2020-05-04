/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 03:10:45 GMT 2020
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
  public void test00()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = new Vertex();
      neighbor0.neighbor = vertex0;
      neighbor0.display();
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor((Vertex) null, 101);
      int int0 = neighbor0.getWeight();
      assertEquals(101, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      neighbor0.setWeight((-3680));
      int int0 = neighbor0.getWeight();
      assertEquals((-3680), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = new Vertex();
      neighbor0.neighbor = vertex0;
      Vertex vertex1 = neighbor0.getOtherVertex(neighbor0.neighbor);
      assertSame(vertex1, vertex0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      neighbor0.NeighborConstructor(neighbor0.neighbor);
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.NeighborConstructor(vertex0, 0);
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = neighbor0.getStart();
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = neighbor0.getOtherVertex(neighbor0.neighbor);
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = neighbor0.getEnd();
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
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
  public void test10()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      neighbor0.adjustAdorns(neighbor0);
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      int int0 = neighbor0.getWeight();
      assertEquals(0, int0);
  }
}