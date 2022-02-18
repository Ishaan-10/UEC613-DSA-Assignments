// Copies numbers from two arrays into a third array. The numbers from the second array are placed to the right of the numbers copied from the first array.

public class Q1x {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10,15,20};

        int c[]=combineArrays(a,b);
        display(c);
    }
    private static int[] combineArrays(int[] a, int[] b) {
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(j<a.length){
            c[i]=a[j];
            i++;
            j++;
        }
        while(k<b.length){
            c[i]=b[k];
            i++;
            k++;
        }
        return c;
    }
    private static void display(int[] nums) {
        for(int val:nums){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
