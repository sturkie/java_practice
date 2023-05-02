import java.util.*;
public class Main{
    public static boolean isPalindrome(String s) {
        // Write your code here
        // Tip: You may use the code template provided
        // in the TwoPointers.java file
        int left = 0;
        int right = s.length()-1;

        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left = left + 1;
                right = right - 1;
            }
            else{
                return false;
            }
            
        }

        return true;
    }
}