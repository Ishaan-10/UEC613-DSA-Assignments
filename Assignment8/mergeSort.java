public class mergeSort{

    public static void main(String[] args) {
        
        int arr[]={1,4,2,5,-2,4,7,-3};
        mergeSORT(arr,0,arr.length-1);
        for(int i:arr) System.out.print(i + " ");
    }

    private static void mergeSORT(int[] arr,int left,int right) {

        if(left>=right) return;

        int mid = (left+right)/2;
        mergeSORT(arr,left,mid);
        mergeSORT(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    static void merge(int arr[], int p, int q, int r) {


        int n1 = q - p + 1;
        int n2 = r - q;
    
        int L[] = new int[n1];
        int M[] = new int[n2];
    
        for (int i = 0; i < n1; i++)
          L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
          M[j] = arr[q + 1 + j];
    
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
    
        while (i < n1 && j < n2) {
          if (L[i] <= M[j]) {
            arr[k] = L[i];
            i++;
          } else {
            arr[k] = M[j];
            j++;
          }
          k++;
        }
    
        while (i < n1) {
          arr[k] = L[i];
          i++;
          k++;
        }
    
        while (j < n2) {
          arr[k] = M[j];
          j++;
          k++;
        }
      }
}