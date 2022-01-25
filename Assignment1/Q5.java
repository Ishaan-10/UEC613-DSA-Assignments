// Q5. Write a program for Linear Search using Functions.

public class Q5 {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean ans = linearSearch(arr,2);
        System.out.println(ans);
    }

    private static boolean linearSearch(int[] arr, int i) {
        for(int val:arr){
            if(val==i) return true;
        }
        return false;
    }
}
