/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 07:10:38 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.CycleWorkSpace;
import GPL.Edge;
import GPL.Vertex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CycleWorkSpace_ESTest extends CycleWorkSpace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex0);
      Vertex vertex1 = new Vertex();
      cycleWorkSpace0.counter = 558;
      cycleWorkSpace0.preVisitAction(vertex1);
      cycleWorkSpace0.checkNeighborAction(vertex1, vertex0);
      assertEquals(1, vertex1.VertexColor);
      assertEquals(559, cycleWorkSpace0.counter);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(vertex0, vertex0);
      cycleWorkSpace0.postVisitAction(edge0.start);
      assertEquals((-1), cycleWorkSpace0.counter);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      // Undeclared exception!
      try { 
        cycleWorkSpace0.preVisitAction((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.CycleWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(true);
      // Undeclared exception!
      try { 
        cycleWorkSpace0.init_vertex((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.CycleWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.init_vertex(vertex0);
      assertEquals(Integer.MAX_VALUE, vertex0.VertexCycle);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Edge edge0 = new Edge();
      // Undeclared exception!
      try { 
        cycleWorkSpace0.postVisitAction(edge0.end);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.CycleWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex0);
      Vertex vertex1 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex1);
      cycleWorkSpace0.checkNeighborAction(vertex1, vertex0);
      assertEquals(1, vertex1.VertexCycle);
      assertEquals(1, vertex0.VertexColor);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex0);
      cycleWorkSpace0.checkNeighborAction(vertex0, vertex0);
      assertEquals(1, vertex0.VertexColor);
      assertFalse(cycleWorkSpace0.isDirected);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex0);
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      cycleWorkSpace0.checkNeighborAction(edge0.end, vertex1);
      assertEquals(1, cycleWorkSpace0.counter);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex0);
      Edge edge0 = new Edge();
      // Undeclared exception!
      try { 
        cycleWorkSpace0.checkNeighborAction(vertex0, edge0.start);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.CycleWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(true);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex0);
      Edge edge0 = new Edge();
      edge0.EdgeConstructor(vertex0, vertex0);
      Vertex vertex1 = new Vertex();
      cycleWorkSpace0.checkNeighborAction(edge0.start, vertex1);
      assertEquals(1, cycleWorkSpace0.counter);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(true);
      Vertex vertex0 = new Vertex();
      cycleWorkSpace0.preVisitAction(vertex0);
      cycleWorkSpace0.checkNeighborAction(vertex0, vertex0);
      assertEquals(1, vertex0.VertexColor);
      assertEquals(1, cycleWorkSpace0.counter);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(true);
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      cycleWorkSpace0.checkNeighborAction(vertex0, edge0.start);
      assertEquals(0, cycleWorkSpace0.counter);
      assertFalse(cycleWorkSpace0.AnyCycles);
      assertTrue(cycleWorkSpace0.isDirected);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      Edge edge0 = new Edge();
      cycleWorkSpace0.checkNeighborAction(vertex0, edge0.end);
      assertFalse(cycleWorkSpace0.isDirected);
      assertEquals(0, cycleWorkSpace0.counter);
      assertFalse(cycleWorkSpace0.AnyCycles);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CycleWorkSpace cycleWorkSpace0 = new CycleWorkSpace(false);
      Vertex vertex0 = new Vertex();
      vertex0.nodeSearch(cycleWorkSpace0);
      cycleWorkSpace0.preVisitAction(vertex0);
      assertEquals(2, vertex0.VertexColor);
      assertEquals(0, cycleWorkSpace0.counter);
  }
}
