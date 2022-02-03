public class Q1{
    public static void main(String[] args) {
        
        // int n = 10;
        int arr[]={1,2,3,4,5};
        display(arr);
        rotate(arr,3);
        display(arr); 
    }

    private static void display(int[] arr) {
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    private static int[] add(int arr[],int x){
        int newArr[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        newArr[arr.length]=x;
        return newArr;
    }

    private static int[] insert(int arr[],int index,int element){
        int newArr[]=new int[arr.length+1];
        int i;
        for(i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        newArr[i]=element;
        for(i=index+1;i<newArr.length;i++){
            newArr[i]=arr[i-1];
        }
        return newArr;
    }
    private static int[] delete(int arr[],int index){
        int newArr[]=new int[arr.length-1];
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for(int i=index;i<newArr.length;i++){
            newArr[i]=arr[i+1];
        }
        return newArr;
    }

    private static boolean linearSearch(int x,int arr[]){
        for(int val:arr){
            if(val==x) return true;
        }
        return false;
    }

    private static int get(int index,int arr[]){
        return arr[index];
    }

    private static void set(int index,int x,int arr[]){
        arr[index]=x;
    }

    private static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int val:arr){
            max=Math.max(max, val);
        }
        return max;
    }

    private static int min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int val:arr){
            min=Math.min(min, val);
        }
        return min;
    }
    
    private static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    private static void shift(int arr[]){
        int next = arr[0];
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            arr[i]=next;
            next=temp;
        }
        arr[0]=next;
    }

    private static void rotate(int arr[],int x){
        for(int i=0;i<x;i++){
            shift(arr);
        }
    }

}