package DoubtSession.Assignment2;

import java.util.ArrayList;


// https://leetcode.com/problems/create-target-array-in-the-given-order/

public class Ques18i {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>(nums.length);

        for(int i = 0; i< nums.length; i++){
            arr.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];

        int j = 0;
        for(int nu: arr){
            ans[j] = nu;
            j++;
        }

        return ans;
    }
}
