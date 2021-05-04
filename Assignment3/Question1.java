package DoubtSession.Assignment3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int n , m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int col = 0;
        while (col < m){
            int row;
            if(col%2==0){
                row = 0;
            }
            else {
                row = n-1;
            }

            while(row>=0 && row<n){
                System.out.print(arr[row][col]+" ");
                if(col%2==0){
                    row++;
                }
                else {
                    row--;
                }
            }

            col++;
        }
    }
}
