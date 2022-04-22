public class selectionSort {
    
    public static void main(String[] args) {
        int arr[]={1,4,2,8,2,9,3,0,2,4,6};
        selectionSort(arr);
        for(int i:arr) System.out.print(i + " ");
    }

    private static void selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(i, minIndex, arr);
        }
    }
    private static void swap(int j, int i, int[] arr) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
