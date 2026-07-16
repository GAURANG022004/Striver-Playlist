package SortingAlgorithm;

import java.util.Scanner;

public class SelecionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];




        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }



//        SelectionSorting(arr);
//        BubbleSort(arr);

//       int res[] = mergeSort(arr);

//        for(int num : res){
//            System.out.print(num+" ");
//        }
//

//        insertionSort(arr);

        quickSort(arr, 0, n - 1);

    }

    public static void SelectionSorting(int arr[]){

        int min = 0;

        int n = arr.length;
        int i = 0;
        int j = i+1;

        while(i < n - 1) { // 5 4 3 2 1
            while (j < n) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                j++;

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            i++;
            j = i + 1;
            min = i;
        }

        for(int num : arr){
            System.out.print(num+" ");
        }

    }

    public static void BubbleSort(int arr[]){
        int n = arr.length;
        int last = n;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static int[] mergeSort(int arr[]){
        if(arr.length <= 1) return arr;
        boolean lefty = false;

        int left[] = DividingArray(arr,  true);
        int right[] = DividingArray(arr,  false);

        mergeSort(left);
        mergeSort((right));

        int[] mergedArray = Conquere(left, right);

        for(int i= 0 ; i < arr.length;i++){
            arr[i] = mergedArray[i];
        }


        return arr;

    }

    private static int[] Conquere(int[] left, int[] right) {
        int size1 = left.length;
        int size2 = right.length;

        int k[] = new int[size1 + size2];

        int i = 0;
        int j = 0;
        int ptr = 0;

        while(i < size1 && j < size2){
            if(right[j] < left[i]){
                k[ptr++] = right[j++];
            }
            else{
                k[ptr++] = left[i++];
            }
        }

        while(i < size1){
            k[ptr++] = left[i++];
        }

        while(j < size2){
            k[ptr++] = right[j++];
        }

        return k;
    }

    private static int[] DividingArray(int[] arr, boolean lefty) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int mid = l  + (r - l)/2;

//        System.out.println("n : "+ n);
//        System.out.print("mid : "+mid);

        int left[] = new int[mid + 1];
        for(int i=0;i<mid+1;i++){
            left[i] = arr[i];
        }

        int right[] = new int[n - left.length];
        for(int i=0; i< right.length; i++){
            right[i] = arr[(left.length) + i];
        }
        if(lefty){
            return left;
        }
        else{
            return right;
        }

    }

    public static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<=n-1;i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int num : arr){
            System.out.print(num+" ");
        }


    }

    public static void quickSort(int arr[], int low, int high){  // 35 50 15 25 80 20 90 45

        if(low >= high){
            return;
        }

        int pivot = arr[low];
        int i = low;
        int j = high;



        while(i < j){

            while(i <= high - 1 && arr[i] <= pivot){
                i++;
            }
            while(j >= low + 1 && arr[j] > pivot){
                j--;
            }

            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;


        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);

        System.out.println();
        for(int num : arr){
            System.out.print(num+" ");
        }


    }
}
