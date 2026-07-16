package BasicMath.NumbersOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        System.out.println("Count : "+countNumber(n));
//        System.out.println();
//        System.out.println("Reverse Number of "+n+" is : "+reverseNumber(n));
//        System.out.println();
//        isPalindrome(n);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("GCD of ("+a+","+b+") is : "+GCD(a,b));
//        System.out.println("LCM of ("+a+","+b+") is : "+LCM(a,b));
//        isArmstrong(n);
//        showDivisors(n);
//          isPrime(n);

    }

    public static int countNumber(int n){
        int count = 0;

        while(n != 0){
            n = n/10;
            count++;
        }

        return count;

    }

    public static int reverseNumber(int n){
        int reversed = 0;
        while(n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return reversed;
    }

    public static void isPalindrome(int n){
        int res = reverseNumber(n);
        if(res == n){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }

    public static int GCD(int a, int b){

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int LCM(int a, int b){

        int GCD = GCD(a, b);

        return Math.abs(a * b)/GCD;
    }

    public static void isArmstrong(int n){
        int power = countNumber(n);
        int sum = 0;
        int original = n;
        while(n != 0){
            sum += Math.pow(n % 10, power);
            n = n/ 10;
        }

        if(sum == original){
            System.out.println("The Number : "+n+" It is Armstrong");
        }
        else{
            System.out.println("The Number : "+n+" It is not Armstrong");
        }



    }

    public static void showDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n); i++){
            if(n % i == 0){

                list.add(i);

                if(i != (n/i)){
                    list.add(n / i);
                }
            }
        }

        System.out.println(list);

    }

    public static void isPrime(int n){
        for(int i=1;i*i<n;i++){
            if(n % i == 0){
                System.out.println("It is Prime ");
            }else{
                System.out.println(" Not a Prime");
            }
        }
    }

}
