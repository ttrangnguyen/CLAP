/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 20:14:31 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ElevatorSystem.Environment;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PL_Interface_impl_ESTest extends PL_Interface_impl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        PL_Interface_impl.listToString((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("PL_Interface_impl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-5104));
      pL_Interface_impl0.randomSequenceOfActions(1);
      pL_Interface_impl0.Specification13();
      PL_Interface_impl.actionHistory = null;
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.getExecutedActions();
      PL_Interface_impl.actionHistory = null;
      pL_Interface_impl0.getExecutedActions();
      pL_Interface_impl0.Specification3();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ":";
      stringArray0[1] = "C";
      PL_Interface_impl.main(stringArray0);
      PL_Interface_impl.main(stringArray0);
      PL_Interface_impl.main(stringArray0);
      PL_Interface_impl.main(stringArray0);
      // Undeclared exception!
      try { 
        pL_Interface_impl0.randomSequenceOfActions((-5104));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.start(384, 384);
      pL_Interface_impl0.isAbortedRun();
      int int0 = 1;
      // Undeclared exception!
      pL_Interface_impl0.Specification1();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.start((-1), (-1));
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-1));
      pL_Interface_impl0.checkOnlySpecification((-1));
      pL_Interface_impl0.Specification14();
      PL_Interface_impl.executedUnimplementedAction = false;
      PL_Interface_impl.getIntegerMinMax((-1), (-1));
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.checkOnlySpecification(1);
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.test(1, (-1));
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.env = null;
      pL_Interface_impl0.Specification14();
      List<String> list0 = pL_Interface_impl0.getExecutedActions();
      pL_Interface_impl0.Specification14();
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.checkOnlySpecification((-1));
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.randomSequenceOfActions((-2733));
      pL_Interface_impl0.Specification13();
      PL_Interface_impl.main((String[]) null);
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.Specification1();
      PL_Interface_impl.getIntegerMinMax((-1), (-1));
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.Specification14();
      PL_Interface_impl.getBoolean();
      PL_Interface_impl.listToString(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PL_Interface_impl.main((String[]) null);
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.Specification9();
      int int0 = 517;
      pL_Interface_impl0.test(517, 517);
      PL_Interface_impl.getIntegerMinMax(24, 24);
      // Undeclared exception!
      pL_Interface_impl0.Specification2();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PL_Interface_impl.getBoolean();
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.start(24, 24);
      pL_Interface_impl0.checkOnlySpecification(24);
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.checkOnlySpecification(24);
      pL_Interface_impl0.randomSequenceOfActions(24);
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.Specification14();
      // Undeclared exception!
      pL_Interface_impl0.Specification13();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification2();
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-3487));
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.Specification13();
      pL_Interface_impl0.test((-3487), (-3487));
      pL_Interface_impl0.Specification13();
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.getExecutedActions();
      PL_Interface_impl.getIntegerMinMax(0, 1120);
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.Specification13();
      PL_Interface_impl.getIntegerMinMax((-3487), 0);
      int int0 = 1505;
      pL_Interface_impl0.start(1505, 159);
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-3487));
      // Undeclared exception!
      pL_Interface_impl0.Specification14();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      PL_Interface_impl.actionHistory = pL_Interface_impl0.actionHistory;
      List<String> list0 = pL_Interface_impl0.getExecutedActions();
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.Specification13();
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.test((-1), (-1));
      PL_Interface_impl.actionHistory = list0;
      PL_Interface_impl.executedUnimplementedAction = false;
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.Specification2();
      int int0 = 24;
      pL_Interface_impl0.start(0, 24);
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.getExecutedActions();
      int int1 = 716;
      pL_Interface_impl0.Specification3();
      PL_Interface_impl.getIntegerMinMax(716, 716);
      pL_Interface_impl0.Specification9();
      PL_Interface_impl.getBoolean();
      PL_Interface_impl.getIntegerMinMax(0, 716);
      pL_Interface_impl0.test(0, 24);
      // Undeclared exception!
      pL_Interface_impl0.Specification3();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      PL_Interface_impl.getBoolean();
      int int0 = 0;
      pL_Interface_impl0.randomSequenceOfActions(0);
      int int1 = (-987);
      pL_Interface_impl0.test(5, (-987));
      pL_Interface_impl0.randomSequenceOfActions(0);
      int int2 = 1;
      pL_Interface_impl0.test((-987), 1);
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.checkOnlySpecification(574);
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      pL_Interface_impl0.test(0, 574);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification9();
      PL_Interface_impl.actionHistory = pL_Interface_impl0.actionHistory;
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.test((-246), (-246));
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.modifiedrandomSequenceOfActions(731);
      pL_Interface_impl0.checkOnlySpecification((-1));
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.Specification9();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      Environment environment0 = null;
      pL_Interface_impl0.env = null;
      pL_Interface_impl0.Specification2();
      pL_Interface_impl0.start(1638, 1638);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      pL_Interface_impl0.randomSequenceOfActions(0);
      stringArray0[1] = "r_hD_gi|d8S";
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      stringArray0[2] = "l':WdOLj#4c&_g,=";
      stringArray0[3] = "lSZ#0";
      stringArray0[4] = "";
      stringArray0[5] = "";
      pL_Interface_impl0.Specification2();
      stringArray0[6] = "ElevatorSystem.Environment";
      stringArray0[7] = "jld%wIqW*MX";
      PL_Interface_impl.main(stringArray0);
      pL_Interface_impl0.checkOnlySpecification(0);
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.Specification2();
      // Undeclared exception!
      pL_Interface_impl0.modifiedrandomSequenceOfActions(2395);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification9();
      Environment environment0 = new Environment(1780);
      pL_Interface_impl0.env = environment0;
      PL_Interface_impl.actionHistory = pL_Interface_impl0.actionHistory;
      pL_Interface_impl0.randomSequenceOfActions(170);
      PL_Interface_impl.listToString(PL_Interface_impl.actionHistory);
      // Undeclared exception!
      pL_Interface_impl0.Specification9();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.randomSequenceOfActions((-2460));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.checkOnlySpecification((-1));
      pL_Interface_impl0.Specification13();
      PL_Interface_impl.getIntegerMinMax(0, (-370));
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.getExecutedActions();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "ElevatorSystem.Floor";
      stringArray0[1] = "";
      stringArray0[2] = "ElevatorSystem.Floor";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "F;;wTH";
      stringArray0[7] = "_GlAs}DId~^Dfu>";
      PL_Interface_impl.main(stringArray0);
      // Undeclared exception!
      pL_Interface_impl0.randomSequenceOfActions(1505);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "5";
      stringArray0[1] = "no Exception";
      stringArray0[2] = "~K!2d8>P";
      pL_Interface_impl0.modifiedrandomSequenceOfActions(24);
      PL_Interface_impl.main(stringArray0);
      PL_Interface_impl.getIntegerMinMax(0, 0);
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.start(24, (-1));
      pL_Interface_impl0.modifiedrandomSequenceOfActions(24);
      pL_Interface_impl0.checkOnlySpecification((-1));
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.Specification13();
      pL_Interface_impl0.start(370, 24);
      PL_Interface_impl.getIntegerMinMax(0, 0);
      List<String> list0 = pL_Interface_impl0.getExecutedActions();
      PL_Interface_impl.actionHistory = list0;
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.modifiedrandomSequenceOfActions(24);
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      pL_Interface_impl0.test(24, (-1));
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      PL_Interface_impl.listToString(PL_Interface_impl.actionHistory);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Environment environment0 = new Environment(0);
      PL_Interface_impl.getBoolean();
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification9();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.start((-1), 6);
      pL_Interface_impl0.test((-651), (-651));
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.Specification3();
      PL_Interface_impl.getIntegerMinMax((-4185), (-4185));
      pL_Interface_impl0.modifiedrandomSequenceOfActions(1743);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.start(0, (-828));
      PL_Interface_impl.actionHistory = pL_Interface_impl0.actionHistory;
      pL_Interface_impl0.Specification14();
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.checkOnlySpecification((-2920));
      pL_Interface_impl0.Specification13();
      pL_Interface_impl0.modifiedrandomSequenceOfActions(0);
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-2920));
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.isAbortedRun();
      String[] stringArray0 = new String[2];
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      stringArray0[0] = "";
      stringArray0[1] = "ElevatorSystem.Environment";
      PL_Interface_impl.listToString(PL_Interface_impl.actionHistory);
      PL_Interface_impl.main(stringArray0);
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.modifiedrandomSequenceOfActions(547);
      pL_Interface_impl0.modifiedrandomSequenceOfActions(0);
      PL_Interface_impl.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification2();
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.randomSequenceOfActions(1);
      pL_Interface_impl0.Specification3();
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      pL_Interface_impl0.Specification2();
      pL_Interface_impl0.Specification13();
      pL_Interface_impl0.checkOnlySpecification(1);
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-4));
      pL_Interface_impl0.Specification13();
      PL_Interface_impl.getIntegerMinMax((-4), (-4));
      pL_Interface_impl0.Specification2();
      pL_Interface_impl0.start(3, 0);
      pL_Interface_impl0.start((-1818), 0);
      pL_Interface_impl0.Specification9();
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.test((-620), 0);
      assertFalse(pL_Interface_impl0.isAbortedRun());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      PL_Interface_impl.getIntegerMinMax((-1), (-148));
      int int0 = PL_Interface_impl.getIntegerMinMax((-1), 1172);
      assertEquals(116, int0);
      
      String string0 = PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      assertEquals("", string0);
      
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-92));
      pL_Interface_impl0.Specification1();
      pL_Interface_impl0.Specification2();
      pL_Interface_impl0.Specification2();
      PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      pL_Interface_impl0.test(1172, (-92));
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.getExecutedActions();
      pL_Interface_impl0.Specification2();
      pL_Interface_impl0.Specification2();
      String string1 = PL_Interface_impl.listToString(pL_Interface_impl0.actionHistory);
      assertEquals(" StartFromTop StartFromTop", string1);
      
      boolean boolean0 = PL_Interface_impl.getBoolean();
      assertTrue(boolean0);
      
      pL_Interface_impl0.env = null;
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.Specification3();
      String[] stringArray0 = new String[0];
      pL_Interface_impl0.Specification13();
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-1));
      PL_Interface_impl.main(stringArray0);
      pL_Interface_impl0.getExecutedActions();
      pL_Interface_impl0.getExecutedActions();
      PL_Interface_impl.main(stringArray0);
      PL_Interface_impl.main(stringArray0);
      List<String> list0 = pL_Interface_impl0.getExecutedActions();
      assertFalse(list0.contains(string0));
      assertEquals(18, list0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.start((-1), (-1));
      pL_Interface_impl0.modifiedrandomSequenceOfActions((-1));
      pL_Interface_impl0.checkOnlySpecification((-1));
      pL_Interface_impl0.Specification14();
      PL_Interface_impl.executedUnimplementedAction = false;
      PL_Interface_impl.getIntegerMinMax((-1), (-1));
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.checkOnlySpecification(1);
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.start(18, (-1));
      pL_Interface_impl0.test(1, (-1));
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.env = null;
      pL_Interface_impl0.Specification14();
      List<String> list0 = pL_Interface_impl0.getExecutedActions();
      pL_Interface_impl0.Specification14();
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.checkOnlySpecification((-1));
      pL_Interface_impl0.Specification9();
      pL_Interface_impl0.randomSequenceOfActions((-2733));
      pL_Interface_impl0.Specification13();
      PL_Interface_impl.main((String[]) null);
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.Specification1();
      PL_Interface_impl.getIntegerMinMax((-1), (-1));
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.Specification3();
      pL_Interface_impl0.Specification14();
      PL_Interface_impl.getBoolean();
      String string0 = PL_Interface_impl.listToString(list0);
      assertEquals(7, list0.size());
      assertEquals(" StartFromTop StartFromTop StartFromTop monicaCall monicaCall bigMacCall 1TS", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PL_Interface_impl pL_Interface_impl0 = new PL_Interface_impl();
      pL_Interface_impl0.Specification9();
      PL_Interface_impl.executedUnimplementedAction = true;
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.start(0, (-1444));
      PL_Interface_impl.getBoolean();
      PL_Interface_impl.getIntegerMinMax((-1444), (-1444));
      boolean boolean0 = PL_Interface_impl.getBoolean();
      pL_Interface_impl0.Specification14();
      List<String> list0 = pL_Interface_impl0.getExecutedActions();
      Environment environment0 = pL_Interface_impl0.env;
      pL_Interface_impl0.env = environment0;
      pL_Interface_impl0.Specification14();
      pL_Interface_impl0.checkOnlySpecification(0);
      pL_Interface_impl0.checkOnlySpecification((-1413));
      pL_Interface_impl0.Specification3();
      PL_Interface_impl.getIntegerMinMax((-2624), 6);
      pL_Interface_impl0.Specification13();
      PL_Interface_impl.listToString(list0);
      PL_Interface_impl.getBoolean();
      pL_Interface_impl0.isAbortedRun();
      List<String> list1 = pL_Interface_impl0.getExecutedActions();
      String string0 = PL_Interface_impl.listToString(list1);
      assertEquals(" StartFromTop", string0);
      
      pL_Interface_impl0.isAbortedRun();
      pL_Interface_impl0.Specification3();
      boolean boolean1 = PL_Interface_impl.getBoolean();
      assertFalse(boolean1 == boolean0);
      
      pL_Interface_impl0.Specification2();
      int int0 = PL_Interface_impl.getIntegerMinMax(1, 194);
      assertEquals(136, int0);
  }
}