package Lesson5;

public class Main {
    public static void main(String[] args) {
        ScannerUtil.printFigurs();
        String figura = ScannerUtil.getInputFigure(); // рекурсивный вызов

        int a = 9;

        if (figura.equals("1") || figura.equalsIgnoreCase("Круг")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int radius = ScannerUtil.getParametr("Введите радиус: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга: " + MathUtils.areaOfCircle(radius));
            } else {
                System.out.println("Периметр круга: " + MathUtils.perimetrOfCircle(radius));
            }
        }
        if (figura.equals("2") || figura.equalsIgnoreCase("Овал")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int lenghtMax = ScannerUtil.getParametr("Введите длину большой полуоси: ");
            int lenghtMin = ScannerUtil.getParametr("Введите длину малой полуоси: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь овала: " + MathUtils.areaOfEllipse(lenghtMax, lenghtMin));
            } else {
                System.out.println("Периметр овала: " + MathUtils.perimetrOfEllipse(lenghtMax, lenghtMin));
            }
        }
        if (figura.equals("3") || figura.equalsIgnoreCase("Прямоугольник")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int side1 = ScannerUtil.getParametr("Введите первую сторону: ");
            int side2 = ScannerUtil.getParametr("Введите вторую сторону: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь прямоугольника: " + MathUtils.areaOfRectangle(side1, side2));
            } else {
                System.out.println("Периметр прямоугольника: " + MathUtils.perimetrOfRectangle(side1, side2));
            }
        }
        if (figura.equals("4") || figura.equalsIgnoreCase("Треугольник")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int side1 = ScannerUtil.getParametr("Введите первую сторону: ");
            int side2 = ScannerUtil.getParametr("Введите вторую сторону: ");
            int side3 = ScannerUtil.getParametr("Введите третью сторону: ");
            int semiPerimetr = (side1 + side2 + side3) / 2;
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь треугольника: " + MathUtils.areaOfTriangle(side1, side2, side3, semiPerimetr));
            } else {
                System.out.println("Периметр треугольника: " + MathUtils.perimetrOfTriangle(side1, side2, side3));
            }
        }
        if (figura.equals("5") || figura.equalsIgnoreCase("Квадрат")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            int side = ScannerUtil.getParametr("Введите сторону: ");
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь квадрата: " + Math.pow(side, 2));
            } else {
                System.out.println("Периметр квадрата: " + MathUtils.perimetrOfSquare(side));
            }
        }
        if (figura.equals("6") || figura.equalsIgnoreCase("Трапеция")) {
            String action = ScannerUtil.getAction(); // или площадь или периметр
            if (action.equalsIgnoreCase("площадь")) {
                int base1 = ScannerUtil.getParametr("Введите длину первого основания: ");
                int base2 = ScannerUtil.getParametr("Введите длину второго основания: ");
                int height = ScannerUtil.getParametr("Введите высоту: ");
                System.out.println("Площадь трапеции: " + MathUtils.areaOfTrapezoid(base1, base2, height));
            } else {
                int base1 = ScannerUtil.getParametr("Введите длину первого основания: ");
                int base2 = ScannerUtil.getParametr("Введите длину второго основания: ");
                int base3 = ScannerUtil.getParametr("Введите длину первой стороны: ");
                int base4 = ScannerUtil.getParametr("Введите длину второй стороны: ");
                System.out.println("Периметр трапеции: " + MathUtils.perimetrOfTrapezoid(base1, base2, base3, base4));
            }
        }
    }
}