public class shellSort {
    
    public static void main(String[] args) {
        int arr[]={2,1,-1,8,-3,5,2,6,2,10};
        shellSort(arr);
        for(int i:arr) System.out.print(i + " ");
    }
    private static void shellSort(int[] arr) {

        int n = arr.length;
        int gap=n/2;

        while(gap>0){
            for(int i=gap;i<n;i++){
                int j=i;
                while(j-gap>=0 && arr[j]<=arr[j-gap]){
                    swap(j, j-gap, arr);
                    j-=gap;
                }
            }
            gap/=2;
        }

    }
    private static void swap(int j, int i, int[] arr) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
// 5 4 3 2 1
// n = 5
// gap = 2

// 