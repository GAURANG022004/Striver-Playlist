package Recurssion;

import java.util.Scanner;

public class PrintingNTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        printing(n);
        int i = 1;
//        printingNTimes(i, n);
//        printingWithUnwind(n);
        int sum = 0;
//        System.out.println(sumOfNumber(sum, n));
        int fac = 1;
//        System.out.println(factorialOfNumber(fac, n));

        int arr[] = {5,4,3,2,1};
        int res[] = new int[arr.length];
        int len = 0;
//        int rev[] = ReverseArray(arr, len, res);
//
//        for(Integer num : rev){
//            System.out.print(num+" ");
//        }

        System.out.println(fib(n));
    }

    public static void printing(int n){
        if(n == 0){
            return;
        }

        System.out.println("printing : " + n);
        printing(n - 1);
    }

    public static void printingNTimes(int i, int n){

        if(i == n+1){
            return;
        }

        System.out.println("printing i : " + i);
        printingNTimes(i + 1, n);
    }

    public static void printingWithUnwind(int n){

        if(n == 0){
            return;
        }

        printingWithUnwind(n - 1);
        System.out.println("printing : " + n);
    }

    public static int sumOfNumber(int sum, int n){
        if(n == 0) return sum;
        sum += n;
        return sumOfNumber(sum, n - 1);
    }

    public static int factorialOfNumber(int fac, int n){
        if(n == 0) return fac;
        fac *= n;
        return factorialOfNumber(fac, n - 1);
    }

    public static int[] ReverseArray(int arr[], int len, int res[]){

        if(len == arr.length){
            return res;
        }

        res[len] = arr[arr.length - 1 - len];

        return ReverseArray(arr, len + 1,res);



    }

    public static int fib(int n){
        if(n <= 1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

}


