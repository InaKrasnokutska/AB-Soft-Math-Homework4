package QuadraticEquation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {

//    @Test
//    public void testIsQuadratic() {
//        QuadraticEquation quadraticEquation = new QuadraticEquation(1,2,3);
//        Assert.assertTrue(quadraticEquation.isQuadratic(), "a == 0");
//    }

    @Test
    public void testDifferentRoots() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-4,-5);
        Assert.assertNotEquals(quadraticEquation.findSolution().root1, quadraticEquation.findSolution().root2,"root1 == root2");
    }

    @Test
    public void testEqualRoots() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,12,36);
        Assert.assertEquals(quadraticEquation.findSolution().root1, quadraticEquation.findSolution().root2,"root1 != root2");
    }

    @Test
    public void testNullSolution() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(3,-4,2);
        Assert.assertNull(quadraticEquation.findSolution(), "solution is not null");
    }

}
