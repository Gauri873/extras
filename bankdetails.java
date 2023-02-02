package com.practice.ooj;

import java.util.*;

class Customer {
    int custno;
    String custname, mobile;

    void Customer(int no, String name, String mob) {
        custno = no;
        custname = name;
        mobile = mob;
    }
}

class Bank extends Customer {
    int acctno;
    double balance;
    String branchname, location;

    void Bank(int no, double bal, String brname, String loc) {
        acctno = no;
        balance = bal;
        branchname = brname;
        location = loc;
    }

    double gross() {
        if (balance > 100000) {
            return (6 * balance / 5);
        } else {
            return balance;
        }
    }

    void display() {
        System.out.println("Customer number: " + acctno);
        System.out.println("Customer name: " + custname);
        System.out.println("Mobile number: " + mobile);
        System.out.println("Account number: " + acctno);
        System.out.println("balance: " + balance);
        System.out.println("Branch name: " + branchname);
        System.out.println("Location: " + location);
    }
}

class CustBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Bank b = new Bank();
            System.out.println("Enter customer number: ");
            int no = sc.nextInt();
            System.out.println("Enter customer name: ");
            String name = sc.next();
            System.out.println("Enter mobile number: ");
            String mob = sc.next();
            System.out.println("Enter account number: ");
            int ano = sc.nextInt();
            System.out.println("Enter balance: ");
            Double bal = sc.nextDouble();
            System.out.println("Enter branch name: ");
            String brname = sc.next();
            System.out.println("Enter location name: ");
            System.out.println();
            String loc = sc.next();
            b.Customer(no, name, mob);
            b.Bank(ano, bal, brname, loc);
            b.gross();
            b.display();
        }
    }
}
