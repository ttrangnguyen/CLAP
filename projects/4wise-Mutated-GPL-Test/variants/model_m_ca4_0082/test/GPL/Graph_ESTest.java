/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 08:48:35 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.EdgeIfc;
import GPL.Graph;
import GPL.Neighbor;
import GPL.Vertex;
import GPL.VertexIter;
import GPL.WorkSpace;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Graph_ESTest extends Graph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.assignName("umpaX:*6-Lf5FMjp");
      graph0.addVertex(vertex0);
      Vertex vertex1 = graph0.findsVertex("umpaX:*6-Lf5FMjp");
      assertFalse(vertex1.visited);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "t+;,yW0#oQ&";
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      graph0.addEdge(vertex0, neighbor0);
      neighbor0.setWeight(1120);
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(neighbor0.neighbor, vertex0);
      assertEquals(1120, neighbor1.weight);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("umpaX:*6-Lf5FMjp");
      Neighbor neighbor0 = new Neighbor(vertex1, (-2172));
      graph0.addEdge(vertex0, neighbor0);
      EdgeIfc edgeIfc0 = graph0.findsEdge(neighbor0.neighbor, vertex0);
      assertSame(neighbor0, edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Graph graph0 = new Graph();
      // Undeclared exception!
      try { 
        graph0.run((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      graph0.addEdge(vertex0, neighbor0);
      // Undeclared exception!
      try { 
        graph0.run((Vertex) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.vertices = null;
      // Undeclared exception!
      try { 
        graph0.getVertices();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.addEdge(neighbor0);
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex0, vertex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      graph0.vertices = vertex1.adjacentNeighbors;
      graph0.addVertex(vertex0);
      Neighbor neighbor0 = new Neighbor(vertex1, 471);
      // Undeclared exception!
      try { 
        graph0.findsEdge(neighbor0.neighbor, vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Vertex cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.vertices = null;
      // Undeclared exception!
      try { 
        graph0.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      Graph graph1 = graph0.Prim(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.adjacentNeighbors = graph1.vertices;
      graph1.addEdge(vertex1, neighbor0);
      // Undeclared exception!
      try { 
        graph1.display();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Graph graph0 = new Graph();
      // Undeclared exception!
      try { 
        graph0.addVertex((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Graph graph0 = new Graph();
      // Undeclared exception!
      try { 
        graph0.addEdge((Vertex) null, (Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor();
      // Undeclared exception!
      try { 
        graph0.addEdge(vertex0, neighbor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Graph graph0 = new Graph();
      // Undeclared exception!
      try { 
        graph0.addAnEdge((Vertex) null, (Vertex) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Graph graph1 = graph0.Prim(vertex0);
      vertex0.adjacentNeighbors = graph1.vertices;
      graph1.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph1.Prim(vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      // Undeclared exception!
      try { 
        graph0.GraphSearch((WorkSpace) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      vertex1.adjacentNeighbors = graph0.vertices;
      graph0.addEdge(vertex1, vertex0);
      WorkSpace workSpace0 = new WorkSpace();
      // Undeclared exception!
      try { 
        graph0.GraphSearch(workSpace0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Neighbor neighbor0 = new Neighbor();
      vertex0.addEdge(neighbor0);
      // Undeclared exception!
      try { 
        graph0.ConnectedComponents();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Graph graph1 = graph0.Prim(vertex0);
      graph1.vertices = vertex0.adjacentNeighbors;
      graph1.addAnEdge(vertex0, vertex0, 0);
      // Undeclared exception!
      try { 
        graph1.ConnectedComponents();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.addEdge(neighbor0);
      vertex0.name = "GPL.EdgeIter";
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex0, vertex0);
      assertEquals(0, edgeIfc0.getWeight());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = graph0.findsVertex((String) null);
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.ConnectedComponents();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      WorkSpace workSpace0 = new WorkSpace();
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Graph graph0 = new Graph();
      VertexIter vertexIter0 = graph0.getVertices();
      assertNotNull(vertexIter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      WorkSpace workSpace0 = new WorkSpace();
      graph0.addVertex(vertex0);
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      graph0.run(vertex0);
      assertTrue(vertex0.visited);
      assertEquals(1, vertex0.componentNumber);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor();
      neighbor0.NeighborConstructor(vertex0);
      Graph.isDirected = true;
      graph0.addEdge(vertex0, neighbor0);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      vertex1.assignName("R<'d1umFRoTCO`7");
      Vertex vertex2 = vertex0.assignName("GPL.WorkSpace");
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex1, vertex2);
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).neighbor, vertex0);
      assertNull(edgeIfc1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      Vertex vertex2 = vertex1.assignName("R<'d1umFRoTCO`7");
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex1, vertex2);
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).neighbor, vertex0);
      assertNull(edgeIfc1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.assignName("R<'d1umFRoTCO`7");
      Vertex vertex2 = vertex0.assignName("GPL.WorkSpace");
      graph0.addVertex(vertex1);
      graph0.addEdge(vertex1, vertex2);
      graph0.Prim(vertex1);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.assignName("R<'d1umFRoTCO`7");
      graph0.addVertex(vertex1);
      graph0.addEdge(vertex1, vertex0);
      // Undeclared exception!
      try { 
        graph0.Prim(vertex1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      graph0.addVertex(vertex1);
      Vertex vertex2 = new Vertex();
      Vertex vertex3 = vertex0.assignName("GPL.WorkSpace");
      graph0.addEdge(vertex2, vertex3);
      graph0.Prim(vertex0);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      graph0.addVertex(vertex1);
      Graph graph1 = graph0.Prim(vertex0);
      Graph graph2 = new Graph();
      Vertex vertex2 = new Vertex();
      graph2.addVertex(vertex2);
      Vertex vertex3 = vertex0.assignName("GPL.WorkSpace");
      graph1.addEdge(vertex2, vertex3);
      graph0.addEdge(vertex3, vertex1);
      assertEquals(Integer.MAX_VALUE, vertex1.key);
      
      graph2.Prim(vertex3);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      graph0.addVertex(vertex1);
      Vertex vertex2 = new Vertex();
      Vertex vertex3 = vertex0.assignName("GPL.WorkSpace");
      graph0.addAnEdge(vertex0, vertex2, (-2780));
      graph0.addEdge(vertex3, vertex1);
      graph0.Prim(vertex3);
      assertEquals(0, vertex3.key);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.display();
      assertFalse(Graph.isDirected);
  }
}
