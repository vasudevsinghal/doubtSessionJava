package DoubtSession.Assignment3;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        String str = scanner.next();

        int ans=0;
        for(int i=0;i<str.length();i++) {
            int counta=0;
            int countb=0;
            for(int j=i;j<str.length();j++) {
                if(str.charAt(j)=='a') {
                    counta++;
                }
                else {
                    countb++;
                }

                if(counta>k && countb>k) {
                    break;
                }
                else {
                    ans=Math.max(ans, j-i+1);
                }
            }
        }
        System.out.println(ans);
    }
}
