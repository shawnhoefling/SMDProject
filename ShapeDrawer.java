public class ShapeDrawer extends Drawing<ShapeBasic> { // look into parameterization of ShapeBasic () maybe? 
    public ShapeDrawer() {
        //constructor 
    }
    public void draw(){ //check private and public implementations of each
        if(shapeList.isEmpty()) { // check if drawing (or list) is empty, if not, then go through with drawing of shapes
            System.out.println("Drawing is empty!");
        }
        else {
            for(ShapeBasic shape : shapeList) {
                //System.out.println("Drawing the " + shape.getClass().getSimpleName());
                shape.draw();
            }
        }

    } 
    public void grow(){
        if(shapeList.isEmpty()) {
            System.out.println("Drawing is empty!");
        }
        else {
            // add growing shape here
            for(ShapeBasic shape : shapeList) {
                System.out.println("Growing the size of the " + shape.getClass().getSimpleName());
                shape.grow();
            }
        }
    }
    public void showVisibility(){
        if(shapeList.isEmpty()) {
            System.out.println("Drawing is empty!");
        }
        else {
            int index = 1;
            for (ShapeBasic shape : shapeList) {
                boolean visible = shape.isVisible();
                String visibility = visible ? "visible" : "in the background";
                System.out.println(index + ". shape is " + visibility + ": " + shape.getClass().getSimpleName());
                index++;
            }
            System.out.println("Total number of shapes: " + shapeList.size());
        }
    }
}

/*
 Add the required content and functionality shown in the class diagram & following instructions.

The method draw() must "draw" each shape included in the drawing (according to the functionality provided by each shape). You must check if there are no shapes in the drawing, i.e., if the drawing is empty. If there are no shapes in the drawing, the method will output "Drawing is empty!".
The method grow() must "grow the size" of each shape included in the drawing (according to functionality provided by each shape). You must check if there are no shapes in the drawing, i.e., if the drawing is empty. If there are no shapes in the drawing, the method will output "Drawing is empty!".
The method showVisibility() must traverse the shapes included in the drawing. You must check if there are no shapes in the drawing, i.e., if the drawing is empty. If there are no shapes in the drawing, the method will output "Drawing is empty!". 
If there are shapes in the drawing, for each shape the method must...
Check whether a shape is visible or in the background.
Output the sequence number of the shape (the first shape to be added to the drawing will be 1. and the second shape in the drawing will be 2. etc.).
Output whether the shape is visible or in the background
Output the type of the shape.
Finally, at the end of the method, the method will output the number of shapes in the drawing.

For example, to test the implementation so far (phase 1), in the main program, create objects described below and add them to your drawing (of type ShapeDrawer). The first shape to be added to the drawing is a visible object of the class Rectangle. The second shape to be added to the drawing is an object of the Rectangle class which must be hidden (is in the background). Then there is a hidden object of class Circle.

You can check the expected output from the instructions for the AdapterMain.java class.

For the three shapes described above the output would be...


This is a rectangle
This is a rectangle
This is a circle

Growing the size of the rectangle
Growing the size of the rectangle
Growing the size of the circle

1. shape is visible: Rectangle
2. shape is in the background: Rectangle
3. shape is in the background: Circle

Total number of shapes: 3


 */