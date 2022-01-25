// Q4. Write a program to Multiply Matrices of 10X10.

public class Q4 {
    
    public static void main(String[] args) {
        // 10 x 10 matrix multiplication
        int a[][]={
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
        {1,2,3,4,5,6,7,8,9,10},
    };

        int b[][]={
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},
        };

        int c[][]=matrixMultiplication(a,b);
        display(c);

    }
    private static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = b[0].length;
        int matrix[][]= new int[rows][columns];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int sum=0;
                for(int k=0;k<a[0].length;k++){
                    sum+= (a[i][k]*b[k][j]);
                }
                matrix[i][j]=sum;
            }
        }
        return matrix;
    }

    private static void display(int[][] c) {
        System.out.println("Matrix of dimension " + c.length +" x "+c[0].length);
        for(int[] arr:c){
            for(int val:arr){
                System.out.print(val + " ");
            }
        System.out.println();
        }
    }
}
