/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 20:14:16 GMT 2020
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
public class Elevator_ESTest extends Elevator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Environment environment0 = new Environment(589);
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 587);
      Elevator elevator0 = new Elevator(environment0, false, (-2250), false);
      floor0.processWaitingPersons(elevator0);
      floorArray0[0] = floor0;
      Elevator elevator1 = new Elevator(environment0, true, 1815, false);
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      elevator1.floorButtons = booleanArray0;
      // Undeclared exception!
      try { 
        elevator1.isIdle();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      elevator0.toString();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      elevator0.isExecutiveFloor(1);
      Person person0 = null;
      try {
        person0 = new Person("T\"_Ld4w", 1, (-1), (-1), environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Environment environment0 = new Environment(589);
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 587);
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, true, (-2250), true);
      floor0.processWaitingPersons(elevator0);
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator1 = new Elevator(environment0, true, 1815, true);
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      elevator1.floorButtons = booleanArray0;
      elevator1.isIdle();
      elevator1.isIdle();
      elevator1.getEnv();
      elevator1.getCurrentFloorID();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("7]&,;[3}UBlE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.7]&,;[3}UBlE
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, true, 1, true);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      Person person0 = new Person("T\"_Ld4w", 1, 0, 0, environment0);
      elevator0.leaveElevator(person0);
      Elevator.Direction.values();
      elevator0.buttonForFloorIsPressed(1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Elevator.DoorState.values();
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.isEmpty();
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, 0);
      floorArray0[0] = floor0;
      Environment environment1 = new Environment(0);
      Floor floor1 = new Floor(environment1, 0);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      int int0 = 2108;
      environment0.floors = floorArray0;
      Environment environment2 = new Environment(2);
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      elevator0.floorButtons = booleanArray0;
      Floor[] floorArray1 = new Floor[1];
      elevator0.timeShift();
      Floor floor2 = new Floor(environment2, 1302);
      floorArray1[0] = floor2;
      environment2.floors = floorArray1;
      Person person0 = null;
      try {
        person0 = new Person("I3", 2108, 2459, 2459, environment2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2459
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, true, 1, true);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      elevator0.toString();
      Elevator.DoorState.values();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      Person person0 = new Person("T\"_Ld4w", 1, 0, 0, environment0);
      elevator0.leaveElevator(person0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      int int0 = 1;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      environment0.floors = null;
      // Undeclared exception!
      try { 
        elevator0.isExecutiveFloorCalling();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      int int0 = 1;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      String string0 = "T\"_Ld4w";
      // Undeclared exception!
      elevator0.timeShift();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, true, 1, true);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      Person person0 = new Person("T\"_Ld4w", 1, 0, 0, environment0);
      elevator0.leaveElevator(person0);
      elevator0.isIdle();
      elevator0.isBlocked();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Environment environment0 = new Environment(589);
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 589);
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, (-2250), false);
      floor0.processWaitingPersons(elevator0);
      environment0.floors = floorArray0;
      Elevator elevator1 = new Elevator(environment0, true, 1815, false);
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      elevator1.floorButtons = booleanArray0;
      // Undeclared exception!
      try { 
        elevator1.isIdle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Environment environment0 = new Environment(2);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, 2);
      floorArray0[0] = floor0;
      floorArray0[1] = floor0;
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[2] = floor1;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, (-1), true);
      elevator0.getCurrentDirection();
      elevator0.getCurrentFloorID();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, false, 4, false);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      Person person0 = null;
      try {
        person0 = new Person("T\"_Ld4w", 4, (-1), (-1), environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Environment environment0 = new Environment(568);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.timeShift();
      elevator0.isExecutiveFloorCalling();
      elevator0.areDoorsOpen();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Environment environment0 = new Environment(2);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.timeShift();
      elevator0.isEmpty();
      Person person0 = new Person("A<)]8c=--k,rS}2", 0, 0, 0, environment0);
      elevator0.enterElevator(person0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 3258;
      Environment environment0 = new Environment(3258);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.floorButtons = null;
      elevator0.isExecutiveFloorCalling();
      // Undeclared exception!
      try { 
        elevator0.timeShift();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 1;
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.executiveFloor = 1;
      elevator0.timeShift();
      Floor[] floorArray0 = new Floor[8];
      int int1 = 0;
      Floor floor0 = environment0.getFloor(0);
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[1] = floor1;
      int int2 = 0;
      Floor floor2 = environment0.getFloor(0);
      floorArray0[2] = floor2;
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
  public void test16()  throws Throwable  {
      Environment environment0 = new Environment(588);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.timeShift();
      Elevator.Direction elevator_Direction0 = Elevator.Direction.down;
      Floor[] floorArray0 = new Floor[7];
      // Undeclared exception!
      try { 
        environment0.getFloor(588);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 588
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.getCurrentFloorID();
      elevator0.isIdle();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      Environment environment0 = new Environment(0);
      Floor[] floorArray0 = new Floor[0];
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, true, 0, true);
      Person person0 = null;
      // Undeclared exception!
      try { 
        elevator0.enterElevator((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      Person person0 = null;
      try {
        person0 = new Person("T\"_Ld4w", 1, (-1), (-1), environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Environment environment0 = new Environment(4);
      Elevator elevator0 = new Elevator(environment0, true);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      elevator0.doors = elevator_DoorState0;
      elevator0.toString();
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 1);
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      elevator0.pressInLiftFloorButton(0);
      elevator0.getEnv();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Environment environment0 = new Environment(212);
      Elevator elevator0 = new Elevator(environment0, false, 212, false);
      elevator0.toString();
      elevator0.getCurrentFloorID();
      Environment environment1 = elevator0.getEnv();
      Person person0 = null;
      try {
        person0 = new Person("Elevator [_] at 212 heading down", 212, 212, 212, environment1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 212
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 1782;
      Environment environment0 = new Environment(1782);
      Elevator elevator0 = new Elevator(environment0, false, 1782, true);
      // Undeclared exception!
      try { 
        elevator0.timeShift();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1782
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Environment environment0 = new Environment(2665);
      Floor[] floorArray0 = new Floor[2];
      Floor floor0 = new Floor(environment0, 337);
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, 2665);
      floor0.reset();
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      environment0.floors = floorArray0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, true, 2665, false);
      elevator0.isIdle();
      elevator0.toString();
      elevator0.isBlocked();
      Environment environment1 = new Environment(2665);
      Person person0 = null;
      try {
        person0 = new Person("Elevator [_] at 2665 heading down", 337, (-477), 337, environment1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -477
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Environment environment0 = new Environment(431);
      Elevator elevator0 = new Elevator(environment0, true);
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      elevator0.floorButtons = booleanArray0;
      elevator0.isBlocked();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Environment environment0 = new Environment(6543);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.isIdle();
      elevator0.getEnv();
      Elevator.Direction elevator_Direction0 = elevator0.getCurrentDirection();
      elevator_Direction0.reverse();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Environment environment0 = new Environment(521);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.getEnv();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Environment environment0 = new Environment(2727);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.areDoorsOpen();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.leaveElevator((Person) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Elevator.DoorState.values();
      Environment environment0 = new Environment(1280);
      Elevator elevator0 = new Elevator(environment0, false, (-1), false);
      Person person0 = new Person("", (-1), 0, 5653, environment0);
      // Undeclared exception!
      try { 
        elevator0.enterElevator(person0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5653
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 0;
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, false, 0, false);
      // Undeclared exception!
      try { 
        elevator0.pressInLiftFloorButton(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.isExecutiveFloorCalling();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, true, 158, true);
      elevator0.executiveFloor = 0;
      elevator0.env = environment0;
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.open;
      elevator0.doors = elevator_DoorState0;
      // Undeclared exception!
      try { 
        elevator0.buttonForFloorIsPressed(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Elevator.Direction.values();
      Environment environment0 = new Environment(133);
      environment0.floors = null;
      Elevator elevator0 = null;
      try {
        elevator0 = new Elevator(environment0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      elevator_Direction1.reverse();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Elevator.DoorState.values();
      int int0 = 0;
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.isEmpty();
      Floor[] floorArray0 = new Floor[2];
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
  public void test36()  throws Throwable  {
      Environment environment0 = new Environment(2);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      elevator0.timeShift();
      elevator0.isEmpty();
      Person person0 = new Person("A<)]8c=--k,rS}2", 0, 0, 0, environment0);
      elevator0.enterElevator(person0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, false, 0, false);
      elevator0.isIdle();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Environment environment0 = new Environment(1016);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.isIdle();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Environment environment0 = null;
      Elevator elevator0 = null;
      try {
        elevator0 = new Elevator((Environment) null, true, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      elevator0.toString();
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      elevator0.isEmpty();
      Person person0 = new Person("T\"_Ld4w", 1, 1, 1, environment0);
      elevator0.leaveElevator(person0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Environment environment0 = new Environment(589);
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 587);
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, (-2250), false);
      floor0.processWaitingPersons(elevator0);
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator1 = new Elevator(environment0, true, 1815, false);
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      elevator1.floorButtons = booleanArray0;
      elevator1.isIdle();
      elevator1.isIdle();
      elevator1.getEnv();
      elevator1.getCurrentFloorID();
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("7]&,;[3}UBlE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.7]&,;[3}UBlE
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Environment environment0 = new Environment(1543);
      Elevator elevator0 = new Elevator(environment0, true, 1, true);
      Elevator.DoorState elevator_DoorState0 = Elevator.DoorState.close;
      elevator0.doors = elevator_DoorState0;
      elevator0.getCurrentDirection();
      Elevator.DoorState.values();
      elevator0.isExecutiveFloorCalling();
      elevator0.timeShift();
      Person person0 = new Person("T\"_Ld4w", 1, 0, 0, environment0);
      elevator0.leaveElevator(person0);
      elevator0.buttonForFloorIsPressed(0);
      // Undeclared exception!
      try { 
        Elevator.DoorState.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Environment environment0 = new Environment(15);
      Elevator elevator0 = new Elevator(environment0, false, 15, false);
      elevator0.isExecutiveFloorCalling();
      elevator0.getCurrentFloorID();
      elevator0.isExecutiveFloorCalling();
      elevator0.getCurrentDirection();
      elevator0.getCurrentDirection();
      elevator0.isIdle();
      Floor[] floorArray0 = new Floor[0];
      environment0.floors = floorArray0;
      elevator0.toString();
      elevator0.getCurrentDirection();
      environment0.floors = floorArray0;
      // Undeclared exception!
      try { 
        elevator0.pressInLiftFloorButton((-2989));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2989
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Environment environment0 = new Environment(338);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.isBlocked();
      Environment environment1 = new Environment(0);
      Elevator elevator1 = new Elevator(environment1, false, 2, false);
      elevator1.isEmpty();
      Environment environment2 = new Environment(0);
      Elevator elevator2 = new Elevator(environment2, true, 0, true);
      Person person0 = null;
      try {
        person0 = new Person("n;{NYW ].%@!^-^5r!8", 0, 0, 0, environment2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Person person0 = null;
      try {
        person0 = new Person("k'N7*U", 0, 0, 0, environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Environment environment0 = new Environment(2021);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.toString();
      elevator0.verbose = true;
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor((Environment) null, 0);
      floorArray0[0] = floor0;
      elevator0.env = environment0;
      Floor floor1 = new Floor((Environment) null, (-1));
      floorArray0[1] = floor1;
      environment0.floors = null;
      // Undeclared exception!
      try { 
        environment0.getFloor((-608));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = 1;
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.executiveFloor = 1;
      elevator0.timeShift();
      Floor[] floorArray0 = new Floor[8];
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
  public void test48()  throws Throwable  {
      Floor[] floorArray0 = new Floor[6];
      Environment environment0 = null;
      try {
        environment0 = new Environment((-398));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Environment environment0 = new Environment(0);
      Elevator elevator0 = new Elevator(environment0, true);
      elevator0.isIdle();
      elevator0.verbose = true;
      Floor[] floorArray0 = new Floor[2];
      int int0 = 2;
      Floor floor0 = new Floor(environment0, 2);
      floor0.reset();
      floorArray0[0] = floor0;
      floor0.processWaitingPersons(elevator0);
      elevator0.executiveFloor = 0;
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      elevator0.isExecutiveFloor(4);
      environment0.floors = floorArray0;
      // Undeclared exception!
      try { 
        Elevator.Direction.valueOf("M{9442");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant ElevatorSystem.Elevator.Direction.M{9442
         //
         verifyException("java.lang.Enum", e);
      }
  }
}