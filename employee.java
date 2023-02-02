package com.practice.ooj;

import java.util.*;

class employee {
    String empname;
    int empnohrs;
    float empbasic;
    float emphra, empda, empit, empgross;

    void empp(String name, int hrs, float basic, float hra, float da, float it) {
        this.empname = name;
        this.empnohrs = hrs;
        this.empbasic = basic;
        this.emphra = hra;
        this.empda = da;
        this.empit = it;
    }

    float grosssal() {
        this.empgross = this.empbasic * (1 + (this.empda / 100) + (this.emphra / 100) - (this.empit / 100));
        if (empnohrs > 200) {
            empgross += (empnohrs * 100);
        }
        return empgross;
    }
}

class employeedetails {
    public static void main(String[] args) {
        int n, i, hrs;
        String name;
        float basic, hra, da, it;
        Scanner sc = new Scanner(System.in);
        employee emp = new employee();
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter number of hours: ");
        hrs = sc.nextInt();
        System.out.println("Enter basic: ");
        basic = sc.nextFloat();
        System.out.println("Enter HRA: ");
        hra = sc.nextFloat();
        System.out.println("Enter DA: ");
        da = sc.nextFloat();
        System.out.println("Enter IT: ");
        it = sc.nextFloat();
        try {
            emp.empp(name, hrs, basic, hra, da, it);
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Salary of " + emp.empname + " is " + emp.grosssal());
    }
}
