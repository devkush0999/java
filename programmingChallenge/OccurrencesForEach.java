package programmingChallenge;

import java.util.*;

class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences");

        int[] nums = ArrayUtility.inputArray();
        System.out.println("Now , enter the number you want to search : ");
        int target = input.nextInt();
        int occ = countOccurrences(nums, target);
        System.out.println("The number " + target + " occurs " + occ + " times in  the array");
        
        
    }
    public static int countOccurrences(int[] nums, int target) {
        int occ = 0;
        for (int num  : nums) {
            if (num == target) {
                occ++;
    }}
    return occ;
    }}
    


