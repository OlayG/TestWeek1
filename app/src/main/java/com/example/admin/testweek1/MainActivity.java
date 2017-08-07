package com.example.admin.testweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    static Scanner sc = new Scanner(System.in);
    static Stack stringStack = new Stack();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String wordToCheckIfPalindrome = "madam";
        int numToCheckIfArmstrong = 153;

        System.out.println("Is " + wordToCheckIfPalindrome + " a palindrome? " + isStringPalindrome(wordToCheckIfPalindrome));
        System.out.println("Is " + numToCheckIfArmstrong + " a Armstrong Number? " + isArmstrongNumber(numToCheckIfArmstrong));

        getFourStringItems();

    }
    private static void getFourStringItems() {

        for(int i = 0; i < 4; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            String word = sc.nextLine();
            stringStack.push(word);
        }

        System.out.println("Items in stack are:");
        while(stringStack.size() > 0) {
            System.out.println(stringStack.pop());
        }

    }

    private static boolean isArmstrongNumber(int num) {
        int numLength = String.valueOf(num).length();
        int tempNum = num;
        int sum = 0;
        if(num < 1) {
            return false;
        }

        for(int i = 0; i < numLength; i++) {
            sum += Math.pow((tempNum % 10), numLength);
            tempNum = tempNum/10;
        }

        if(sum == num)
            return true;

        return false;
    }

    private static boolean isStringPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end --;
        }

        return true;
    }

}
