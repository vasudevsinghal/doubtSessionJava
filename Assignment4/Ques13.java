package DoubtSession.Assignment4;

public class Ques13 {
    public static void main(String[] args) {
        String str = "hhheeeelllllllooooo";
        System.out.println(res(str, 0));
    }
    public static String res(String str, int i){
        if(i==str.length()-1){
            return ""+str.charAt(str.length()-1);
        }

        if(str.charAt(i)==str.charAt(i+1)){
            return res(str, i+1);
        }
        else {
            return str.charAt(i) + res(str, i+1);
        }
    }
}
