package DoubtSession.Assignment4;

public class Ques15 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 2, 3, 3, 4, 5};

        System.out.println(res(0, arr, 0, 0));
        res1(0, arr, 0, 0, "", "");
    }
    public static int res(int i , int[] arr, int setA, int setB){
        if(i==arr.length){
            if (setA==setB){
                return 1;
            }
            return 0;
        }
        return res(i+1, arr, setA+arr[i], setB) + res(i+1, arr, setA, setB+arr[i]);
    }

    public static void res1(int i , int[] arr, int setA, int setB, String str1, String str2){
        if(i==arr.length){
            if (setA==setB) {
                System.out.println(str1+"and "+str2);
            }
            return;
        }
        res1(i+1, arr, setA+arr[i], setB, str1+arr[i]+" ", str2);
        res1(i+1, arr, setA, setB+arr[i], str1, str2+arr[i]+" ");
    }
}
