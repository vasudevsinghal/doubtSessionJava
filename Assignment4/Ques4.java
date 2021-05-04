package DoubtSession.Assignment4;

import java.util.ArrayList;

public class Ques4 {
    public static void main(String[] args) {
        int[] arr = {0, 4, 2, 2, 1, 2, 3, 4, 2};
        int target = 2;
        System.out.println(res(arr, 0, target));

    }
    public static ArrayList<Integer> res(int[] arr, int i, int target){
        if(i == arr.length){
            ArrayList<Integer> ar = new ArrayList<>();
            return  ar;
        }

        ArrayList<Integer> ar = res(arr, i+1, target);
        if(arr[i] == target){
            ar.add(i);
        }
        return ar;
    }
}
