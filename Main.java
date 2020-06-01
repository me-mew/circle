package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;


class Circle {

    public double x; // абсцисса центра
    public double y; // ордината центра
    public double radius;

    public Circle(double a, double b, double s) { //  конструктор

        x = a;
        y = b;
        radius = s;
    }

    public void printCircle() {
        System.out.println("\nОкружность с центром ("+x+"; "+y+") и радиусом "+ radius);
    }

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
        System.out.println("Новые координаты окружности: ("+x+"; "+y+")");
    }

    public double squareCircle() { // площадь

        double s = Math.PI * (Math.pow(radius,2));

        System.out.println("Площадь круга : "+s);
        return s;
    }
}

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome! \n Введите X и Y координаты: ");
            double numberA = scanner.nextDouble();
            double numberB = scanner.nextDouble();

            System.out.println("Введите длину радиуса: ");
            double numberR = scanner.nextDouble();

            Circle o1 = new Circle(numberA,numberB,numberR);
            o1.printCircle();

            o1.squareCircle();

            System.out.println("\nВектор: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            o1.moveCircle(a,b);
            //System.out.println("Новые координаты окружности: ");
        }

    }