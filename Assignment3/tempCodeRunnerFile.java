    private static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    private static int NcR(int n,int r){
        int num = factorial(n);
        int denom = factorial(n-r)*factorial(r);
        return num/denom;
    }