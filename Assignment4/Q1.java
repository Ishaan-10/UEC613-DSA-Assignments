import java.util.Stack;

public class Q1{
    public static void main(String[] args) { 
        System.out.println(bracketBalanced("()((()))"));
    }

    private static boolean bracketBalanced(String str){

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                if(st.isEmpty()) return false;
                if(st.peek()=='(') st.pop();
            }
        }

        return st.isEmpty();
    }
}