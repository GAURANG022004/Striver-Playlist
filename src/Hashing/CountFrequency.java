package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        CountNumber(arr);
    }


    public static void CountNumber(int arr[]){

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);

    }
}
