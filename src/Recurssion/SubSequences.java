package Recurssion;

import java.util.ArrayList;

public class SubSequences {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list1.add(0, 3);
        list1.add(1, 1);
        list1.add(2, 2);

        int idx = 0;
        subs(idx, list1, list);

    }

    public static void subs(int idx, ArrayList list1, ArrayList list){  //arr = {3,1,2}

        if(idx >= 3){
            System.out.println(list);
            return;
        }

        list.add(list1.get(idx));
        subs(idx+1, list1, list);

        list.remove(list.size() - 1);
        subs(idx+1, list1, list);

    }
}
