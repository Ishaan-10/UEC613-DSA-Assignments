// Finds the index of the largest number in an array

public class Q1vii {
    
    public static void main(String[] args) {
        int nums[]={1,2,5,4,3,21,3};
        int largestIndex = largestNumIndex(nums);
        System.out.println("Largest num is at index " +largestIndex );

    }
    private static int largestNumIndex(int arr[]){

        int index=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
    return index;
    }
}
