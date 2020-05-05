/*
 * This file was automatically generated by EvoSuite
 * Mon May 04 18:37:31 GMT 2020
 */

package ElevatorSystem;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ElevatorSystem.Environment;
import ElevatorSystem.Floor;
import ElevatorSystem.Person;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Environment_ESTest extends Environment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, (-22));
      floor0.callElevator();
      environment0.floors = floorArray0;
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      environment0.getFloors();
      environment0.isTopFloor(0);
      Floor[] floorArray1 = environment0.getFloors();
      environment0.floors = floorArray1;
      floor0.callElevator();
      environment0.isTopFloor((-22));
      environment0.getFloor(0);
      // Undeclared exception!
      try { 
        environment0.getFloor(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Floor[] floorArray0 = new Floor[5];
      environment0.floors = floorArray0;
      environment0.getFloor(0);
      floorArray0[0] = null;
      environment0.getFloor(0);
      floorArray0[1] = null;
      int int0 = (-1640);
      Environment environment1 = null;
      try {
        environment1 = new Environment((-1640));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 2794;
      Environment environment0 = new Environment(2794);
      int int1 = 0;
      Floor[] floorArray0 = new Floor[7];
      Environment environment1 = new Environment(2794);
      Floor floor0 = environment1.getFloor(0);
      floorArray0[0] = floor0;
      Floor floor1 = environment0.getFloor(0);
      floorArray0[1] = floor1;
      Environment environment2 = new Environment(4936);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Environment environment0 = new Environment(505);
      environment0.floors = null;
      environment0.getFloors();
      environment0.floors = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        environment0.getFloor(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Environment environment0 = new Environment(0);
      environment0.floors = null;
      environment0.floors = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        environment0.isTopFloor(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Environment environment0 = new Environment(1);
      environment0.floors = null;
      environment0.floors = null;
      // Undeclared exception!
      try { 
        environment0.getFloor(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, 1);
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, 1);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      Floor floor2 = environment0.getFloor(1);
      assertSame(floor2, floor1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Environment environment0 = new Environment(228);
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 0);
      Person person0 = new Person("", (-3407), 1, 1, environment0);
      floor0.addWaitingPerson(person0);
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      environment0.floors = floorArray0;
      environment0.getFloor(0);
      environment0.getFloors();
      boolean boolean0 = environment0.isTopFloor(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Environment environment0 = new Environment(0);
      boolean boolean0 = environment0.isTopFloor((-210));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Environment environment0 = new Environment(1);
      boolean boolean0 = environment0.isTopFloor(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      Environment environment0 = new Environment(0);
      environment0.getFloors();
      // Undeclared exception!
      try { 
        environment0.getFloor(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-74);
      Environment environment0 = null;
      try {
        environment0 = new Environment((-74));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 0;
      Environment environment0 = new Environment(0);
      Floor[] floorArray0 = new Floor[2];
      Environment environment1 = new Environment(1);
      int int1 = (-208);
      // Undeclared exception!
      try { 
        environment1.getFloor((-208));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -208
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 0);
      floor0.callElevator();
      environment0.floors = floorArray0;
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      environment0.getFloors();
      environment0.isTopFloor(0);
      Floor[] floorArray1 = environment0.getFloors();
      environment0.floors = floorArray1;
      floor0.callElevator();
      environment0.isTopFloor(374);
      // Undeclared exception!
      try { 
        environment0.getFloor(374);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 374
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Environment environment0 = new Environment(1);
      // Undeclared exception!
      try { 
        environment0.getFloor(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }
}