package DoubtSession.Assignment3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int ans = 0;

        for (int i = 0; i <n-k+1 ; i++) {
            int min = arr[i], max = arr[i];
            for (int j = i+1; j <i+k ; j++) {
                if(min>arr[j]) {
                    min = arr[j];
                }
                if(max<arr[j]) {
                    max = arr[j];
                }
            }

            ans += min+max;
        }

        System.out.println(ans);
    }
}
