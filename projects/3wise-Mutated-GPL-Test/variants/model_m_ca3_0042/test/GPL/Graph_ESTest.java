/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 04:24:31 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Edge;
import GPL.EdgeIfc;
import GPL.EdgeIter;
import GPL.Graph;
import GPL.Neighbor;
import GPL.Vertex;
import GPL.VertexIter;
import GPL.WorkSpace;
import java.util.Comparator;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Graph_ESTest extends Graph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("f");
      graph0.addVertex(vertex1);
      Vertex vertex2 = graph0.findsVertex("f");
      assertFalse(vertex2.visited);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("f");
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex1, vertex1);
      edgeIfc0.setWeight(1256);
      EdgeIfc edgeIfc1 = graph0.findsEdge(vertex0, vertex0);
      assertEquals(1256, edgeIfc1.getWeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("63i");
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex1, vertex1);
      edgeIfc0.setWeight((-3303));
      EdgeIfc edgeIfc1 = graph0.findsEdge(vertex0, vertex0);
      assertEquals((-3303), edgeIfc1.getWeight());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      graph0.addVertex(((Edge) edgeIfc0).start);
      boolean boolean0 = graph0.CycleCheck();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(vertex0, vertex0, 0);
      graph0.addVertex(vertex0);
      graph0.addVertex(edge0.start);
      // Undeclared exception!
      try { 
        graph0.sortVertices((Comparator) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Vertex cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      vertex0.neighbors = linkedList0;
      linkedList0.offerFirst("khag{;q)");
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex0, vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      edge0.start = null;
      // Undeclared exception!
      try { 
        graph0.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Edge", e);
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
  public void test10()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      vertex0.neighbors = linkedList0;
      linkedList0.add((Integer) vertex0.key);
      // Undeclared exception!
      try { 
        graph0.Prim(vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to GPL.NeighborIfc
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Neighbor neighbor0 = new Neighbor();
      vertex0.addNeighbor(neighbor0);
      // Undeclared exception!
      try { 
        graph0.NumberVertices();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      graph0.addVertex(((Edge) edgeIfc0).start);
      Edge edge0 = new Edge();
      vertex0.addNeighbor(edge0);
      // Undeclared exception!
      try { 
        graph0.CycleCheck();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.CycleWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = graph0.findsVertex("T,0");
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      boolean boolean0 = graph0.CycleCheck();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Graph graph0 = new Graph();
      WorkSpace workSpace0 = new WorkSpace();
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Graph graph0 = new Graph();
      EdgeIter edgeIter0 = graph0.getEdges();
      assertNotNull(edgeIter0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Graph graph0 = new Graph();
      VertexIter vertexIter0 = graph0.getVertices();
      assertNotNull(vertexIter0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = graph0.findsVertex((String) null);
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(vertex0, vertex0, 0);
      graph0.addVertex(edge0.start);
      WorkSpace workSpace0 = new WorkSpace();
      graph0.addVertex(edge0.start);
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.display();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(vertex0, vertex0, 0);
      graph0.addVertex(vertex0);
      graph0.addVertex(edge0.start);
      graph0.NumberVertices();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.run(vertex0);
      assertTrue(vertex0.visited);
      assertEquals(0, vertex0.VertexCycle);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("fq");
      graph0.addEdge(vertex1, vertex1);
      Edge edge0 = (Edge)graph0.findsEdge(vertex0, vertex0);
      Vertex vertex2 = new Vertex();
      edge0.start = vertex2;
      vertex2.assignName("Ui");
      Edge edge1 = (Edge)graph0.findsEdge(vertex0, vertex2);
      assertSame(edge1, edge0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("6yPi");
      Vertex vertex2 = new Vertex();
      Vertex vertex3 = vertex2.assignName("MSrm");
      graph0.addEdge(vertex3, vertex1);
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex2, vertex2);
      assertNull(edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.assignName("6yPi");
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      edge0.EdgeConstructor(vertex1, vertex1);
      graph0.addEdge(vertex0, edge0.start);
      EdgeIfc edgeIfc0 = graph0.findsEdge(vertex1, vertex1);
      assertNull(edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("6yPi");
      graph0.addVertex(vertex1);
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex2 = new Vertex();
      edge0.EdgeConstructor(vertex2, vertex2);
      graph0.addEdge(edge0.end, vertex1);
      graph0.addEdge(vertex0, edge0.start);
      // Undeclared exception!
      try { 
        graph0.Prim(edge0.end);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.sortVertices((Comparator) null);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Graph graph0 = new Graph();
      Comparator<Edge> comparator0 = (Comparator<Edge>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      graph0.sortEdges(comparator0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      Graph graph1 = graph0.Prim(((Edge) edgeIfc0).start);
      Vertex vertex1 = new Vertex();
      Vertex vertex2 = vertex1.assignName("MSrm");
      graph1.addEdge(vertex2, vertex0);
      graph1.addVertex(((Edge) edgeIfc0).start);
      graph1.Prim(vertex2);
      assertEquals(0, vertex0.key);
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      Vertex vertex2 = vertex1.assignName("MSrm");
      graph0.addEdge(vertex2, vertex0);
      graph0.addVertex(((Edge) edgeIfc0).start);
      graph0.Prim(vertex2);
      assertEquals(0, vertex2.key);
      assertEquals(0, vertex1.key);
  }
}