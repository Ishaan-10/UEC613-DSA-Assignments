public class bubbleSort {
    
    public static void main(String[] args) {
        int arr[]={1,4,2,8,2,9,3,0,2,4,6};
        bubbleSort(arr);
        for(int i:arr) System.out.print(i + " ");
    }

    private static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j, j+1, arr);
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
