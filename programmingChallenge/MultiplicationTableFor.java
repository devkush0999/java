package programmingChallenge;
import java.util.*;

class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to printing tables\n");
        System.out.println("Enter the number for which you want to print the table:");
        int number = scanner.nextInt();
        

        for(int  i = 1; i <= 999999999; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
            }
            }
    
}
