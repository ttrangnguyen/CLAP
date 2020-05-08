/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 13:51:20 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Edge;
import GPL.GlobalVarsWrapper;
import GPL.Neighbor;
import GPL.Vertex;
import GPL.WorkSpace;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Vertex_ESTest extends Vertex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.assignName("rbMs9pD");
      vertex0.getName();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.assignName("");
      vertex0.getName();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      Edge edge0 = new Edge();
      edge0.end = vertex0;
      Vertex vertex1 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex1, edge0);
      GlobalVarsWrapper.Queue = vertex0.neighbors;
      edge0.end.addNeighbor(neighbor0);
      // Undeclared exception!
      try { 
        vertex0.nodeSearch(workSpace0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      Vertex vertex1 = vertex0.assignName((String) null);
      Edge edge0 = new Edge();
      Neighbor neighbor0 = new Neighbor(vertex0, edge0);
      vertex0.addNeighbor(neighbor0);
      GlobalVarsWrapper.Queue = vertex1.neighbors;
      // Undeclared exception!
      try { 
        vertex1.nodeSearch(workSpace0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // GPL.Neighbor cannot be cast to GPL.Vertex
         //
         verifyException("GPL.Vertex", e);
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
      vertex0.neighbors = null;
      // Undeclared exception!
      try { 
        vertex0.getNeighbors();
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
      Edge edge0 = new Edge();
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0, edge0);
      vertex0.neighbors = null;
      // Undeclared exception!
      try { 
        neighbor0.end.getEdges();
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
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
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
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      vertex0.neighbors = linkedList0;
      // Undeclared exception!
      try { 
        vertex0.display();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to GPL.Neighbor
         //
         verifyException("GPL.Vertex$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.neighbors = null;
      Neighbor neighbor0 = new Neighbor();
      // Undeclared exception!
      try { 
        vertex0.addNeighbor(neighbor0);
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
      vertex0.getName();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.VertexConstructor();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.getNeighbors();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      Edge edge0 = new Edge();
      edge0.end = vertex0;
      vertex0.nodeSearch(workSpace0);
      edge0.end.display();
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      Edge edge0 = new Edge();
      edge0.end = vertex0;
      Vertex vertex1 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex1, edge0);
      edge0.end.addNeighbor(neighbor0);
      assertFalse(vertex1.visited);
      
      vertex0.nodeSearch(workSpace0);
      assertTrue(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      Edge edge0 = new Edge();
      vertex0.addNeighbor(edge0);
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
  public void test16()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      Edge edge0 = new Edge();
      edge0.end = vertex0;
      vertex0.nodeSearch(workSpace0);
      edge0.end.nodeSearch(workSpace0);
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.end = vertex0;
      vertex0.addNeighbor(edge0);
      edge0.end.display();
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      WorkSpace workSpace0 = new WorkSpace();
      Edge edge0 = new Edge();
      edge0.end = vertex0;
      edge0.end.init_vertex(workSpace0);
      assertEquals(0, edge0.getWeight());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      vertex0.getEdges();
      assertFalse(vertex0.visited);
  }
}