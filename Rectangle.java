// completed

public class Rectangle extends Visibility implements ShapeBasic {
    public Rectangle() {
        // constructor
    }
    public void draw() {
        System.out.println("This is a rectangle");
    }
    public void grow() {
        System.out.println("Growing the size of the rectangle");
    }
    public String printText() {
        return "Rectangle";
    }
}
/*
 Add the required content and functionality shown in the class diagram above and following the instructions below.

The method draw() must output the text "This is a rectangle" (not actually drawing anything).
The method grow() must output the text "Growing the size of the rectangle" (not actually resizing anything).
The method printText() must return the text "Rectangle".
 */