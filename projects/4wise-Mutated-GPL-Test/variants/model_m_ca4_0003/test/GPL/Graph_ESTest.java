/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 05:02:29 GMT 2020
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
      graph0.addVertex(vertex0);
      vertex0.assignName(" W%/Vj");
      Graph graph1 = graph0.Kruskal();
      Vertex vertex1 = graph1.findsVertex(" W%/Vj");
      assertEquals(" W%/Vj", vertex1.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      edgeIfc0.setWeight(1);
      vertex0.assignName(" W%/Vj");
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).end, ((Neighbor) edgeIfc0).end);
      assertSame(edgeIfc0, edgeIfc1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      edge0.EdgeConstructor(vertex0, vertex0, (-1));
      vertex0.assignName(" W%/Vj");
      Edge edge1 = (Edge)graph0.findsEdge(edge0.end, edge0.end);
      assertSame(edge1, edge0);
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
         // GPL.Vertex cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.ComparableTimSort", e);
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
         // GPL.Edge cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addEdge(vertex0, vertex0);
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
  public void test06()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Graph graph1 = graph0.Kruskal();
      graph1.addVertex(vertex0);
      graph1.run(vertex0);
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      edge0.edge = edge0;
      Vertex vertex1 = edge0.getOtherVertex(edge0.start);
      vertex1.members = vertex0.neighbors;
      vertex1.name = ":p0=fIXPe0";
      Vertex vertex2 = new Vertex();
      vertex2.addNeighbor(edge0.edge);
      edge0.start = vertex2;
      vertex2.members = edge0.start.neighbors;
      vertex2.representative = edge0.start;
      // Undeclared exception!
      try { 
        graph0.run(edge0.start);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Edge cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      LinkedList<Object> linkedList0 = new LinkedList<Object>(vertex0.neighbors);
      linkedList0.add((Object) vertex0.componentNumber);
      vertex0.neighbors = linkedList0;
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex0, vertex0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      graph0.GraphSearch(workSpace0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Graph graph0 = new Graph();
      graph0.ConnectedComponents();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Graph graph0 = new Graph();
      EdgeIter edgeIter0 = graph0.getEdges();
      Vertex vertex0 = new Vertex();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      vertex0.neighbors = linkedList0;
      linkedList0.add((Object) edgeIter0);
      graph0.addVertex(vertex0);
      // Undeclared exception!
      try { 
        graph0.display();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Graph$2 cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Graph graph0 = new Graph();
      VertexIter vertexIter0 = graph0.getVertices();
      assertNotNull(vertexIter0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Graph graph0 = new Graph();
      Comparator<Vertex> comparator0 = (Comparator<Vertex>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      graph0.sortEdges(comparator0);
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
      Graph graph1 = graph0.Kruskal();
      graph1.addVertex(vertex0);
      graph1.run(vertex0);
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = edge0.getOtherVertex(edge0.start);
      vertex1.members = vertex0.neighbors;
      vertex1.name = ":p0=fIXPe0";
      Vertex vertex2 = new Vertex();
      vertex2.addNeighbor(edge0.edge);
      edge0.start = vertex2;
      vertex2.members = edge0.start.neighbors;
      vertex2.representative = edge0.start;
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
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Graph graph1 = graph0.Kruskal();
      graph1.addVertex(vertex0);
      graph1.run(vertex0);
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      edge0.edge = edge0;
      Vertex vertex1 = edge0.getOtherVertex(edge0.start);
      vertex1.members = vertex0.neighbors;
      Vertex vertex2 = new Vertex();
      vertex2.addNeighbor(edge0.edge);
      edge0.start = vertex2;
      vertex2.members = edge0.start.neighbors;
      vertex2.representative = edge0.start;
      vertex2.assignName("t>KM>G1[A");
      edge0.EdgeConstructor(edge0.edge.end, vertex2, 2356);
      // Undeclared exception!
      try { 
        graph0.Kruskal();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Edge cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      vertex0.name = "w{X\"yUY{aOZ.gFc'\u0005G";
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      edge0.start = vertex1;
      vertex1.members = edge0.start.neighbors;
      vertex1.representative = edge0.start;
      graph0.addEdge(edge0.start, vertex0);
      // Undeclared exception!
      try { 
        graph0.Kruskal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = edge0.getOtherVertex(edge0.start);
      vertex1.name = ":p0=fIXPe0";
      Vertex vertex2 = new Vertex();
      edge0.start = vertex2;
      vertex2.members = edge0.start.neighbors;
      vertex2.representative = edge0.start;
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
  public void test23()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.addEdge(vertex0, vertex0);
      vertex0.assignName(" W%/Vj");
      Graph graph1 = graph0.Kruskal();
      assertFalse(graph1.equals((Object)graph0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "w{X\"yUY{aOZ.gFc'\u0005G";
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      edge0.start = vertex1;
      vertex1.assignName("t>KM>eG1A");
      Edge edge1 = (Edge)graph0.findsEdge(edge0.end, vertex1);
      assertSame(edge0, edge1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      vertex0.assignName("u>KM>ew1A");
      Vertex vertex1 = new Vertex();
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).end, vertex1);
      assertNull(edgeIfc1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "w{X\"yUY{aOZ.gFc'\u0005G";
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      edge0.start = vertex1;
      vertex1.representative = edge0.start;
      vertex1.assignName("t>KM>eG1A");
      graph0.addEdge(edge0.start, vertex0);
      Edge edge1 = (Edge)graph0.findsEdge(edge0.start, vertex1.representative);
      assertNull(edge1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "w{X\"yUY{aOZ.gFc'\u0005G";
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      // Undeclared exception!
      try { 
        graph0.findsEdge(((Edge) edgeIfc0).start, ((Neighbor) edgeIfc0).end.representative);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = graph0.findsVertex((String) null);
      assertNull(vertex0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Graph graph0 = new Graph();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      graph0.sortVertices(comparator0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      EdgeIfc edgeIfc1 = graph0.addEdge(((Edge) edgeIfc0).start, ((Edge) edgeIfc0).start);
      edgeIfc1.setWeight(1184);
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
  public void test31()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      edgeIfc0.setWeight(1184);
      graph0.addEdge(((Edge) edgeIfc0).start, ((Neighbor) edgeIfc0).end);
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
