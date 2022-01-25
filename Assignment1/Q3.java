// Q3. Write a program for adding and subtracting Matrices using 2D Arrays.

public class Q3 {    
    public static void main(String[] args) {
        
        // Dimensions of a and b should be same
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int b[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int c[][]=matrixSum(a,b);
        int d[][]=matrixSubtract(a,b);
        display(c);
        display(d);
    }

    private static int[][] matrixSubtract(int[][] a, int[][] b) {
        int c[][]=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]= a[i][j]-b[i][j];
            }
        }
        return c;
    }

    private static int[][] matrixSum(int[][] a, int[][] b) {
        int c[][]=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        return c;
    }
    private static void display(int[][] c) {
        for(int[] arr:c){
            for(int val:arr){
                System.out.print(val + " ");
            }
        System.out.println();
        }
    }


}
