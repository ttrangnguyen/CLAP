/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 03:07:56 GMT 2020
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
      Neighbor neighbor0 = new Neighbor((Vertex) null, 0);
      neighbor0.NeighborConstructor((Vertex) null, (-2935));
      int int0 = neighbor0.getWeight();
      assertEquals((-2935), neighbor0.weight);
      assertEquals((-2935), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      Vertex vertex0 = neighbor0.getOtherVertex(neighbor0.neighbor);
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor((Vertex) null, 0);
      neighbor0.getEnd();
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      neighbor0.NeighborConstructor(neighbor0.neighbor);
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.NeighborConstructor(vertex0, 276);
      int int0 = neighbor0.getWeight();
      assertEquals(276, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      neighbor0.getStart();
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      Vertex vertex1 = neighbor0.getOtherVertex(neighbor0.neighbor);
      assertFalse(vertex1.visited);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      neighbor0.getEnd();
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      neighbor0.display();
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.setWeight(0);
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      int int0 = neighbor0.getWeight();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
      neighbor0.adjustAdorns(neighbor0);
      assertEquals(0, neighbor0.getWeight());
  }
}
