package programmingChallenge;

import java.util.*;

class OnlyPositiveNumAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to addition of only positive number and we skip negatve number hahahhaha");
        int[] numArr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("sum of only positive number is " + sum);

    }

}
