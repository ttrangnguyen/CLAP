/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 12:46:15 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Edge;
import GPL.Vertex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Edge_ESTest extends Edge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Edge edge0 = new Edge();
      edge0.edge = edge0;
      Vertex vertex0 = new Vertex();
      edge0.edge.EdgeConstructor(vertex0, vertex0);
      edge0.display();
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      edge0.start = vertex0;
      Vertex vertex1 = edge0.getStart();
      assertEquals(0, vertex1.VertexCycle);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      edge0.start = vertex0;
      edge0.EdgeConstructor(edge0.start, edge0.start);
      Vertex vertex1 = edge0.getEnd();
      assertEquals(0, vertex1.VertexNumber);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      edge0.EdgeConstructor((Vertex) null, vertex0);
      Vertex vertex1 = edge0.getOtherVertex((Vertex) null);
      Vertex vertex2 = edge0.getOtherVertex(vertex1);
      assertNull(vertex2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = edge0.getOtherVertex(vertex0);
      assertNull(vertex1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Edge edge0 = new Edge();
      // Undeclared exception!
      try { 
        edge0.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Edge", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Edge edge0 = new Edge();
      edge0.edge = edge0;
      Vertex vertex0 = edge0.edge.getEnd();
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Edge edge0 = new Edge();
      edge0.setWeight(0);
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Edge edge0 = new Edge();
      edge0.edge = edge0;
      edge0.edge.adjustAdorns(edge0);
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Edge edge0 = new Edge();
      edge0.edge = edge0;
      Vertex vertex0 = edge0.edge.getStart();
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Edge edge0 = new Edge();
      int int0 = edge0.getWeight();
      assertEquals(0, int0);
  }
}