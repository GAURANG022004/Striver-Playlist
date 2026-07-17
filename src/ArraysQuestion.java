import java.util.Scanner;

public class ArraysQuestion
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The size of Array : ");
        int n = sc.nextInt();

        System.out.print("Enter the K Value : ");
        int k = sc.nextInt();


//        int arr[] = new int[n];
//        for(int i = 0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }

        int arr[] = {-1,-100,3,99};



//        reverseArrayByOne(arr);

        LeftRotateArrayBy_Kplace(arr, k);
    }


    public static void reverseArrayByOne(int arr[]){
        int n = arr.length;

        int temp = arr[0];

        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }

        arr[n - 1] = temp;

        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void LeftRotateArrayBy_Kplace(int arr[], int k){

        int n = arr.length;

        //seperately reverse the array
        //use 2 pointer for reverse before kth elements
        k %= n;
        if(k == 0 || k == n) return;


        int i=0, j = (n-k) - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        int p = n-k, q = n - 1;

        while(p < q){
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }

        int a = 0, b = n - 1;
        while(a < b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }



        // 1 2 3 4 5
        // 2 1
        // 5 4 3
        // 2 1 5 4 3
        // 3 4 5 1 2


        for(int num : arr){
            System.out.print(num + " ");
        }


    }


    public static void moveszero(int arr[]) {

        int n = arr.length; //1, 2 , 0, 4, 0, 6, 7

        for(int i=1; i<n; i++){
            if(arr[i-1] == 0){
                arr[i-1] = arr[i];
            }

    }
}




}
