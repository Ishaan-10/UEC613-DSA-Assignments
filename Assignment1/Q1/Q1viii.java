// Shifts the contents of array cells one cell to the right, with the last cell's contents
// moved to the left end

public class Q1viii {
    
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,5};
        shiftRight(nums);
        display(nums);

    }

    private static void shiftRight(int arr[]){

        int next = arr[0];
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            arr[i]=next;
            next=temp;
        }
        arr[0]=next;
    }
    private static void display(int[] nums) {
        for(int val:nums){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // 1 2 3 4 5 

    // 5 2 3 4 5 
    // 5 
}
