package STACK;

import java.util.Stack;
//REFER LEETCODE DEFINITELY

//TC=O(N) SC=O(N)
public class StackBalancedParanthesis {
    static boolean isBalanced(String p) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(' || p.charAt(i) == '[' || p.charAt(i) == '{') {
                s.push(p.charAt(i));
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                char c = s.pop();
                if ((c == '(' && p.charAt(i) == ')') || (c == '{' && p.charAt(i) == '}')
                        || (c == '[' && p.charAt(i) == ']')) {
                    continue;// cause what if there is a case like [{[]}
                    // It will return true if at last we wont check if stack is empty or not so
                    // continue from here and dont return anything
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String p = "[({})";
        System.out.println(isBalanced(p));
    }
}