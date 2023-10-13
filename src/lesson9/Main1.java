package lesson9;

import test.IMatrix;
import test.Matrix;

public class Main1 {
    public static void main(String[] args) {
        double[][] forA =  {{1, 2, 3},
                            {4, 5, 6},
                            {4, 5, 6}};

        double[][] forB = {{7, 2, 7},
                           {4, 3, 4},
                           {5, 5, 1}};

        double[][] forDet = {{8, 3, 6, 7},
                             {2, 1, 0, 9},
                             {11, 3, 4, 4},
                             {13, 0, 2, 1}};

        double[][] forC = {{7, 2},
                           {4, 3},
                           {5, 5}};

        double[][] forD = {{7, 2, 7},
                           {4, 3, 4}};




        double[][] forNull = {{0, 0, 0},
                              {0, 0, 0},
                              {0, 0, 0}};

        double[][] forIdentity = {{1, 0, 0},
                                  {0, 1, 8},
                                  {0, 0, 1}};

        double[][] forDet1 = {{7, 2},
                             {4, 3}};

        double[][] forLul = new double[7][5];

        Matrix a = new Matrix((forA));
        Matrix b = new Matrix((forB));
        Matrix c = new Matrix((forC));
        Matrix d = new Matrix((forD));
        Matrix f = new Matrix(forDet1);
        Matrix I = new Matrix((forIdentity));
        Matrix det = new Matrix((forDet));



        Matrix nul = new Matrix((forNull));
        Matrix lul = new Matrix(forLul);

        IMatrix resultAdd = a.add(b); //сложение матриц
        resultAdd.printToConsole();

        IMatrix resultSub = a.sub(b); // Вычитание матриц
        resultSub.printToConsole();

        IMatrix resultMul = c.mul(d); // умножение матриц
        resultMul.printToConsole();

        IMatrix resultMulValue = a.mul(2); // умножает матрицу на число
        resultMulValue.printToConsole();

        IMatrix transponse = c.transpose(); // транспонирует матрицу
        transponse.printToConsole();

        lul.fillMatrix(-2);   // заполняет матрицу
        lul.printToConsole();      // выводит на консоль

        System.out.println(f.determinant()); // вычисляет детрминант
        System.out.println(b.determinant());
        System.out.println(det.determinant());


        I.isIdentityMatrix();





    }
}
