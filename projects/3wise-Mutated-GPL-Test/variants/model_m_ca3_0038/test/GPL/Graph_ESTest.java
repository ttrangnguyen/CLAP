/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 04:13:46 GMT 2020
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
      vertex0.assignName("");
      graph0.addVertex(vertex0);
      Vertex vertex1 = graph0.findsVertex("");
      assertEquals(0, vertex1.componentNumber);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      ((Neighbor) edgeIfc0).neighbor.addEdge((Neighbor) null);
      graph0.addVertex(((Neighbor) edgeIfc0).neighbor);
      // Undeclared exception!
      try { 
        graph0.run(vertex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add(" connected to: ");
      graph0.vertices = linkedList0;
      // Undeclared exception!
      try { 
        graph0.run((Vertex) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      vertex0.adjacentNeighbors = graph0.vertices;
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex0, vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Vertex cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor();
      vertex0.addEdge(neighbor0);
      graph0.addVertex(vertex0);
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
  public void test06()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.neighbor.adjacentNeighbors = graph0.vertices;
      graph0.addEdge(vertex0, neighbor0);
      // Undeclared exception!
      try { 
        graph0.display();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      // Undeclared exception!
      try { 
        graph0.addEdge((Vertex) null, vertex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Graph graph0 = new Graph();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("sIPA-t-T:<Cmwu");
      graph0.vertices = linkedList0;
      WorkSpace workSpace0 = new WorkSpace();
      // Undeclared exception!
      try { 
        graph0.GraphSearch(workSpace0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      vertex0.addEdge((Neighbor) null);
      // Undeclared exception!
      try { 
        graph0.ConnectedComponents();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
      graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.ConnectedComponents();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.ConnectedComponents();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Graph graph0 = new Graph();
      VertexIter vertexIter0 = graph0.getVertices();
      assertNotNull(vertexIter0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.display();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      graph0.run(vertex0);
      assertEquals(1, vertex0.componentNumber);
      assertTrue(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Graph graph0 = new Graph();
      WorkSpace workSpace0 = new WorkSpace();
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      graph0.addEdge(vertex0, neighbor0);
      vertex0.assignName("J");
      Vertex vertex1 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.findsEdge(neighbor0.neighbor, vertex1);
      assertNull(edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.assignName("|D");
      Vertex vertex1 = new Vertex();
      vertex1.assignName("R~");
      graph0.addEdge(neighbor0.neighbor, vertex1);
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex1, vertex1);
      assertNull(edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      graph0.addEdge(neighbor0.neighbor, neighbor0.neighbor);
      vertex0.assignName("|D");
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex0, neighbor0.neighbor);
      assertNotSame(neighbor0, edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = graph0.findsVertex((String) null);
      assertNull(vertex0);
  }
}
