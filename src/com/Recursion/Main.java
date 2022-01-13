package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
        Given an integer x, return true if x is palindrome integer.
        An integer is a palindrome when it reads the same backward as forward.

        For example, 121 is a palindrome while 123 is not.

        Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.

        Example 2:
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
        Therefore it is not a palindrome.

        Example 3:
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
	 */
        System.out.println(palindrome(0));
    }
    public static boolean palindrome(int x){
        int n = x;
        int rem=0,rev=0;
        while(n!=0){
            rem = n%10;
            rev = rev*10 +rem;
            n = n/10;
        }
        if(x>=0 && rev==x){
            return true;
        }
        return false;
    }
}
