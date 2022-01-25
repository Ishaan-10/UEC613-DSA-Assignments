// Determines whether an integer is prime

public class Q1iv {
    
    public static void main(String[] args) {
        int n = 7;
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    private static boolean isPrime(int n) {

        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
