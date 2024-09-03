package ATM_PROJECT;

import java.util.*;

class ATM {
    float balance;
    int PIN = 1234;

    public void checkpin() {
        System.out.println("Please Enter Your Pin :");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid Pin");

        }
    }

    public void menu() {
        System.out.println("Enter Your Choice : ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            checkbalance();
        } else if (choice == 2) {
            deposit();
        } else if (choice == 3) {
            withdraw();
        } else if (choice == 4) {
            System.out.println("Exiting...");
            return;
        } else {
            System.out.println("Enter a valid Choice");
        }

    }

    public void checkbalance() {
        System.out.println("Balance :  " + balance);
        menu();

    }

    public void deposit() {
        System.out.println("Enter amount to deposit");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Amount Deposited Successfully");
        menu();

    }

    public void withdraw() {
        System.out.println("Enter amount to withdraw");
        Scanner sc2 = new Scanner(System.in);
        float amount = sc2.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            // menu();
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn Successfully");

        }
        

        System.out.println("Insufficient Balance");
        menu();
    }

    public class AtmMachine {
        public static void main(String[] args) {
            System.out.println("Welcome");
            ATM obj = new ATM();
            obj.checkpin();

        }
    }
}
