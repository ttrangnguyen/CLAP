/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 08:51:31 GMT 2020
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
      Vertex vertex1 = vertex0.assignName("");
      graph0.addVertex(vertex0);
      Vertex vertex2 = graph0.findsVertex("");
      assertSame(vertex2, vertex1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "(\"l8";
      graph0.addAnEdge(vertex0, vertex0, 0);
      Neighbor neighbor0 = (Neighbor)graph0.findsEdge(vertex0, vertex0);
      neighbor0.weight = (-41);
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(vertex0, vertex0);
      assertSame(neighbor1, neighbor0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.addEdge((Neighbor) null);
      // Undeclared exception!
      try { 
        graph0.run(vertex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
      graph0.addAnEdge(vertex0, vertex0, 0);
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.vertices = vertex0.adjacentNeighbors;
      graph0.addVertex(vertex0);
      Neighbor neighbor0 = new Neighbor(vertex0);
      // Undeclared exception!
      try { 
        graph0.findsEdge(neighbor0.neighbor, neighbor0.neighbor);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Vertex cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.vertices = vertex0.adjacentNeighbors;
      graph0.addEdge(vertex0, vertex0);
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      // Undeclared exception!
      try { 
        graph0.addEdge(vertex0, (Neighbor) null);
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
      Vertex vertex0 = new Vertex();
      // Undeclared exception!
      try { 
        graph0.addAnEdge(vertex0, (Vertex) null, 0);
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
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      graph0.vertices = linkedList0;
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
      linkedList0.add((Object) vertex0);
      // Undeclared exception!
      try { 
        graph0.Prim(vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Vertex cannot be cast to GPL.NeighborIfc
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.vertices = vertex0.adjacentNeighbors;
      graph0.addEdge(vertex0, vertex0);
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
  public void test15()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = graph0.findsVertex((String) null);
      assertNull(vertex0);
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
      Graph.isDirected = true;
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      graph0.addEdge(vertex0, neighbor0);
      assertEquals(0, neighbor0.weight);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.GraphSearch((WorkSpace) null);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "\"<Wl.";
      Vertex vertex1 = new Vertex();
      Vertex vertex2 = vertex1.assignName("6<Wl.");
      graph0.addEdge(vertex2, vertex0);
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex2, vertex2);
      assertNull(edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "(\"l8";
      graph0.addAnEdge(vertex0, vertex0, 0);
      Neighbor neighbor0 = (Neighbor)graph0.findsEdge(vertex0, vertex0);
      assertNotNull(neighbor0);
      
      Vertex vertex1 = new Vertex();
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(neighbor0.neighbor, vertex1);
      assertEquals(0, neighbor0.weight);
      assertNull(neighbor1);
      assertEquals(0, neighbor0.getWeight());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addAnEdge(vertex0, vertex0, 2180);
      Vertex vertex1 = vertex0.assignName("");
      Neighbor neighbor0 = new Neighbor(vertex1);
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(neighbor0.neighbor, vertex1);
      assertNotNull(neighbor1);
      assertEquals(2180, neighbor1.weight);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.findsEdge(((Neighbor) edgeIfc0).neighbor, ((Neighbor) edgeIfc0).neighbor);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.name = "GPL.Vertex";
      EdgeIfc edgeIfc1 = graph0.addEdge(((Neighbor) edgeIfc0).neighbor, vertex1);
      graph0.addVertex(((Neighbor) edgeIfc1).neighbor);
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
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      graph0.addEdge(vertex1, neighbor0);
      graph0.addAnEdge(vertex1, vertex0, 0);
      vertex1.name = "GP}L.VeArtex";
      graph0.Prim(vertex1);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.display();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      graph0.run(neighbor0.neighbor);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      graph0.addEdge(vertex1, neighbor0);
      graph0.addAnEdge(vertex1, vertex0, 0);
      Vertex vertex2 = new Vertex();
      neighbor0.NeighborConstructor(vertex2, (-4798));
      vertex1.name = "GP}L.VeArtex";
      graph0.Prim(vertex1);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.addEdge(neighbor0);
      vertex1.name = "GPL.VertZ";
      graph0.addVertex(neighbor0.neighbor);
      graph0.Prim(vertex1);
      assertEquals(0, vertex1.key);
  }
}
