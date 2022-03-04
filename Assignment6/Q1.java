import java.util.Scanner;

public class Q1 {

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        ListNode head = generateLL();
        isPalindrome(head);
    }
    static void display(ListNode head){

        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    private static boolean isPalindrome(ListNode head1){

        ListNode mid = midLL(head1);
        ListNode head2=mid.next;
        mid.next=null;
        ListNode reversedHead2 = reverseLinkedList(head2);
        display(head1);
        display(reversedHead2);
        ListNode temp1=head1;
        ListNode temp2=reversedHead2;
        boolean ans=true;
        while(temp1!=null && temp2!=null){
            if(temp1.data != temp2.data){
                ans=false;
                break;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        head2 = reverseLinkedList(reversedHead2);
        mid.next=head2;
        display(head1);
        System.out.println(ans);
        return ans;
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

    private static ListNode midLL(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    static ListNode reverseLinkedList(ListNode head){
        ListNode prev=null;
        ListNode curr = head;
        while(curr!=null){
            ListNode fwd = curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
}