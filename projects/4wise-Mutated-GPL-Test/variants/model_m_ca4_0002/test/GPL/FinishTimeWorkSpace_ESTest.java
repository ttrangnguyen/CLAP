/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 04:58:04 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import GPL.FinishTimeWorkSpace;
import GPL.Vertex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FinishTimeWorkSpace_ESTest extends FinishTimeWorkSpace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FinishTimeWorkSpace finishTimeWorkSpace0 = new FinishTimeWorkSpace();
      // Undeclared exception!
      try { 
        finishTimeWorkSpace0.preVisitAction((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.FinishTimeWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FinishTimeWorkSpace finishTimeWorkSpace0 = new FinishTimeWorkSpace();
      // Undeclared exception!
      try { 
        finishTimeWorkSpace0.postVisitAction((Vertex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("GPL.FinishTimeWorkSpace", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FinishTimeWorkSpace finishTimeWorkSpace0 = new FinishTimeWorkSpace();
      Vertex vertex0 = new Vertex();
      finishTimeWorkSpace0.preVisitAction(vertex0);
      assertEquals(0, vertex0.strongComponentNumber);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FinishTimeWorkSpace finishTimeWorkSpace0 = new FinishTimeWorkSpace();
      Vertex vertex0 = new Vertex();
      vertex0.visited = true;
      finishTimeWorkSpace0.preVisitAction(vertex0);
      assertEquals(0, vertex0.VertexColor);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FinishTimeWorkSpace finishTimeWorkSpace0 = new FinishTimeWorkSpace();
      Vertex vertex0 = new Vertex();
      finishTimeWorkSpace0.postVisitAction(vertex0);
      assertEquals(1, vertex0.finishTime);
  }
}
