package Recurssion;

import java.util.Scanner;

public class StringRecursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isPalindrome(s,0, s.length() - 1);

    }

    public static void isPalindrome(String s, int i, int j){

        if(i >= j){
            System.out.println("It is Palindrome");
            return;
        }

        if(s.charAt(i) != s.charAt(j)){
            System.out.println("It is not Palindrome");

            return;

        }

        isPalindrome(s, i+=1, j-=1);



    }
}
