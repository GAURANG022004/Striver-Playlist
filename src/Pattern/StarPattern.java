package Pattern;

import java.util.Scanner;

public class StarPattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        squarePattern(n);
        System.out.println();
        rightAngleTriangle(n);
        System.out.println();
        rightAngleNumber(n);
        System.out.println();
        rightAngleNumber2(n);
        System.out.println();
        reverseRightAngleTriangle(n);
        System.out.println();
        reverseRightAngleNumber(n);
        System.out.println();
    }

    public static void rightAngleTriangle(int n) {

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void squarePattern(int n){
        for(int i=0; i<n; i++ ){
            for(int j=0; j<n ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngleNumber(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

    public static void rightAngleNumber2(int n){
        for(int i=0;i<n;i++){
            for(int j = 0; j < i+1 ; j++ ){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    public static void reverseRightAngleTriangle(int n){
        for(int i=n; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseRightAngleNumber(int n){
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}