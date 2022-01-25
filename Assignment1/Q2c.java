// write a program for linear search of an array
public class Q2c {
    
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
