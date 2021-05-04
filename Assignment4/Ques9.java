package DoubtSession.Assignment4;

public class Ques9 {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(res(str, 0));
    }
    public static boolean res(String str, int i){

        if(str.charAt(i)=='a'){
            if (i+1 < str.length() && str.charAt(i+1)=='a'){
                return res(str, i+1);
            }
            else if(i+2 < str.length() && str.charAt(i+2)=='b'){
                return res(str, i+2);
            }
            else if(i == str.length()-1){
                return true;
            }
        }
        else {
            if(i==0){
                return false;
            }

            if (i+1 < str.length() && str.charAt(i+1)=='a'){
                return res(str, i+1);
            }
            else if(i == str.length()-1){
                return true;
            }
        }
        return false;
    }
}
