/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 05:08:49 GMT 2020
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
      vertex0.name = "";
      graph0.addVertex(vertex0);
      Vertex vertex1 = graph0.findsVertex("");
      assertEquals("", vertex1.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      vertex0.name = "";
      neighbor0.NeighborConstructor(vertex0, 2147483645);
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(neighbor0.neighbor, vertex0);
      assertEquals(2147483645, neighbor1.getWeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      Vertex vertex1 = vertex0.assignName("eTB>c9m");
      graph0.addAnEdge(neighbor0.neighbor, vertex1, (-1780));
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(vertex0, neighbor0.neighbor);
      assertEquals((-1780), neighbor1.weight);
      assertNotNull(neighbor1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Graph graph0 = new Graph();
      boolean boolean0 = graph0.CycleCheck();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      vertex0.adjacentNeighbors = graph0.vertices;
      // Undeclared exception!
      try { 
        graph0.run(vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Vertex cannot be cast to GPL.NeighborIfc
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.findsEdge(((Neighbor) edgeIfc0).neighbor, vertex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Graph graph1 = graph0.Prim(vertex0);
      graph1.vertices = vertex0.adjacentNeighbors;
      graph1.addVertex(vertex0);
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.addEdge((Vertex) null, ((Neighbor) edgeIfc0).neighbor);
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
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      // Undeclared exception!
      try { 
        graph0.addAnEdge(neighbor0.neighbor, (Vertex) null, (-3377));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.addEdge(neighbor0);
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Graph graph0 = new Graph();
      WorkSpace workSpace0 = new WorkSpace();
      Vertex vertex0 = new Vertex();
      vertex0.adjacentNeighbors = graph0.vertices;
      graph0.addEdge(vertex0, vertex0);
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
  public void test18()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.vertices = null;
      // Undeclared exception!
      try { 
        graph0.CycleCheck();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 0);
      graph0.addAnEdge(neighbor0.neighbor, vertex0, 0);
      graph0.vertices = vertex0.adjacentNeighbors;
      // Undeclared exception!
      try { 
        graph0.CycleCheck();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.vertices = null;
      // Undeclared exception!
      try { 
        graph0.ConnectedComponents();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, 2);
      graph0.addEdge(vertex0, neighbor0);
      assertEquals(0, vertex0.componentNumber);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      vertex0.name = "?[;4hdhA]REO~43";
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).neighbor, ((Neighbor) edgeIfc0).neighbor);
      assertEquals(0, edgeIfc1.getWeight());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = graph0.findsVertex((String) null);
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      WorkSpace workSpace0 = new WorkSpace();
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      VertexIter vertexIter0 = graph0.getVertices();
      assertNotNull(vertexIter0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      Graph.isDirected = true;
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      graph0.addEdge(vertex0, neighbor0);
      assertNull(vertex0.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      WorkSpace workSpace0 = new WorkSpace();
      graph0.addVertex(vertex0);
      graph0.addVertex(((Neighbor) edgeIfc0).neighbor);
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.display();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      graph0.addVertex(vertex0);
      graph0.addVertex(((Neighbor) edgeIfc0).neighbor);
      boolean boolean0 = graph0.CycleCheck();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.ConnectedComponents();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      Neighbor neighbor0 = new Neighbor();
      vertex0.name = "?[;4hdhA]REO~43";
      Vertex vertex1 = new Vertex();
      neighbor0.NeighborConstructor(vertex1);
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).neighbor, neighbor0.neighbor);
      assertNull(edgeIfc1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      vertex0.name = "?[;4hdhA]REO~43";
      Vertex vertex1 = new Vertex();
      vertex1.assignName("?[;2hdhA]REO~43");
      neighbor0.NeighborConstructor(vertex1);
      graph0.addAnEdge(neighbor0.neighbor, vertex0, 0);
      Neighbor neighbor1 = (Neighbor)graph0.findsEdge(vertex1, neighbor0.neighbor);
      assertNull(neighbor1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      vertex0.name = "?[;4hdhA]REO~43";
      Vertex vertex1 = new Vertex();
      vertex1.assignName("?[;2hdhA]REO~43");
      neighbor0.NeighborConstructor(vertex1);
      graph0.addAnEdge(neighbor0.neighbor, vertex0, 0);
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex1);
      graph0.Prim(vertex1);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.assignName("?[;2hdhA]REO~43");
      neighbor0.NeighborConstructor(vertex1);
      graph0.addAnEdge(neighbor0.neighbor, vertex0, 0);
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex1);
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
  public void test35()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex1, 0);
      vertex1.name = "";
      Vertex vertex2 = new Vertex();
      graph0.addAnEdge(vertex1, vertex2, (-1));
      graph0.run(neighbor0.neighbor);
      graph0.Prim(neighbor0.neighbor);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex1, 0);
      vertex1.name = "";
      Vertex vertex2 = new Vertex();
      graph0.addAnEdge(vertex1, vertex2, (-1));
      graph0.addAnEdge(vertex0, vertex1, 0);
      graph0.run(neighbor0.neighbor);
      assertTrue(vertex1.visited);
      assertEquals(1, vertex1.VertexCycle);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = (Neighbor)graph0.addEdge(vertex0, vertex0);
      vertex0.name = "?[;4hdhA]REO~43";
      Vertex vertex1 = new Vertex();
      neighbor0.NeighborConstructor(vertex1);
      graph0.addAnEdge(neighbor0.neighbor, vertex0, 0);
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      graph0.Prim(vertex1);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      vertex1.adjacentNeighbors = graph0.vertices;
      graph0.addAnEdge(vertex0, vertex1, 0);
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
}
