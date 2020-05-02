/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 09:19:32 GMT 2020
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
      Vertex vertex1 = vertex0.assignName("");
      vertex1.name = "\"vh.vv_!OQ5eA_hxG9M";
      graph0.addVertex(vertex1);
      Vertex vertex2 = graph0.findsVertex("\"vh.vv_!OQ5eA_hxG9M");
      assertSame(vertex2, vertex0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      vertex1.name = "\"vh.vv_!OQ5eA_hxG9M";
      vertex1.representative = vertex0;
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex1);
      edgeIfc0.setWeight(1);
      vertex0.name = "G=f4J4OJ2]bi";
      EdgeIfc edgeIfc1 = graph0.findsEdge(vertex1.representative, vertex1);
      assertEquals(1, edgeIfc1.getWeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "";
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      edgeIfc0.setWeight((-1));
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).end, ((Neighbor) edgeIfc0).end);
      assertSame(edgeIfc1, edgeIfc0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      // Undeclared exception!
      try { 
        graph0.sortVertices((Comparator) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addEdge(vertex0, vertex0);
      graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.sortEdges((Comparator) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Graph graph0 = new Graph();
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      edge0.start = vertex0;
      Vertex vertex1 = edge0.getStart();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      vertex1.neighbors = linkedList0;
      linkedList0.add((Integer) vertex0.VertexNumber);
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex1, vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.addNeighbor((Neighbor) null);
      graph0.addVertex(vertex0);
      // Undeclared exception!
      try { 
        graph0.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex$1", e);
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
  public void test09()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      vertex0.addNeighbor((Neighbor) null);
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
      Vertex vertex0 = graph0.findsVertex("fMw.h=X;h");
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      WorkSpace workSpace0 = new WorkSpace();
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Graph graph0 = new Graph();
      EdgeIter edgeIter0 = graph0.getEdges();
      assertNotNull(edgeIter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      VertexIter vertexIter0 = graph0.getVertices();
      assertNotNull(vertexIter0);
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
      graph0.sortEdges((Comparator) null);
      assertFalse(Graph.isDirected);
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
      WorkSpace workSpace0 = new WorkSpace();
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addEdge(vertex0, vertex0);
      graph0.display();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      graph0.NumberVertices();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      vertex1.name = "S(.v@OQ5Ax6xG9C";
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex1);
      vertex0.name = "S(.v@OQ5Ax6xG9C";
      vertex0.name = "4')rX.OR2>*p-$]";
      EdgeIfc edgeIfc1 = graph0.findsEdge(vertex1, ((Edge) edgeIfc0).start);
      assertEquals(0, edgeIfc1.getWeight());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      vertex1.name = "S(.v@OQ5Ax6xG9C";
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex1);
      vertex0.name = "S(.v@OQ5Ax6xG9C";
      graph0.addEdge(vertex1, ((Edge) edgeIfc0).start);
      vertex0.name = "4')rX.OR2>*p-$]";
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Edge) edgeIfc0).start, ((Edge) edgeIfc0).start);
      assertNull(edgeIfc1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      vertex0.name = "S(.v@OQ5Ax6xG9C";
      Graph graph1 = graph0.Kruskal();
      EdgeIfc edgeIfc1 = graph1.findsEdge(((Edge) edgeIfc0).start, vertex0.representative);
      assertEquals(0, edgeIfc1.getWeight());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex1);
      vertex0.name = "S(.v@OQ5Ax6xG9C";
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex1, ((Edge) edgeIfc0).start);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.name = "S(.v@OQ5Ax6xG9C";
      graph0.addVertex(vertex1);
      graph0.addEdge(vertex0, vertex1);
      // Undeclared exception!
      try { 
        graph0.Kruskal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      graph0.sortVertices(comparator0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "";
      graph0.addEdge(vertex0, vertex0);
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      graph0.addVertex(vertex0);
      edgeIfc0.setWeight((-42));
      graph0.run(((Edge) edgeIfc0).start);
      Graph graph1 = graph0.Kruskal();
      assertFalse(graph1.equals((Object)graph0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addEdge(vertex0, vertex0);
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      edgeIfc0.setWeight((-42));
      // Undeclared exception!
      try { 
        graph0.run(((Edge) edgeIfc0).start);
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
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      graph0.addEdge(vertex0, ((Edge) edgeIfc0).start);
      // Undeclared exception!
      try { 
        graph0.Kruskal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }
}
