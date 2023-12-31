package test;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;


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

    public void testGetRows1() {
        double[][] forTestGetRows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forTestGetRows);
        int resultFact = matrix.getRows();
        int resultWant = 3;
        assertEquals(resultFact, resultWant);
    }

    public void testGetRows2() {
        double[][] forTestGetRows = new double[5][6];
        Matrix matrix = new Matrix(forTestGetRows);
        int resultFact = matrix.getRows();
        int resultWant = 5;
        assertEquals(resultFact, resultWant);
    }


    public void testGetColumns1() {
        double[][] forTestGetColums = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetColums);
        int resultFact = matrix.getColumns();
        int resultWant = 4;
        assertEquals(resultFact, resultWant);
    }

    public void testGetColumns2() {
        double[][] forTestGetColums = new double[3][2];
        Matrix matrix = new Matrix(forTestGetColums);
        int resultFact = matrix.getColumns();
        int resultWant = 2;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAt1() {
        double[][] forTestGetValueAt = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(2, 2);
        double resultWant = 9.0;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAt2() {
        double[][] forTestGetValueAt = new double[3][3];
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(1, 1);
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueAtThrowsException2() {
        double[][] forTestGetValueAt = new double[3][3];
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(3,2);
    }

//    public void testGetValueAtThrowsException() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestGetValueAt = new double[3][3];
//            Matrix matrix = new Matrix(forTestGetValueAt);
//            double resultFact = matrix.getValueAt(3, 1);
//            double resultWant = 0.0;
//        } catch (IndexOutOfBoundsException iO) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }

    public void testSetValueAt1() {
        double[][] forTestSetValueAt = new double[4][4];
        Matrix matrix = new Matrix(forTestSetValueAt);
        matrix.setValueAt(1, 3, 4);
        double resultFact = matrix.getValueAt(1, 3);
        double resultWant = 4.0;
        assertEquals(resultFact, resultWant);
    }

    public void testSetValueAt2() {
        double[][] forTestSetValueAt = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestSetValueAt);
        matrix.setValueAt(1, 3, 3);
        double resultFact = matrix.getValueAt(1, 3);
        double resultWant = 3.0;
        assertEquals(resultFact, resultWant);
    }

//    public void testSetValueAtThrowsException() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestSetValueAt = new double[3][3];
//            Matrix matrix = new Matrix(forTestSetValueAt);
//            matrix.setValueAt(4, 2, 4);
//            double resultWant = 4.0;
//        } catch (IndexOutOfBoundsException iO) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetValueAtThrowsException2() {
        double[][] forTestSetValueAt = new double[3][3];
        Matrix matrix = new Matrix(forTestSetValueAt);
        matrix.setValueAt(4, 2, 4.0);
        double resultWant = 4.0;
    }

    public void testAddMatrix1() {
        double[][] forTestAddMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestAddMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{2, 4, 6, 4}, {8, 10, 12, 9}, {14, 16, 18, 14}};
        IMatrix resultWant = new Matrix(arrayWant);;
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrix2() {
        double[][] forTestAddMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestAddMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{-2, -4, -6, -4}, {-8, -10, -12, -9}, {-14, -16, -18, -14}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrix3() {
        double[][] forTestAddMatrixT = new double[5][5];
        double[][] forTestAddMatrixO = new double[5][5];
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resultFact = matrixT.add(matrixO);
        double[][] arrayWant = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        IMatrix resultWant = new Matrix(arrayWant);;
        assertEquals(resultFact, resultWant);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddMatrixThrowsException1() {
        double[][] forTestAddMatrixT = new double[3][4];
        double[][] forTestAddMatrixO = new double[3][3];
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resFact = matrixT.add(matrixO);
    }

    @Test(expected = NullPointerException.class)
    public void testAddMatrixThrowsException2() {
        double[][] forTestAddMatrixT = new double[3][4];
        double[][] forTestAddMatrixO = null;
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resFact = matrixT.add(matrixO);
    }


//    public void testAddMatrixThrowsException1() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestAddMatrixT = new double[3][4];                //неверное написание
//            double[][] forTestAddMatrixO = new double[3][3];
//            Matrix matrixT = new Matrix(forTestAddMatrixT);
//            Matrix matrixO = new Matrix(forTestAddMatrixO);
//            IMatrix resFact = matrixT.add(matrixO);
//        } catch (IllegalArgumentException i) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }
//
//
//    public void testAddMatrixThrowsException2() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestAddMatrixT = new double[3][4];
//            double[][] forTestAddMatrixO = null;
//            Matrix matrixT = new Matrix(forTestAddMatrixT);
//            Matrix matrixO = new Matrix(forTestAddMatrixO);
//            IMatrix resFact = matrixT.add(matrixO);
//        } catch (NullPointerException n) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }

    public void testSubMatrix1() {
        double[][] forTestSubMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestSubMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0, -2}, {0, 0, 0, -3}, {0, 0, 0, -4}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);

    }

    public void testSubMatrix2() {
        double[][] forTestSubMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestSubMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0, 2}, {0, 0, 0, 3}, {0, 0, 0, 4}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testSubMatrix3() {
        double[][] forTestSubMatrixT = new double[3][3];
        double[][] forTestSubMatrixO = new double[3][3];
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resultFact = matrixT.sub(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubMatrixThrowsException1() {
        double[][] forTestSubMatrixT = new double[4][5];
        double[][] forTestSubMatrixO = new double[3][5];
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resFact = matrixT.sub(matrixO);
    }

    @Test(expected = NullPointerException.class)
    public void testSubMatrixThrowsException2() {
        double[][] forTestSubMatrixT = new double[4][5];
        double[][] forTestSubMatrixO = null;
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resFact = matrixT.sub(matrixO);
    }


//    public void testSubMatrixThrowsException1() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestSubMatrixT = new double[4][5];
//            double[][] forTestSubMatrixO = new double[3][5];
//            Matrix matrixT = new Matrix(forTestSubMatrixT);
//            Matrix matrixO = new Matrix(forTestSubMatrixO);          //неверное решение
//            IMatrix resFact = matrixT.sub(matrixO);
//        } catch (IllegalArgumentException i) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }
//
//    public void testSubMatrixThrowsException2() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestSubMatrixT = new double[4][5];
//            double[][] forTestSubMatrixO = null;
//            Matrix matrixT = new Matrix(forTestSubMatrixT);
//            Matrix matrixO = new Matrix(forTestSubMatrixO);
//            IMatrix resFact = matrixT.sub(matrixO);
//        } catch (NullPointerException n) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }

    public void testMulMatrix1() {
        double[][] forTestMulMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestMulMatrixO = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {4, 5, 7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix2() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}, {-4, -5, -7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix3() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testMulMatrix4() {
        double[][] forTestMulMatrixT = new double[3][4];
        double[][] forTestMulMatrixO = new double[4][3];
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resultFact = matrixT.mul(matrixO);
        double[][] arrayWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMulMatrixThrowsException1() {
        double[][] forTestMulMatrixT = new double[4][5];
        double[][] forTestMulMatrixO = new double[4][4];
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resFact = matrixT.mul(matrixO);
    }

    @Test(expected = NullPointerException.class)
    public void testMulMatrixThrowsException2() {
        double[][] forTestMulMatrixT = new double[4][5];
        double[][] forTestMulMatrixO = null;
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resFact = matrixT.mul(matrixO);
    }

//    public void testMulMatrixThrowsException1() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestMulMatrixT = new double[4][5];
//            double[][] forTestMulMatrixO = new double[4][4];
//            Matrix matrixT = new Matrix(forTestMulMatrixT);
//            Matrix matrixO = new Matrix(forTestMulMatrixO);
//            IMatrix resFact = matrixT.mul(matrixO);
//        } catch (IllegalArgumentException i) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }
//
//    public void testMulMatrixThrowsException2() {
//        boolean exceptionTrown = false;
//        try {
//            double[][] forTestMulMatrixT = new double[4][5];
//            double[][] forTestMulMatrixO = null;
//            Matrix matrixT = new Matrix(forTestMulMatrixT);
//            Matrix matrixO = new Matrix(forTestMulMatrixO);
//            IMatrix resFact = matrixT.mul(matrixO);
//        } catch (NullPointerException n) {
//            exceptionTrown = true;
//        }
//        assertTrue(exceptionTrown);
//    }

    public void testMulonNumMatrix1() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(5);
        double[][] arrayWant = {{-5, -10, -15, -5}, {-20, -25, -30, -15}, {-35, -40, -45, -25}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testMulonNumMatrix2() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(-5);
        double[][] arrayWant = {{5, 10, 15, 5}, {20, 25, 30, 15}, {35, 40, 45, 25}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testMulonNumMatrix3() {
        double[][] forTestMulonNumMatrix = {{1, 2, 3, 4}, {5, 6, 7, 9}, {11, 32, 11, 25}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resultFact = matrix.mul(0);
        double[][] arrayWant = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testFillMatrix() {
        double[][] forTestFillMatrix = new double[3][3];
        Matrix matrix = new Matrix(forTestFillMatrix);
        matrix.fillMatrix(3);
        IMatrix resultFact = matrix;
        double[][] arrayWant = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        IMatrix resultWant = new Matrix(arrayWant);
        assertEquals(resultFact, resultWant);
    }

    public void testFillMatrixbyBycicle() {
        double[][] forTestFillMatrix = new double[3][3];
        double[][] resultWant = {{-4, -4, -4}, {-4, -4, -4}, {-4, -4, -4}};
        Matrix factMatrix = new Matrix(forTestFillMatrix);
        factMatrix.fillMatrix(-4);
        double[][] resultFact = new double[factMatrix.getRows()][factMatrix.getColumns()];
        for (int i = 0; i < factMatrix.getRows(); i++) {
            for (int j = 0; j < factMatrix.getColumns(); j++) {
                resultFact[i][j] = factMatrix.getValueAt(i, j);
            }
        }
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

}