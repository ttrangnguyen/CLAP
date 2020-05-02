/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 06:42:47 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Edge;
import GPL.EdgeIter;
import GPL.Neighbor;
import GPL.Vertex;
import GPL.VertexIter;
import GPL.WorkSpace;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vertex_ESTest extends Vertex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Vertex vertex1 = vertex0.assignName("W1@/H6");
      vertex1.getName();
      assertFalse(vertex1.visited);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(edge0.end, vertex0);
      vertex0.assignName("");
      String string0 = edge0.end.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor();
      vertex0.addNeighbor(neighbor0);
      WorkSpace workSpace0 = new WorkSpace();
      // Undeclared exception!
      try { 
        vertex0.nodeSearch(workSpace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      vertex0.neighbors = linkedList0;
      Object object0 = new Object();
      linkedList0.add(object0);
      WorkSpace workSpace0 = new WorkSpace();
      // Undeclared exception!
      try { 
        vertex0.nodeSearch(workSpace0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      // Undeclared exception!
      try { 
        vertex0.init_vertex((WorkSpace) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(edge0.end, vertex0);
      edge0.end.neighbors = null;
      // Undeclared exception!
      try { 
        edge0.end.getNeighbors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.neighbors = null;
      // Undeclared exception!
      try { 
        vertex0.getEdges();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offer((String) null);
      vertex0.neighbors = linkedList0;
      // Undeclared exception!
      try { 
        vertex0.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      vertex0.neighbors = linkedList0;
      linkedList0.add((Integer) vertex0.strongComponentNumber);
      // Undeclared exception!
      try { 
        vertex0.display();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      vertex0.neighbors = null;
      // Undeclared exception!
      try { 
        vertex0.addNeighbor(edge0);
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
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      Neighbor neighbor0 = new Neighbor(vertex0, edge0);
      assertFalse(vertex0.visited);
      
      WorkSpace workSpace0 = new WorkSpace();
      neighbor0.end.nodeSearch(workSpace0);
      vertex0.nodeSearch(workSpace0);
      assertTrue(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(edge0.end, vertex0);
      String string0 = edge0.end.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.VertexConstructor();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(edge0.end, vertex0);
      VertexIter vertexIter0 = edge0.end.getNeighbors();
      assertNotNull(vertexIter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      assertFalse(vertex0.visited);
      
      WorkSpace workSpace0 = new WorkSpace();
      vertex0.nodeSearch(workSpace0);
      vertex0.display();
      assertTrue(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(edge0.end, vertex0);
      edge0.end.addNeighbor(edge0);
      vertex0.display();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      vertex0.init_vertex(workSpace0);
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(edge0.end, vertex0);
      EdgeIter edgeIter0 = edge0.end.getEdges();
      assertNotNull(edgeIter0);
  }
}
