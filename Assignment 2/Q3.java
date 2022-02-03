public class Q3 {
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        display(maxMin(arr));

    }
    private static int findSingleElement(int arr[],int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element) return i;
        }
        return -1;
    }
    
    private static int findDuplicatesInSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]) return arr[i];
        }
        return -1;
    }
    private static int findDuplicatesInUnSorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]) return arr[i];
            }
        }
        return -1;
    }
    private static int[] pairWithSumK(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i!=j && arr[i]+arr[j]==k) return new int[]{arr[i],arr[j]};
            }
        }
        return new int[]{};
    }
    private static int[] maxMin(int arr[]){
        int min=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(arr[i], max);
            min = Math.min(arr[i],min);
        }
        int sol[]={min,max};
        return sol;
    }
    private static void display(int[] arr) {
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
