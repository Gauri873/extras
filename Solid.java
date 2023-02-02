package com.practice.ooj;

import java.util.*;

abstract class Solid {
    final double pi = 3.14;
    double r, h, s;

    abstract double area();

    abstract double volume();
}

class cylinder extends Solid {
    void getdata(double x, double y) {
        r = x;
        h = y;
    }

    double area() {
        return (2 * pi * r * h) + (2 * pi * r * r);
    }

    double volume() {
        return (pi * r * r * h);
    }
}

class cone extends Solid {
    void getdata(double x, double y, double z) {
        r = x;
        h = y;
        s = z;
    }

    double area() {
        return (pi * r * s) + (pi * r * r);
    }

    double volume() {
        return (pi * r * r * h / 3);
    }
}

class sphere extends Solid {
    void getdata(double x) {
        r = x;
    }

    double area() {
        return (4 * pi * r * r);
    }

    double volume() {
        return (4 * pi * r * r * r / 3);
    }
}

class abstarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of calculations: ");
        n = sc.nextInt();
        cylinder c = new cylinder();
        cone co = new cone();
        sphere s = new sphere();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter 1 for cylinder");
            System.out.println("Enter 2 for cone");
            System.out.println("Enter 3 for sphere");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter value of radius and height:");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                c.getdata(x, y);
                System.out.println("Area is " + c.area());
                System.out.println("Volume is " + c.volume());
            } else if (ch == 2) {
                System.out.println("Enter value of radius, height and S :");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double z = sc.nextDouble();
                co.getdata(x, y, z);
                System.out.println("Area is " + co.area());
                System.out.println("Volume is " + co.volume());
            } else if (ch == 3) {
                System.out.println("Enter value of radius:");
                double x = sc.nextDouble();
                s.getdata(x);
                System.out.println("Area is " + s.area());
                System.out.println("Volume is " + s.volume());
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
