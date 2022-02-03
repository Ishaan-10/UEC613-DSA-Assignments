public class Q2 {
    
     public static void main(String[] args) {
         
        int arr[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};
        int arr3[]=mergeArrays(arr, arr2);
        display(arr);
        display(arr2);
        display(arr3);

     }

     private static boolean isSorted(int arr[]) {
         for(int i=1;i<arr.length;i++){
             if(arr[i-1] > arr[i]) return false;
         }
         return true;
     }
     private static int[] mergeArrays(int a[],int b[]) {
         int n=a.length+b.length;
         int c[]=new int[n];
        int i=0,j,k;
         for(j=0;j<a.length;j++,i++){
             c[i]=a[j];
         }
         for(k=0;k<b.length;i++,k++){
             c[i]=b[k];
         }
         return c;
     }
     private static void display(int[] arr) {
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
     
}
