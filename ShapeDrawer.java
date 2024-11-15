public class ShapeDrawer extends Drawing<ShapeBasic> { 
    public ShapeDrawer() {
        //constructor 
    }
    public void draw(){ 
        if(shapeList.isEmpty()) { // check if drawing (or list) is empty, if not, then go through with drawing of shapes
            System.out.println("Drawing is empty!");
        }
        else {
            for(ShapeBasic shape : shapeList) {
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

