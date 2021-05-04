package DoubtSession.Assignment2;


// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

public class Ques18a {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int ans = 0;

        for(int i =0; i<arr.length; i++){
            for(int j=i; j< arr.length ; j=j+2){
                if(i==0){
                    ans += prefix[j];
                }
                else{
                    ans += prefix[j] - prefix[i-1];
                }
            }
        }
        return ans;
    }

}
