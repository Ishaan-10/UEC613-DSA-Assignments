

public class Q4 {
    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        

    }

    private static boolean isLLlooped(ListNode head){
        if(head==null || head.next==null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            if(fast==slow) return true;
            fast=fast.next.next;
            slow=slow.next;
        }

        return false;
    }
}
