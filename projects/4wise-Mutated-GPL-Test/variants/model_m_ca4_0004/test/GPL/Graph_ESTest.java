/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 05:05:43 GMT 2020
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
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Graph_ESTest extends Graph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.assignName(" ");
      graph0.addVertex(neighbor0.neighbor);
      Vertex vertex1 = graph0.findsVertex(" ");
      assertEquals(" ", vertex1.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("ePLRdcc3_a");
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex1);
      neighbor0.weight = 1744;
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(vertex0, vertex0);
      assertEquals(1744, neighbor1.getWeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      vertex0.adjacentNeighbors = graph0.vertices;
      vertex0.assignName("ePKcc3G");
      graph0.addAnEdge(((Neighbor) edgeIfc0).neighbor, ((Neighbor) edgeIfc0).neighbor, (-5245));
      Neighbor neighbor0 = (Neighbor)graph0.findsEdge(vertex0, vertex0);
      assertEquals((-5245), neighbor0.weight);
      assertNotNull(neighbor0);
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
      graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.run(vertex0);
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
      graph0.addEdge(vertex0, vertex0);
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
      LinkedList<Vertex> linkedList0 = new LinkedList<Vertex>();
      LinkedList<Vertex> linkedList1 = new LinkedList<Vertex>(linkedList0);
      vertex0.adjacentNeighbors = linkedList1;
      linkedList1.add(vertex0);
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex0, (Vertex) null);
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
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      graph0.addVertex(vertex0);
      neighbor0.NeighborConstructor((Vertex) null);
      // Undeclared exception!
      try { 
        graph0.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
      graph0.addVertex(vertex0);
      // Undeclared exception!
      try { 
        graph0.display();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Vertex cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$1", e);
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
      Neighbor neighbor0 = new Neighbor((Vertex) null);
      // Undeclared exception!
      try { 
        graph0.addEdge((Vertex) null, neighbor0);
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
        graph0.addAnEdge((Vertex) null, (Vertex) null, 0);
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
      vertex0.adjacentNeighbors = graph0.vertices;
      graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.Prim(vertex0);
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
      vertex0.addEdge((Neighbor) null);
      graph0.addVertex(vertex0);
      // Undeclared exception!
      try { 
        graph0.NumberVertices();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      vertex1.adjacentNeighbors = graph0.vertices;
      graph0.addAnEdge(vertex1, vertex0, 0);
      // Undeclared exception!
      try { 
        graph0.NumberVertices();
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
  public void test18()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addAnEdge(vertex0, vertex0, 119);
      Graph graph1 = graph0.Prim(vertex0);
      graph1.vertices = vertex0.adjacentNeighbors;
      WorkSpace workSpace0 = new WorkSpace();
      // Undeclared exception!
      try { 
        graph1.GraphSearch(workSpace0);
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
      Vertex vertex1 = vertex0.assignName("ePLRdcc3_a");
      graph0.addEdge(vertex0, vertex1);
      Neighbor neighbor0 = (Neighbor)graph0.findsEdge(vertex1, vertex1);
      assertEquals(0, neighbor0.weight);
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
      Vertex vertex0 = new Vertex();
      graph0.addEdge(vertex0, vertex0);
      vertex0.assignName("wH@W)Om");
      Vertex vertex1 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex0, vertex1);
      assertNull(edgeIfc0);
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
      graph0.display();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      WorkSpace workSpace0 = new WorkSpace();
      graph0.addVertex(neighbor0.neighbor);
      graph0.addVertex(neighbor0.neighbor);
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.NumberVertices();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      Graph.isDirected = true;
      graph0.addEdge(vertex0, neighbor0);
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.assignName(" !visited ");
      Vertex vertex1 = new Vertex();
      graph0.addEdge(vertex0, vertex1);
      vertex1.name = "  visited ";
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex1, vertex1);
      assertNull(edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      graph0.addAnEdge(vertex1, vertex1, 0);
      Neighbor neighbor0 = new Neighbor(vertex1);
      graph0.addVertex(vertex0);
      Vertex vertex2 = vertex1.assignName(";");
      graph0.addEdge(vertex0, neighbor0);
      graph0.addVertex(neighbor0.neighbor);
      vertex0.assignName("=");
      graph0.Prim(vertex2);
      assertEquals(0, vertex2.key);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex1);
      graph0.addVertex(vertex0);
      Vertex vertex2 = vertex1.assignName(";");
      graph0.addEdge(vertex0, neighbor0);
      graph0.addVertex(neighbor0.neighbor);
      // Undeclared exception!
      try { 
        graph0.Prim(vertex2);
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
      Neighbor neighbor0 = new Neighbor(vertex1);
      graph0.addVertex(vertex0);
      vertex1.assignName("j");
      graph0.addEdge(vertex0, neighbor0);
      graph0.addVertex(vertex0);
      graph0.addVertex(neighbor0.neighbor);
      Vertex vertex2 = new Vertex();
      graph0.Prim(vertex2);
      assertEquals(0, vertex2.key);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex1);
      graph0.addVertex(vertex0);
      vertex1.assignName(";");
      graph0.addEdge(vertex0, neighbor0);
      graph0.addVertex(vertex0);
      graph0.addVertex(neighbor0.neighbor);
      Vertex vertex2 = vertex0.assignName("=");
      Vertex vertex3 = new Vertex();
      graph0.addAnEdge(vertex3, vertex2, (-1186568663));
      graph0.Prim(vertex3);
      assertEquals(0, vertex3.key);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex1);
      graph0.addAnEdge(vertex0, neighbor0.neighbor, 161);
      vertex1.assignName(" ");
      graph0.addVertex(vertex0);
      graph0.run(neighbor0.neighbor);
      assertEquals(1, vertex1.VertexNumber);
      assertTrue(vertex1.visited);
  }
}