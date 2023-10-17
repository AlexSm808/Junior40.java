package test;

import java.util.Arrays;

public class Matrix implements IMatrix {

    private double[][] nums;

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        if (row < 0 || row > 10 || col < 0 || col > 10) {
            nums = new double[1][1];
        } else {
            nums = new double[row][col];
        }
    }

    public Matrix() {
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        try {
            if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
                throw new IndexOutOfBoundsException("Индекс выходит за размер текущей матрицы");
            }
            return nums[rowIndex][colIndex];
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Ошибка при вызове метода getValueAt: " + e.getMessage());
            return 0;
        }
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        try {
            if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
                throw new IndexOutOfBoundsException("Индекс выходит за размер текущей матрицы");
            }
            nums[rowIndex][colIndex] = value;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка при вызове метода setValueAt: " + e.getMessage());
        }
    }


    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // otherMatrix = b
        // this = a
        try {
            if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
                throw new IllegalArgumentException("Текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов");
            }
            if (otherMatrix == null) {
                throw new NullPointerException("Второй аргумент null!!!");
            }
            Matrix result = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < result.getColumns(); j++) {
                    result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
                }
            }
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при вызове метода add (IllegalArgumentException): " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка при вызове метода add (NullPointerException) " + e.getMessage());
        }
        return otherMatrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        try {
            if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
                throw new IllegalArgumentException("Текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов");
            }
            if (otherMatrix == null) {
                throw new NullPointerException("Второй аргумент null!!!");
            }

            Matrix result = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < result.getColumns(); j++) {
                    result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
                }
            }
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при вызове метода sub (IllegalArgumentException): " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка при вызове метода sub (NullPointerException): " + e.getMessage());
        }
        return otherMatrix;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        try {
            if (this.getColumns() != otherMatrix.getRows()) {
                throw new IllegalArgumentException("Текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов");
            }
            if (otherMatrix == null) {
                throw new NullPointerException("Второй аргумент null!!!");
            }
            double sum = 0;
            Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < result.getColumns(); j++) {
                    for (int k = 0; k < this.getColumns(); k++) {
                        sum += this.getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                    }
                    result.setValueAt(i, j, sum);
                    sum = 0;
                }
            }
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при вызове метода mul (IllegalArgumentException): " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ошибка при вызове метода mul (NullPointerException): " + e.getMessage());
        }
        return otherMatrix;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        double result = 0;
        if (!this.isSquareMatrix()) {
            System.out.println("Количество строк не равно количеству столбцов!!");
        } else if (nums.length == 1) {
            result = this.getValueAt(0, 0);
        } else if (nums.length == 2) {
            result = (this.getValueAt(0, 0) * this.getValueAt(1, 1)) -
                    (this.getValueAt(1, 0) * this.getValueAt(0, 1));
        } else {
            double det = 0;
            for (int i = 0; i < nums.length; i++) {
                double[][] subMatrix = createSubMatrix(nums, 0, i);
                det += Math.pow(-1, i) * nums[0][i] * new Matrix(subMatrix).determinant();
            }
            result = det;
        }
        return result;
    }

    private double[][] createSubMatrix(double[][] matrix, int rowToRemove, int colToRemove) {
        int n = matrix.length;
        double[][] subMatrix = new double[n - 1][n - 1];
        int subMatrixRow = 0;
        int subMatrixCol;

        for (int i = 0; i < n; i++) {
            if (i != rowToRemove) {
                subMatrixCol = 0;
                for (int j = 0; j < n; j++) {
                    if (j != colToRemove) {
                        subMatrix[subMatrixRow][subMatrixCol] = matrix[i][j];
                        subMatrixCol++;
                    }
                }
                subMatrixRow++;
            }
        }

        return subMatrix;
    }


    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (this.isSquareMatrix()) {
            for (int i = 0; i < this.getRows(); i++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    if (i == j && this.getValueAt(i, j) != 1) {
                        return false;
                    } else if (i != j && this.getValueAt(i, j) != 0) {
                        return false;
                    }

                }
            }

        }
        return true;
    }


    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() != this.getColumns()) {

            return false;
        }
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }

            System.out.print("\n");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        return Arrays.deepEquals(nums, matrix.nums);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(nums);
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "nums=" + Arrays.toString(nums) +
                '}';
    }
}

