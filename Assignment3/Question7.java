package DoubtSession.Assignment3;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        int n , k;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }
        fun(arr, n, k);
    }

    public static void fun(int[] arr, int n, int k){
        for (int i = 0; i <=n-k ; i++) {
            int max = arr[i];
            for (int j = i+1; j <i+k; j++) {
                if(arr[j]>max){
                    max = arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }


}
