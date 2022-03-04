import java.util.Scanner;

public class Q3 {

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        ListNode h1 = generateLL();
        bubbleSort(h1);
    }

    private static void bubbleSort(ListNode head){
        if(head==null || head.next==null) return;
        boolean sorted=false;

        while(sorted==false){
            ListNode prev=head;
            ListNode curr = head.next;
            boolean swap = false;
            while(curr!=null){
                if(curr.data<prev.data){
                    int temp = prev.data;
                    prev.data=curr.data;
                    curr.data=temp;
                    swap=true;
                }
                prev=curr;
                curr=curr.next;
            }
            if(swap==false) sorted=true;
        }
        display(head);
    }

    static ListNode generateLL(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of LL");
        int n =sc.nextInt();
        System.out.println("Enter elements");
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp=head;

        for(int i=0;i<n-1;i++){
            temp.next = new ListNode(sc.nextInt());
            temp=temp.next;
        }
        return head;
    }
    
    static void display(ListNode head){

        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}
