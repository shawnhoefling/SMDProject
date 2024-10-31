public class ShapeAdapter extends Visibility implements ShapeBasic {
    private ShapeSpecial shapeSpec; // 
    ShapeAdapter(ShapeSpecial shapeSpec){ // constructor 
        this.shapeSpec = shapeSpec; // 
    }
    @Override // overriding as its overriding an interface
    public void draw(){ // draw calls drawshape method on shapeSpec object
        shapeSpec.drawShape();
    }

    @Override
    public void grow(){ // uses printText() to return shape and add cannot grow
        System.out.println(printText() + ", cannot grow");
    }

    @Override
    public String printText(){  // using instanceof to ensure its correct class 
        if (shapeSpec instanceof Triangle) { // TODO Triangle class not implemented yet
            return "Triangle";
        }
        else if (shapeSpec instanceof ShapeDiamond) { // TODO Diamond class not implemented yet
            return "ShapeDiamond";

        }
        else {
            return "This shape is not supported";
        }

    }
    
}
