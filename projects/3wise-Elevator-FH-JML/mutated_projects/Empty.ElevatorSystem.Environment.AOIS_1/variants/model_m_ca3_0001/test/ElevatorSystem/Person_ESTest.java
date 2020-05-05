/*
 * This file was automatically generated by EvoSuite
 * Mon May 04 17:57:45 GMT 2020
 */

package ElevatorSystem;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ElevatorSystem.Elevator;
import ElevatorSystem.Environment;
import ElevatorSystem.Person;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Person_ESTest extends Person_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Environment environment0 = new Environment(432);
      Person person0 = new Person("p]sQ'9[&T", 0, 0, 0, environment0);
      Elevator elevator0 = new Elevator(environment0, false, 0, true);
      person0.enterElevator(elevator0);
      assertEquals(0, person0.getDestination());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getWeight());
      assertFalse(person0.isDestinationReached());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Environment environment0 = new Environment(2694);
      Person person0 = new Person("", 0, 0, 0, environment0);
      assertFalse(person0.isDestinationReached());
      
      person0.leaveElevator();
      boolean boolean0 = person0.isDestinationReached();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Environment environment0 = new Environment(2694);
      Person person0 = new Person("", 0, 0, 0, environment0);
      int int0 = person0.getWeight();
      assertEquals(0, int0);
      assertFalse(person0.isDestinationReached());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Environment environment0 = new Environment(4894);
      Person person0 = new Person(" left the Elevator at Landing ", (-4505), 2307, (-1701), environment0);
      int int0 = person0.getWeight();
      assertEquals((-1701), person0.getDestination());
      assertFalse(person0.isDestinationReached());
      assertEquals((-4505), int0);
      assertEquals(2307, person0.getOrigin());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Environment environment0 = new Environment(2694);
      Person person0 = new Person("", 0, 0, 0, environment0);
      int int0 = person0.getOrigin();
      assertEquals(0, person0.getWeight());
      assertEquals(0, person0.getDestination());
      assertEquals(0, int0);
      assertFalse(person0.isDestinationReached());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Environment environment0 = new Environment(169);
      Person person0 = new Person((String) null, 0, 29, (-50), environment0);
      person0.getName();
      assertEquals(29, person0.getOrigin());
      assertEquals((-50), person0.getDestination());
      assertEquals(0, person0.getWeight());
      assertFalse(person0.isDestinationReached());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Environment environment0 = new Environment(2403);
      Person person0 = new Person("", (-3279), 0, 0, environment0);
      person0.getName();
      assertEquals((-3279), person0.getWeight());
      assertFalse(person0.isDestinationReached());
      assertEquals(0, person0.getOrigin());
      assertEquals(0, person0.getDestination());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Environment environment0 = new Environment(2403);
      Person person0 = new Person("", (-3279), 0, 0, environment0);
      int int0 = person0.getDestination();
      assertEquals(0, person0.getOrigin());
      assertEquals((-3279), person0.getWeight());
      assertEquals(0, int0);
      assertFalse(person0.isDestinationReached());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Environment environment0 = new Environment(2807);
      Person person0 = new Person("", 0, 2448, 203, environment0);
      int int0 = person0.getDestination();
      assertEquals(2448, person0.getOrigin());
      assertFalse(person0.isDestinationReached());
      assertEquals(203, int0);
      assertEquals(0, person0.getWeight());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Environment environment0 = new Environment(4894);
      Person person0 = new Person(" left the Elevator at Landing ", (-4505), 2307, (-1701), environment0);
      Elevator elevator0 = new Elevator(environment0, false);
      // Undeclared exception!
      try { 
        person0.enterElevator(elevator0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1701
         //
         verifyException("ElevatorSystem.Elevator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Environment environment0 = new Environment(1);
      environment0.floors = null;
      Person person0 = null;
      try {
        person0 = new Person((String) null, 1315, (-133), (-133), environment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Environment environment0 = new Environment(537);
      Person person0 = null;
      try {
        person0 = new Person("kV45`MRr^7fI/", 0, (-1389), 537, environment0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1389
         //
         verifyException("ElevatorSystem.Environment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Environment environment0 = new Environment(4894);
      Person person0 = new Person(" left the Elevator at Landing ", (-4505), 2307, (-1701), environment0);
      int int0 = person0.getDestination();
      assertEquals((-4505), person0.getWeight());
      assertFalse(person0.isDestinationReached());
      assertEquals((-1701), int0);
      assertEquals(2307, person0.getOrigin());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Environment environment0 = new Environment(4894);
      Person person0 = new Person(" left the Elevator at Landing ", (-4505), 2307, (-1701), environment0);
      // Undeclared exception!
      try { 
        person0.enterElevator((Elevator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ElevatorSystem.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Environment environment0 = new Environment(4894);
      Person person0 = new Person(" left the Elevator at Landing ", (-4505), 2307, (-1701), environment0);
      person0.getName();
      assertFalse(person0.isDestinationReached());
      assertEquals(2307, person0.getOrigin());
      assertEquals((-1701), person0.getDestination());
      assertEquals((-4505), person0.getWeight());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Environment environment0 = new Environment(2716);
      Person person0 = new Person("", 36, 36, 36, environment0);
      boolean boolean0 = person0.isDestinationReached();
      assertEquals(36, person0.getDestination());
      assertFalse(boolean0);
      assertEquals(36, person0.getWeight());
      assertEquals(36, person0.getOrigin());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Environment environment0 = new Environment(4887);
      Person person0 = new Person("", 1881, 1881, 1881, environment0);
      int int0 = person0.getWeight();
      assertEquals(1881, int0);
      assertEquals(1881, person0.getDestination());
      assertFalse(person0.isDestinationReached());
      assertEquals(1881, person0.getOrigin());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Environment environment0 = new Environment(4887);
      Person person0 = new Person("", 1881, 1881, 1881, environment0);
      int int0 = person0.getOrigin();
      assertEquals(1881, int0);
      assertFalse(person0.isDestinationReached());
      assertEquals(1881, person0.getWeight());
      assertEquals(1881, person0.getDestination());
  }
}