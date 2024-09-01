package programmingChallenge;
import java.util.*;

class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter to exit...");
       while (true) {
        System.out.println("Enter your command: ");
        String command = input.next();
        if(command.equals("exit") ){
            break;
            }
        }
        System.out.println("You have successfully exit");

        
       }
    
}
