public class Q4 {
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonnaci(n));
    }
    private static int fibonnaci(int n){
        if(n<=1) return n;
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
}
