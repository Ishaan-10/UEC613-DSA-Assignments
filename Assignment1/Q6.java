// Write a class for a rectangle. Create objects for this class and call the member functions to
// find the area and perimeter of the rectangle.

public class Q6 {
    
    public static void main(String[] args) {
        
        Rectangle a = new Rectangle(10, 10);
        System.out.println("Area = " + a.area());
        System.out.println("Perimeter = " + a.perimeter());
    }
}

class Rectangle{

    int length;
    int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

}
