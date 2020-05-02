/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 07:40:47 GMT 2020
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
      vertex0.name = "";
      graph0.addVertex(vertex0);
      Vertex vertex1 = graph0.findsVertex("");
      assertEquals(0, vertex1.key);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("");
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      edge0.EdgeConstructor(vertex0, vertex1, 2541);
      Edge edge1 = (Edge)graph0.findsEdge(edge0.start, edge0.start);
      assertEquals(2541, edge1.getWeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.assignName("");
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      edgeIfc0.setWeight((-3127));
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Edge) edgeIfc0).start, ((Edge) edgeIfc0).start);
      assertSame(edgeIfc0, edgeIfc1);
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
      linkedList0.add("GPL.Vertex");
      // Undeclared exception!
      try { 
        graph0.findsEdge(vertex0, (Vertex) null);
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
      edge0.EdgeConstructor(vertex0, (Vertex) null, 0);
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
      Vertex vertex0 = graph0.findsVertex("{JC");
      assertNull(vertex0);
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
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.display();
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      graph0.addVertex(vertex0);
      WorkSpace workSpace0 = new WorkSpace();
      graph0.GraphSearch(workSpace0);
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
      vertex0.name = "{I`h8;v,9@N@TD[";
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      edge0.EdgeConstructor(vertex1, edge0.end);
      vertex1.assignName("x8y\";6@*-k=I!Z/");
      Edge edge1 = (Edge)graph0.findsEdge(edge0.end, vertex1);
      assertSame(edge1, edge0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = null;
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      vertex0.name = "U%E1Q^6.98'y,iGH'[a";
      Vertex vertex1 = new Vertex();
      edge0.EdgeConstructor(edge0.start, vertex1);
      graph0.addEdge(vertex1, edge0.start);
      Vertex vertex2 = vertex1.assignName("U%E1Q^6.98'y,ilH'[a");
      Edge edge1 = (Edge)graph0.findsEdge(vertex2, edge0.end);
      assertNull(edge1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = "{I`h8;v,9@N@TD[";
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      EdgeIfc edgeIfc1 = graph0.findsEdge(((Neighbor) edgeIfc0).end, vertex1);
      assertNull(edgeIfc1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = new Vertex();
      Edge edge0 = (Edge)graph0.addEdge(vertex1, vertex1);
      edge0.EdgeConstructor(vertex0, edge0.end);
      edge0.start.assignName("x8y\";6@*-k=I!Z/");
      // Undeclared exception!
      try { 
        graph0.findsEdge(edge0.end, edge0.start);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.name = "{I`h8;v,9@N@TD[";
      graph0.addVertex(vertex1);
      Edge edge0 = (Edge)graph0.addEdge(vertex1, vertex1);
      edge0.EdgeConstructor(vertex0, edge0.end);
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
  public void test24()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = null;
      graph0.addVertex(vertex0);
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex0, vertex0);
      vertex0.name = "U%E1Q^6.98'y,iGH'[a";
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      graph0.addEdge(vertex1, edge0.start);
      edge0.EdgeConstructor(vertex1, ((Neighbor) edgeIfc0).end);
      Edge edge1 = (Edge)graph0.addEdge(((Edge) edgeIfc0).start, edge0.start);
      graph0.Prim(edge1.end);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Graph graph0 = new Graph();
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      graph0.sortVertices(comparator0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Graph graph0 = new Graph();
      Comparator<Edge> comparator0 = (Comparator<Edge>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      graph0.sortEdges(comparator0);
      assertFalse(Graph.isDirected);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.run(vertex0);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      vertex0.name = null;
      graph0.addVertex(vertex0);
      Edge edge0 = (Edge)graph0.addEdge(vertex0, vertex0);
      vertex0.name = "U%E1Q^6.98'y,iGH'[a";
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      edge0.EdgeConstructor(edge0.start, vertex1);
      graph0.addEdge(vertex1, edge0.start);
      graph0.Prim(edge0.end);
      assertEquals(0, vertex0.key);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Graph graph0 = new Graph();
      Vertex vertex0 = new Vertex();
      graph0.addVertex(vertex0);
      Vertex vertex1 = new Vertex();
      vertex1.name = "{I`h8;v,9@N@TD[";
      graph0.addVertex(vertex1);
      EdgeIfc edgeIfc0 = graph0.addEdge(vertex1, vertex1);
      Edge edge0 = (Edge)graph0.addEdge(vertex1, vertex1);
      Vertex vertex2 = new Vertex();
      edge0.EdgeConstructor(vertex2, ((Neighbor) edgeIfc0).end);
      Edge edge1 = (Edge)graph0.addEdge(((Edge) edgeIfc0).start, edge0.start);
      graph0.Prim(edge1.end);
      assertEquals(0, vertex1.key);
  }
}
