package test;

import junit.framework.TestCase;

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

    public void testGetRows() {
        double[][] forTestGetRows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forTestGetRows);
        int resultFact = matrix.getRows();
        int resultWant = 3;
        assertEquals(resultFact, resultWant);
    }

    public void testGetColumns() {
        double[][] forTestGetColums = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetColums);
        int resultFact = matrix.getColumns();
        int resultWant = 4;
        assertEquals(resultFact, resultWant);
    }

    public void testGetValueAt() {
        double[][] forTestGetValueAt = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        Matrix matrix = new Matrix(forTestGetValueAt);
        double resultFact = matrix.getValueAt(2, 2);
        double resultWant = 9.0;
        assertEquals(resultFact, resultWant);
    }

    public void testSetValueAt() {
        double[][] forTestSetValueAt = new double[4][4];
        Matrix matrix = new Matrix(forTestSetValueAt);
        double resultFact = matrix.setValueAt(1, 3, 4);
        double resultWant = 4.0;
        assertEquals(resultFact, resultWant);
    }

    public void testAddMatrix1() {
        double[][] forTestAddMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestAddMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resFact = matrixT.add(matrixO);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }

        double[][] resultWant = {{2, 4, 6, 4}, {8, 10, 12, 9}, {14, 16, 18, 14}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testAddMatrix2() {
        double[][] forTestAddMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestAddMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestAddMatrixT);
        Matrix matrixO = new Matrix(forTestAddMatrixO);
        IMatrix resFact = matrixT.add(matrixO);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{-2, -4, -6, -4}, {-8, -10, -12, -9}, {-14, -16, -18, -14}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testSubMatrix1() {
        double[][] forTestSubMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestSubMatrixO = {{1, 2, 3, 3}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resFact = matrixT.sub(matrixO);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{0, 0, 0, -2}, {0, 0, 0, -3}, {0, 0, 0, -4}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testSubMatrix2() {
        double[][] forTestSubMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestSubMatrixO = {{-1, -2, -3, -3}, {-4, -5, -6, -6}, {-7, -8, -9, -9}};
        Matrix matrixT = new Matrix(forTestSubMatrixT);
        Matrix matrixO = new Matrix(forTestSubMatrixO);
        IMatrix resFact = matrixT.sub(matrixO);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{0, 0, 0, 2}, {0, 0, 0, 3}, {0, 0, 0, 4}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testMulMatrix1() {
        double[][] forTestMulMatrixT = {{1, 2, 3, 1}, {4, 5, 6, 3}, {7, 8, 9, 5}};
        double[][] forTestMulMatrixO = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {4, 5, 7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resFact = matrixT.mul(matrixO);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testMulMatrix2() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}, {-4, -5, -7}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resFact = matrixT.mul(matrixO);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{34, 41, 49}, {78, 96, 117}, {122, 151, 185}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testMulMatrix3() {
        double[][] forTestMulMatrixT = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        double[][] forTestMulMatrixO = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrixT = new Matrix(forTestMulMatrixT);
        Matrix matrixO = new Matrix(forTestMulMatrixO);
        IMatrix resFact = matrixT.mul(matrixO);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testMulonNumMatrix1() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resFact = matrix.mul(5);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{-5, -10, -15, -5}, {-20, -25, -30, -15}, {-35, -40, -45, -25}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testMulonNumMatrix2() {
        double[][] forTestMulonNumMatrix = {{-1, -2, -3, -1}, {-4, -5, -6, -3}, {-7, -8, -9, -5}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resFact = matrix.mul(-5);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{5, 10, 15, 5}, {20, 25, 30, 15}, {35, 40, 45, 25}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }

    public void testMulonNumMatrix3() {
        double[][] forTestMulonNumMatrix = {{1, 2, 3, 4}, {5, 6, 7, 9}, {11, 32, 11, 25}};
        Matrix matrix = new Matrix(forTestMulonNumMatrix);
        IMatrix resFact = matrix.mul(0);
        double[][] resultFact = new double[resFact.getRows()][resFact.getColumns()];
        for (int i = 0; i < resFact.getRows(); i++) {
            for (int j = 0; j < resFact.getColumns(); j++) {
                resultFact[i][j] = resFact.getValueAt(i, j);
            }
        }
        double[][] resultWant = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        assertTrue(Arrays.deepEquals(resultFact, resultWant));
    }
}



