package Lesson5;

public class MathUtils {

    public static double areaOfCircle(double valueOfRadius) {
        double areaOfCircle = 2 * 3.14 * valueOfRadius;
        return areaOfCircle;
    }

    public static double perimetrOfCircle(double valueOfRadius) {
        double perimetrOfCircle = Math.pow(valueOfRadius, 2);
        return perimetrOfCircle;
    }

    public static double areaOfRectangle(double valueOfSide1, double valueOfSide2) {
        double areaOfRectangle = valueOfSide1 * valueOfSide2;
        return areaOfRectangle;
    }

    public static double perimetrOfRectangle(double valueOfSide1, double valueOfSide2) {
        double perimetrOfRectangle = 2 * (valueOfSide1 * valueOfSide2);
        return perimetrOfRectangle;
    }

    public static double areaOfTriangle(double valueOfSide1, double valueOfSide2, double valueOfSide3, double semiPerimetr) {
        double areaOfTriangle = Math.sqrt(semiPerimetr * (semiPerimetr - valueOfSide1) * (semiPerimetr - valueOfSide2) * (semiPerimetr - valueOfSide3));
        return areaOfTriangle;
    }

    public static double perimetrOfTriangle(double valueOfSide1, double valueOfSide2, double valueOfSide3) {
        double perimetrOfTriangle = valueOfSide1 + valueOfSide2 + valueOfSide3;
        return perimetrOfTriangle;
    }

    public static double areaOfSquare(double valueOfSide) {
        double areaOfSquare = Math.pow(valueOfSide, 2);
        return areaOfSquare;
    }

    public static double perimetrOfSquare(double valueOfSide) {
        double perimetrOfSquare = 4 * valueOfSide;
        return perimetrOfSquare;
    }

    public static double areaOfTrapezoid(double valueOfBase1, double valueOfBase2, double height) {
        double areaOfTrapezoid = ((valueOfBase1 + valueOfBase2) * height) / 2;
        return areaOfTrapezoid;
    }

    public static double perimetrOfTrapezoid(double valueOfBase1, double valueOfBase2, double valueOfBase3, double valueOfBase4) {
        double perimetrOfTrapezoid = valueOfBase1 + valueOfBase2 + valueOfBase3 + valueOfBase4;
        return perimetrOfTrapezoid;
    }

    public static double areaOfEllipse(double valueOfLenghtMax, double valueOfLenghtMin) {
        double areaOfEllipse = 3.14 * valueOfLenghtMax * valueOfLenghtMin;
        return areaOfEllipse;
    }

    public static double perimetrOfEllipse(double valueOfLenghtMax, double valueOfLenghtMin) {
        double perimetrOfEllipse = 2 * 3.14 * Math.sqrt(((Math.pow(valueOfLenghtMax, 2)) + (Math.pow(valueOfLenghtMin, 2))) / 2);
        return perimetrOfEllipse;
    }
}


