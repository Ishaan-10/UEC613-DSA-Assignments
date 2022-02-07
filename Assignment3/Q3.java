public class Q3 {
    
    public static void main(String[] args) {
        int n =5;
        int r=2;
        System.out.println(NcR(n, r));

    }

    private static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    private static int NcR(int n,int r){
        int num = factorial(n);
        int denom = factorial(n-r)*factorial(r);
        return num/denom;
    }
}
