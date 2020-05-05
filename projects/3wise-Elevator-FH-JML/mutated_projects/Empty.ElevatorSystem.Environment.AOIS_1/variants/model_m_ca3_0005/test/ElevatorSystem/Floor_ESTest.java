/*
 * This file was automatically generated by EvoSuite
 * Mon May 04 18:15:31 GMT 2020
 */

package ElevatorSystem;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ElevatorSystem.Elevator;
import ElevatorSystem.Environment;
import ElevatorSystem.Floor;
import ElevatorSystem.Person;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Floor_ESTest extends Floor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Environment environment0 = new Environment(434);
      Floor floor0 = new Floor(environment0, 0);
      floor0.getFloorID();
      int int0 = 0;
      Environment environment1 = null;
      try {
        environment1 = new Environment((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Floor floor0 = new Floor(environment0, 4);
      floor0.callElevator();
      floor0.hasCall();
      Person person0 = null;
      try {
        person0 = new Person("]ap36#b88]`", 4591, 0, 0, environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Environment environment0 = new Environment(1782);
      Floor floor0 = new Floor(environment0, (-132));
      Floor[] floorArray0 = new Floor[3];
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[1] = floor1;
      floorArray0[2] = floor0;
      environment0.floors = floorArray0;
      Person person0 = new Person("", 1782, 0, (-132), environment0);
      floor0.addWaitingPerson(person0);
      Elevator elevator0 = new Elevator(environment0, false, (-132), false);
      // Undeclared exception!
      try { 
        floor0.processWaitingPersons(elevator0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -132
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Environment environment0 = new Environment(4);
      Floor floor0 = new Floor(environment0, 4);
      floor0.reset();
      floor0.getFloorID();
      floor0.callElevator();
      assertTrue(floor0.hasCall());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Floor floor0 = new Floor((Environment) null, (-5050));
      floor0.reset();
      floor0.addWaitingPerson((Person) null);
      floor0.reset();
      floor0.getFloorID();
      floor0.reset();
      floor0.getFloorID();
      floor0.hasCall();
      floor0.addWaitingPerson((Person) null);
      Environment environment0 = null;
      try {
        environment0 = new Environment((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Floor floor0 = new Floor((Environment) null, 0);
      int int0 = 395;
      Environment environment0 = new Environment(0);
      Floor[] floorArray0 = new Floor[2];
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, 395);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      Person person0 = new Person("", 0, 0, 395, environment0);
      person0.leaveElevator();
      person0.leaveElevator();
      floor0.addWaitingPerson(person0);
      floor0.reset();
      floor0.reset();
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        floor0.processWaitingPersons((Elevator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Floor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = (-2559);
      Environment environment0 = null;
      try {
        environment0 = new Environment((-2559));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Floor floor0 = new Floor(environment0, 0);
      String string0 = null;
      int int0 = 1308;
      int int1 = 3021;
      Elevator elevator0 = new Elevator(environment0, true);
      floor0.processWaitingPersons(elevator0);
      Person person0 = null;
      try {
        person0 = new Person("W?ati!", 0, 1308, 0, environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1308
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Environment environment0 = new Environment(1908);
      Floor[] floorArray0 = new Floor[0];
      environment0.floors = floorArray0;
      Floor floor0 = new Floor(environment0, 653);
      floor0.reset();
      floor0.reset();
      Person person0 = null;
      try {
        person0 = new Person("q@", 1908, 1908, (-1505), environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1908
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Environment environment0 = new Environment(0);
      environment0.floors = null;
      Floor floor0 = new Floor(environment0, 1804);
      floor0.callElevator();
      floor0.callElevator();
      Person person0 = null;
      try {
        person0 = new Person((String) null, 100, 0, 2027, environment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }
}