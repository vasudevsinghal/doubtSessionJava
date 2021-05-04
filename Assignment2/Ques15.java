package DoubtSession.Assignment2;

public class Ques15 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 9, 7, 5, -1, 6};
        int target = 9;


        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k] == target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }

    }
}
