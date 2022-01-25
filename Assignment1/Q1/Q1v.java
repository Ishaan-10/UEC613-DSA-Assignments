// Prints the English name of an integer from 1 to 9.
public class Q1v {
    
    public static void main(String[] args) {
        
        System.out.println(integerString(1));

    }

    private static String integerString(int n){
        String nums[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        return nums[n];
    }
}
