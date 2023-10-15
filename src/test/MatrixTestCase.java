package test;

import junit.framework.TestCase;

public class MatrixTestCase extends TestCase {

    public void testDeterminantTest1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }
    public void testDeterminantTest2() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }
}
