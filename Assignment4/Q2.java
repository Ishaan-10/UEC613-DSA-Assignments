import java.util.Stack;
public class Q2 {
    public static void main(String[] args) {
        System.out.println(postfixEvaluation("231*+9-"));
    } 

    private static int postfixEvaluation(String str){

        Stack<Integer> nums = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                nums.add(ch-'0');
            }else if(ch=='+' || ch=='-' || ch=='/' || ch=='*'){

                while(op.size()>=1 && precdence(ch) <= precdence(op.peek())){
                    int val2 = nums.pop();
                    int val1 = nums.pop();
                    char operator = op.pop();
                    nums.push(operation(val1, val2, operator));
                }
                op.push(ch);
            }

        }
        while(nums.size()>1){
            int val2 = nums.pop();
            int val1 = nums.pop();
            char operator = op.pop();
            nums.push(operation(val1, val2, operator));
        }

        return (nums.pop());
        
    }

    private static int precdence(char ch){
        if(ch=='+' || ch=='-') return 1;
        else return 2;
    }

    private static int operation(int val1,int val2,char ch){
        if(ch=='+') return val1+val2;
        else if(ch=='-') return val1-val2;
        else if(ch=='*') return val1*val2;
        else return val1/val2;
    }
}
