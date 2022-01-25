// Write a program to find sum of all elements of an array

public class Q2a {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int ans = elementSum(arr);
        System.out.println(ans);
    }

    private static int elementSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
