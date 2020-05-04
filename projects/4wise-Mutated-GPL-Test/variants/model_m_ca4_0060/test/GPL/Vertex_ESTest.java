/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 07:45:36 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.Neighbor;
import GPL.Vertex;
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
      Vertex vertex1 = vertex0.assignName("(~`{lo6XCN nRg1");
      vertex1.getName();
      assertFalse(vertex1.visited);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.name = "";
      neighbor0.neighbor.getName();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor();
      vertex0.addEdge(neighbor0);
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
      LinkedList<String> linkedList0 = new LinkedList<String>();
      vertex0.adjacentNeighbors = linkedList0;
      linkedList0.add("(a'B#2oRxzw");
      WorkSpace workSpace0 = new WorkSpace();
      // Undeclared exception!
      try { 
        vertex0.nodeSearch(workSpace0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to GPL.Neighbor
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
      Vertex vertex1 = vertex0.assignName(" ZV[vHeV,");
      vertex1.adjacentNeighbors = null;
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
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor();
      neighbor0.NeighborConstructor(vertex0);
      Neighbor neighbor1 = new Neighbor();
      neighbor0.neighbor.addEdge(neighbor1);
      // Undeclared exception!
      try { 
        neighbor0.neighbor.display();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.Vertex", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      vertex0.adjacentNeighbors = linkedList0;
      linkedList0.offerFirst("0$5|ol41]dr7z");
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
  public void test08()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.adjacentNeighbors = null;
      // Undeclared exception!
      try { 
        vertex0.addEdge(neighbor0);
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
      Vertex vertex0 = new Vertex();
      assertFalse(vertex0.visited);
      
      WorkSpace workSpace0 = new WorkSpace();
      vertex0.nodeSearch(workSpace0);
      vertex0.nodeSearch(workSpace0);
      assertTrue(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.neighbor.getName();
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor();
      neighbor0.NeighborConstructor(vertex0);
      neighbor0.neighbor.VertexConstructor();
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
      assertFalse(vertex0.visited);
      
      WorkSpace workSpace0 = new WorkSpace();
      vertex0.nodeSearch(workSpace0);
      vertex0.display();
      assertTrue(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      neighbor0.neighbor.adjustAdorns(neighbor0);
      assertFalse(vertex0.visited);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vertex vertex0 = new Vertex();
      Neighbor neighbor0 = new Neighbor(vertex0);
      vertex0.addEdge(neighbor0);
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
}