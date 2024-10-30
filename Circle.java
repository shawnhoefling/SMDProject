// completed
public class Circle extends Visibility implements ShapeBasic {
    public Circle() { // look into constructor here
        //constructor 
    }
    public void draw() {
        System.out.println("This is a circle");

    }
    public void grow() {
        System.out.println("Growing the size of the circle");
    }
    public String printText() {
        return "Circle";
    }
}
/*
 Add the required content and functionality shown in the class diagram above and following the instructions below.

The method draw() must output the text "This is a circle" (not actually drawing anything).
The method grow() must output the text "Growing the size of the circle" (not actually resizing anything).
The method printText() must return the text "Circle".
 */