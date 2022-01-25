// computes and returns the sum of all the integers between "first" and "last" inclusive.

public class Q1i{

    public static void main(String[] args) {
        
        int n1 =10;
        int n2= 20;
        
        int sum = calculateSum(n1,n2);
        System.out.println("Total Output = " + sum);

    }

    private static int calculateSum(int n1, int n2) {
        int sum1 = (n2 *(n2+1))/2;
        int sum2 = (n1 * (n1+1))/2;
        return sum1- sum2 +n1;
    }
}