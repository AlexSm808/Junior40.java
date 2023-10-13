package lesson2;

public class practica2 {
    public static void main(String[] args) {
        // дан четырехугольник, задача определить является ли он квадратом либо прямоугольником
        // a, b, c, d - стороны четырехугольника
        int a = 4;
        int b = 3;
        int c = 5;
        int d = 7;
        if (a == b && b == c && c == d){
            System.out.println("Это квадрат");}
            else if (b == d || a == c){
            System.out.println("Это прямоугольник");
        }
            else {
            System.out.println("Не подходит условиям");
        }
    }
}
