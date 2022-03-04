import java.util.Scanner;

public class Q2 {

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
        ListNode h2 = generateLL();
        sum(h1,h2);        
    }


    private static int sum(ListNode h1, ListNode h2) {

        ListNode rh1 = reverseLinkedList(h1);
        ListNode rh2 = reverseLinkedList(h2);

        int carry=0;
        String sum="";
        int mul=1;

        while(rh1!=null || rh2!=null || carry>0){
            int digitsum=0;
            if(rh1!=null){
                digitsum+=rh1.data;
                rh1=rh1.next;
            }
            if(rh2!=null){
                digitsum+=rh2.data;
                rh2=rh2.next;
            }
            digitsum+=carry;
            carry = digitsum/10;
            sum = (digitsum%10)+sum;
        }
        System.out.println(sum);
        return Integer.parseInt(sum);
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
