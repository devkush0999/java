package programmingChallenge;

import java.util.*;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Set your Password\n");
        String password;
        boolean isValid;
        do {
            System.out.println("Enter your password: ");
            password = input.nextLine();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid Password");

    }

    public static boolean isValidPassword(String password) {

        return password.length() > 6;

    }

}
