public class insertionSort {
    public static void main(String[] args) {
        
        int arr[]={2,1,-1,8,-3,5,2,6,2,10};
        inserrtionSORT(arr);
        for(int i:arr) System.out.print(i + " ");
    }

    private static void inserrtionSORT(int[] arr) {

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                int j=i;
                while(j-1>=0 && !(arr[j]>arr[j-1])){
                    swap(j,j-1,arr);
                    j--;
                }
            }
        }
    }

    private static void swap(int j, int i, int[] arr) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
