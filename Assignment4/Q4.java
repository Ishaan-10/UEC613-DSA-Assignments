import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularQueue cq = new CircularQueue(5);
        while(true){
            System.out.println("Choose the following command");
            System.out.println("1.Insert in Queue");
            System.out.println("2.Remove from Queue");
            System.out.println("3.Check Queue Size");
            System.out.println("4.Check if Queue is full");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter element to insert");
                    cq.enqueue(sc.nextInt());
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    System.out.println("Is Empty - " + cq.isEmpty());
                    break;
                case 4:
                System.out.println("Is Full - " + cq.isFull());
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("Do you wish to continue? (y/n)");
            String toContinue=sc.next();
            if(toContinue.equals("n")) break;
        }
        
    }

    public static class CircularQueue{

        private ArrayList<Integer> nums;
        private int size;
        private int max_size;

        CircularQueue(int size){
            nums=new ArrayList<>();
            this.max_size=size;
            this.size=0;
        }

        void enqueue(int element){
            if(size==max_size){
                System.out.println("Queue is full");
                return;
            }
            nums.add(element);
            size++;
        }

        void dequeue(){
            if(size==0){
                System.out.println("Already Empty");
                return;
            }
            nums.remove(0);
            size--;
        }
        
        boolean isEmpty(){
            return this.size==0;
        }

        boolean isFull(){
            if(this.max_size==this.size) return true;
            else return false;
        }
        
    }
}
