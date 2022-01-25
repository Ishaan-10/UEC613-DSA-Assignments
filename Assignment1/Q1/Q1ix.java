// Examines an array of integers and eliminates all duplication of values. The distinct integers are all moved to the left part of the array.

import java.util.Arrays;

public class Q1ix{
    public static void main(String[] args) {
        
        int arr[]={1,2,4,5,6,2,1,3,5,6,4};
        int a[]=removeDuplicates(arr);
        display(a);
        

    }
    private static int[] removeDuplicates(int[] arr){

        Arrays.sort(arr);
        int c[] = new int[arr.length];
        c[0]=arr[0];
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                c[j]=arr[i];
                j++;
            }
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