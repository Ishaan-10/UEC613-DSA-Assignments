
// computes and returns the greatest common divisor (g.c.d.) of the arguments passed to it.
public class Q1iii {
    
    public static void main(String[] args) {
        
        int n = gcd(24,36);
        System.out.println(n);

    }

    private static int gcd(int a,int b) {

        if(b==0) return a;

        return gcd(b,a % b);
    }

    // 1 2 2 3 4 5
    // 1 2 0 3 4 5
    // 1 2 0

}
