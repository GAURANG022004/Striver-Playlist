package SortingAlgorithm.MediumLevelQuestion;

import java.util.HashMap;

public class Medium {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        twoSum(arr, 5);

    }
    public static void twoSum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int res1 = -1;
        int res2 = -1;
        for(int num : arr){

            if(map.containsKey(sub)){
                res1 = num;
                res2 = map.get(sub);
            }else{
                map.put(num, i);
                i++;
            }
        }

        System.out.println("res1 : "+res1+" res2 : "+res2);
    }
}
