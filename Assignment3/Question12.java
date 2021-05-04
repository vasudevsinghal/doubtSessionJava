package DoubtSession.Assignment3;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String ans = "";

        for (int i = 0; i <str.length()-1 ; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            int diff = ch2 - ch1;
            ans += ch1;
            ans += diff;
        }

        ans += str.charAt(str.length()-1);

        System.out.println(ans);
    }
}
