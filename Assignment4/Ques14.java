package DoubtSession.Assignment4;

import java.util.Stack;

public class Ques14 {
    public static void main(String[] args) {
        String str = "[a + {b +(c+d) + e} + f]";
        Stack<Character> stack = new Stack<>();
        System.out.println(res(str, 0, stack));
    }
    public static boolean res(String str, int i, Stack<Character> stack){
        if(str.length() == i){
            if (stack.empty()){
                return true;
            }
            return false;
        }

        if(str.charAt(i)=='['){
            stack.push('[');
            return res(str, i+1, stack);
        }
        else if(str.charAt(i)==']'){
            if (!stack.empty() && stack.pop()=='['){
                return res(str, i+1, stack);
            }
            return false;

        }
        else if(str.charAt(i)=='{'){
            stack.push('{');
            return res(str, i+1, stack);
        }
        else if(str.charAt(i)=='}'){
            if (!stack.empty() && stack.pop()=='{'){
                return res(str, i+1, stack);
            }
            return false;
        }
        else if(str.charAt(i)=='('){
            stack.push('(');
            return res(str, i+1, stack);
        }
        else if(str.charAt(i)==')'){
            if (!stack.empty() && stack.pop()=='('){
                return res(str, i+1, stack);
            }
            return false;
        }
        else {
            return res(str, i+1, stack);
        }
    }
}
