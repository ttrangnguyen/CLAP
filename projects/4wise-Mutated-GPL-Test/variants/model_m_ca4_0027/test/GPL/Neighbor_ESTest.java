/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 14 06:11:10 GMT 2020
 */

package GPL;

import org.junit.Test;
import static org.junit.Assert.*;
import GPL.Edge;
import GPL.Neighbor;
import GPL.Vertex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Neighbor_ESTest extends Neighbor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Neighbor neighbor0 = new Neighbor();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Edge edge0 = new Edge();
      Neighbor neighbor0 = new Neighbor((Vertex) null, edge0);
  }
}
