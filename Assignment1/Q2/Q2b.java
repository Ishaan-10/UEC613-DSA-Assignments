// write a program to find maximum of elements of an array
public class Q2b {
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        int ans = findMax(arr);
        System.out.println(ans);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        return max;
    }
}
