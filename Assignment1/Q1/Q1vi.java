// Reverses the order of the objects in an array

public class Q1vi {
    
    public static void main(String[] args) {
        
        Integer nums[]={1,2,3,4,5};
        Character ch[]={'a','b','c','d'};
        display(reverseArray(nums));
        display(reverseArray(ch));

    }

    private static <T> T[] reverseArray(T arr[]){

        int i=0,j=arr.length-1;
        while(i<=j){
            T temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    
    private static <T> void display(T[] nums) {
        for(T val:nums){
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
