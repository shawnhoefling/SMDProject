public class AdapterMain {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer(); //error here, maybe implement or inherit or import?

        
        // Shape objects, 3 rectangles, 2 circles
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        Circle circle = new Circle();
        Circle circle2 = new Circle();


        // changing visibility, error here under changeVisibility
        //rectangle.changeVisibility();
        rectangle2.changeVisibility();
        //rectangle3.changeVisibility();
        circle.changeVisibility();
        //circle2.changeVisibility();

        // adding shapes to Shape drawer through var drawer
        drawer.addBasicShape(rectangle);
        drawer.addBasicShape(rectangle2);
        drawer.addBasicShape(rectangle3);
        drawer.addBasicShape(circle);
        drawer.addBasicShape(circle2);

        drawer.draw();
        drawer.grow();
        drawer.showVisibility();
/* 
        for(int i=0; i < 5; i++) { // calling draw and grow 5 times
            drawer.draw();
            drawer.grow();
        }
*/

    }
    
}

/*
 Add the required content and functionality shown in the class diagram & following instructions.


In the main method you must...

Create a ShapeDrawer object to be your drawing object (like a canvas where you add objects)
Create a few objcets (as given below) and add those objects to your drawing...
Add a rectangle which is visible
Add a rectangle which is in the background
Add a circle which is visible
Add a circle which is in the background
Add a rectangle which is visible
Draw your drawing (call the method draw() on it, not on individual objects created in the main method)
Grow the size of your drawing (call the method grow() on it, not on individual objects created in the main method)
Print all shapes in your drawing by calling the method showVisibility() on your drawing. 
The output for each shape (included in the drawing) will include its order number in the drawing, information whether the shape is visible or not, and the type of the shape (see example output below). Finally, the number of objects in the drawing will be shown.


So, the main method is rather short in itself. Study the instructions with care! After implementing all required classes and the main method, test your program.

After testing, continue with the changes for the phase 2...


Expected output from the program (Phase 1)

    This is a rectangle
    This is a rectangle
    This is a circle
    This is a circle
    This is a rectangle
    Growing the size of the rectangle
    Growing the size of the rectangle
    Growing the size of the circle
    Growing the size of the circle
    Growing the size of the rectangle

    1. shape is visible: Rectangle
    2. shape is in the background: Rectangle
    3. shape is visible: Circle
    4. shape is in the background: Circle
    5. shape is visible: Rectangle
    Total number of shapes: 5
 */