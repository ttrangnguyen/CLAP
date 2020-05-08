/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 20:32:22 GMT 2020
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
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      assertEquals((-1435), floor0.getFloorID());
      assertNotNull(floor0);
      
      floorArray0[0] = floor0;
      floorArray0[1] = floor0;
      floorArray0[2] = floorArray0[1];
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertNotNull(elevator0);
      
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
      
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(2, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1432));
      assertEquals((-1432), floor0.getFloorID());
      assertNotNull(floor0);
      
      Person person0 = new Person("", 66, 0, 0, environment0);
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
      assertEquals("", person0.getName());
      assertFalse(person0.isDestinationReached());
      assertEquals(66, person0.getWeight());
      assertNotNull(person0);
      
      floor0.addWaitingPerson(person0);
      assertEquals((-1432), floor0.getFloorID());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
      assertEquals("", person0.getName());
      assertFalse(person0.isDestinationReached());
      assertEquals(66, person0.getWeight());
      
      floorArray0[1] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertNotNull(elevator0);
      
      elevator0.timeShift();
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isEmpty());
      assertFalse(elevator0.isBlocked());
      
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
  public void test02()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertNotNull(elevator0);
      
      int int0 = elevator0.getCurrentFloorID();
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true, (-3188), true);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals((-3188), elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertNotNull(elevator0);
      
      int int0 = elevator0.getCurrentFloorID();
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals((-3188), elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals((-3188), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      assertEquals((-1435), floor0.getFloorID());
      assertNotNull(floor0);
      
      floorArray0[0] = floor0;
      floorArray0[1] = floorArray0[0];
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertNotNull(elevator0);
      
      Person person0 = new Person("(V7:,e}=+hU=", 3212, 1, 1, environment0);
      assertEquals(3212, person0.getWeight());
      assertEquals(1, person0.getOrigin());
      assertEquals(1, person0.getDestination());
      assertFalse(person0.isDestinationReached());
      assertEquals("(V7:,e}=+hU=", person0.getName());
      assertNotNull(person0);
      
      elevator0.timeShift();
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      
      boolean boolean0 = elevator0.buttonForFloorIsPressed(1);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = new Floor[3];
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      boolean boolean0 = elevator0.buttonForFloorIsPressed(1);
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Environment environment0 = new Environment(988);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false, 988, false);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(988, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      // Undeclared exception!
      try { 
        elevator0.pressInLiftFloorButton(988);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 988
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = new Floor[3];
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, true);
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      // Undeclared exception!
      try { 
        elevator0.isIdle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Environment environment0 = new Environment(1386);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertNotNull(elevator0);
      
      boolean[] booleanArray0 = new boolean[0];
      elevator0.floorButtons = booleanArray0;
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      
      // Undeclared exception!
      try { 
        elevator0.isIdle();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true, 1, true);
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertNotNull(elevator0);
      
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
  public void test10()  throws Throwable  {
      Environment environment0 = new Environment(5998);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      Person person0 = new Person("", 5998, 1276, (-2306), environment0);
      assertEquals(5998, person0.getWeight());
      assertFalse(person0.isDestinationReached());
      assertEquals(1276, person0.getOrigin());
      assertEquals((-2306), person0.getDestination());
      assertEquals("", person0.getName());
      assertNotNull(person0);
      
      // Undeclared exception!
      try { 
        elevator0.enterElevator(person0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2306
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Elevator elevator0 = null;
      try {
        elevator0 = new Elevator((Environment) null, false, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Environment environment0 = new Environment(2306);
      assertNotNull(environment0);
      
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
  public void test13()  throws Throwable  {
      Environment environment0 = new Environment(0);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertNotNull(elevator0);
      
      boolean boolean0 = elevator0.areDoorsOpen();
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertTrue(elevator0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false);
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertNotNull(elevator0);
      
      elevator0.timeShift();
      assertEquals((-1), elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      
      boolean boolean0 = elevator0.areDoorsOpen();
      assertEquals((-1), elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Environment environment0 = new Environment(2);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false, 2, true);
      assertEquals(2, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertNotNull(elevator0);
      
      elevator0.pressInLiftFloorButton(0);
      assertEquals(2, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      assertEquals((-1435), floor0.getFloorID());
      assertNotNull(floor0);
      
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      Person person0 = new Person("U+^@gbbF#-.", 0, 0, 1, elevator0.env);
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(person0.isDestinationReached());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getWeight());
      assertEquals(1, person0.getDestination());
      assertEquals("U+^@gbbF#-.", person0.getName());
      assertNotNull(person0);
      
      elevator0.timeShift();
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isEmpty());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      
      boolean boolean0 = elevator0.leaveElevator(person0);
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getWeight());
      assertTrue(person0.isDestinationReached());
      assertEquals(1, person0.getDestination());
      assertEquals("U+^@gbbF#-.", person0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Environment environment0 = new Environment(100);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      Person person0 = new Person("L]", 100, 0, 0, environment0);
      assertEquals(100, person0.getWeight());
      assertFalse(person0.isDestinationReached());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
      assertEquals("L]", person0.getName());
      assertNotNull(person0);
      
      elevator0.enterElevator(person0);
      assertFalse(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(100, person0.getWeight());
      assertFalse(person0.isDestinationReached());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
      assertEquals("L]", person0.getName());
      
      elevator0.timeShift();
      assertFalse(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      assertTrue(elevator0.isEmpty());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      elevator0.currentFloorID = 0;
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      
      elevator0.timeShift();
      assertTrue(elevator0.isEmpty());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertFalse(elevator0.isBlocked());
      assertFalse(elevator0.areDoorsOpen());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Environment environment0 = new Environment(100);
      assertNotNull(environment0);
      
      Elevator elevator0 = new Elevator(environment0, true);
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertTrue(elevator0.isEmpty());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertNotNull(elevator0);
      
      Person person0 = new Person("L]", 100, 0, 0, environment0);
      assertEquals("L]", person0.getName());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
      assertEquals(100, person0.getWeight());
      assertFalse(person0.isDestinationReached());
      assertNotNull(person0);
      
      elevator0.enterElevator(person0);
      assertFalse(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertEquals("L]", person0.getName());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
      assertEquals(100, person0.getWeight());
      assertFalse(person0.isDestinationReached());
      
      Floor[] floorArray0 = new Floor[1];
      Floor floor0 = new Floor(environment0, 0);
      assertEquals(0, floor0.getFloorID());
      assertNotNull(floor0);
      
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      boolean boolean0 = elevator0.isIdle();
      assertFalse(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertEquals(0, elevator0.getCurrentFloorID());
      assertTrue(elevator0.areDoorsOpen());
      assertFalse(elevator0.isBlocked());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Environment environment0 = new Environment(1);
      assertNotNull(environment0);
      
      Person person0 = new Person("", 100, 0, 0, environment0);
      assertEquals(0, person0.getOrigin());
      assertFalse(person0.isDestinationReached());
      assertEquals(100, person0.getWeight());
      assertEquals("", person0.getName());
      assertEquals(0, person0.getDestination());
      assertNotNull(person0);
      
      Elevator elevator0 = new Elevator(environment0, true, 1, true);
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertNotNull(elevator0);
      
      boolean boolean0 = elevator0.isIdle();
      assertFalse(elevator0.isBlocked());
      assertTrue(elevator0.areDoorsOpen());
      assertEquals(1, elevator0.getCurrentFloorID());
      assertTrue(elevator0.isEmpty());
      assertEquals(Elevator.Direction.up, elevator0.getCurrentDirection());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      boolean boolean0 = elevator0.isIdle();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Environment environment0 = new Environment(1386);
      Elevator elevator0 = new Elevator(environment0, true);
      boolean boolean0 = elevator0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[0] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      Person person0 = new Person("U+^@gbbF#-.", 0, 0, 1, elevator0.env);
      assertTrue(elevator0.isEmpty());
      
      elevator0.timeShift();
      boolean boolean0 = elevator0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[0] = floor0;
      floorArray0[1] = floorArray0[0];
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false);
      Person person0 = new Person("(V7:,e}=+hU=", (-1435), 1, 1, environment0);
      floor0.addWaitingPerson(person0);
      elevator0.timeShift();
      boolean boolean0 = elevator0.leaveElevator(person0);
      assertTrue(person0.isDestinationReached());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[1] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      Person person0 = new Person((String) null, 1, 1, 1, environment0);
      boolean boolean0 = elevator0.leaveElevator(person0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, true);
      Person person0 = new Person("]3", 0, 1, 0, environment0);
      elevator0.enterElevator(person0);
      elevator0.timeShift();
      assertTrue(elevator0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Person person0 = new Person("", 73, 0, 0, environment0);
      Elevator elevator0 = new Elevator(environment0, false);
      elevator0.timeShift();
      elevator0.timeShift();
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[0] = floor0;
      floorArray0[1] = floor0;
      floorArray0[2] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      elevator0.timeShift();
      elevator0.toString();
      assertFalse(elevator0.areDoorsOpen());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[0] = floor0;
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[1] = floor1;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      floor0.callElevator();
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[0] = floor0;
      floorArray0[1] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      elevator0.floorButtons = booleanArray0;
      elevator0.currentFloorID = 0;
      elevator0.timeShift();
      assertEquals(1, elevator0.getCurrentFloorID());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1432));
      Person person0 = new Person("", 100, 0, 0, environment0);
      floor0.addWaitingPerson(person0);
      floorArray0[1] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, true, 1, true);
      elevator0.timeShift();
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1432));
      Person person0 = new Person("", 100, 0, 0, environment0);
      floor0.addWaitingPerson(person0);
      floorArray0[1] = floor0;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      elevator0.timeShift();
      elevator0.timeShift();
      assertFalse(elevator0.areDoorsOpen());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Floor[] floorArray0 = new Floor[3];
      Floor floor0 = new Floor(environment0, (-1435));
      floorArray0[0] = floor0;
      floorArray0[1] = floor0;
      Floor floor1 = new Floor(environment0, 0);
      floorArray0[2] = floor1;
      environment0.floors = floorArray0;
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      Person person0 = new Person((String) null, 1, 1, 1, environment0);
      floor1.addWaitingPerson(person0);
      elevator0.timeShift();
      elevator0.timeShift();
      elevator0.timeShift();
      elevator0.toString();
      assertFalse(elevator0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      boolean boolean0 = elevator0.isBlocked();
      assertFalse(boolean0);
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertEquals(1, elevator0.getCurrentFloorID());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      int int0 = elevator0.getCurrentFloorID();
      assertEquals(1, int0);
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      elevator0.getCurrentDirection();
      assertEquals(1, elevator0.getCurrentFloorID());
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      elevator0.getEnv();
      assertEquals(Elevator.Direction.down, elevator0.getCurrentDirection());
      assertEquals(1, elevator0.getCurrentFloorID());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      // Undeclared exception!
      try { 
        elevator0.buttonForFloorIsPressed(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Environment environment0 = new Environment(1);
      Elevator elevator0 = new Elevator(environment0, false, 1, false);
      // Undeclared exception!
      try { 
        elevator0.timeShift();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Elevator.Direction elevator_Direction0 = Elevator.Direction.up;
      Elevator.Direction elevator_Direction1 = elevator_Direction0.reverse();
      Elevator.Direction elevator_Direction2 = elevator_Direction1.reverse();
      assertFalse(elevator_Direction2.equals((Object)elevator_Direction1));
  }
}