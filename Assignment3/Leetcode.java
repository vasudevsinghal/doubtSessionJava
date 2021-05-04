package DoubtSession.Assignment3;

// https://leetcode.com/problems/reverse-only-letters/

public class Leetcode {
    public String reverseOnlyLetters(String S) {
        char[] arr = new char[S.length()];
        for(int i =0; i<arr.length; i++){
            arr[i] = S.charAt(i);
        }

        int min = 0;
        int max = arr.length -1;

        while(min< max){
            while(min<max && !(arr[min]>=65 && arr[min]<=90) && !(arr[min]>=97 && arr[min]<=122)){
                min++;
            }

            while(min<max&& !(arr[max]>=65 && arr[max]<=90) && !(arr[max]>=97 && arr[max]<=122)){
                max--;
            }

            if(min>=max){
                break;
            }

            char temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min++;
            max--;
        }

        String str="";
        for(int i =0; i<arr.length; i++){
            str += arr[i];
        }


        return str;

    }
}
