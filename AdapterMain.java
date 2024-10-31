public class AdapterMain {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer(); //error here, maybe implement or inherit or import?

        
        // 1. Rectangle1 that is visible
        Rectangle rectangle1 = new Rectangle();
        drawer.addBasicShape(rectangle1);

        // 2. Rectrangle2 in background
        Rectangle rectangle2 = new Rectangle();
        rectangle2.changeVisibility(); // rectangle2 IS IN BACKGROUND
        drawer.addBasicShape(rectangle2);

        // 3. Circle1 that is visible
        Circle circle1 = new Circle();
        drawer.addBasicShape(circle1);

        // 4. Circle2 in background 
        Circle circle2 = new Circle();
        circle2.changeVisibility(); // cirlce2 Is IN BACKGROUND
        drawer.addBasicShape(circle2);

        // 5. Rectangle3 that is visible
        Rectangle rectangle3 = new Rectangle();
        drawer.addBasicShape(rectangle3);

        // 6. Triangle1 that is visible with "Other color"
        Triangle triangle1 = new Triangle("Other color");
        ShapeAdapter triangleAdapter1 = new ShapeAdapter(triangle1); // integrating shapespecial
        drawer.addBasicShape(triangleAdapter1);

        // 7. Diamond1 that is visible with "PURPLE"
        ShapeDiamond diamond1 = new ShapeDiamond("PURPLE");
        ShapeAdapter diamondAdapter1 = new ShapeAdapter(diamond1);
        drawer.addBasicShape(diamondAdapter1);

        // 8. Diamond2 in background with "somethingElse"
        ShapeDiamond diamond2 = new ShapeDiamond("somethingElse");
        ShapeAdapter diamondAdapter2 = new ShapeAdapter(diamond2);
        diamondAdapter2.changeVisibility(); // swtiching visibility with diamondAdaptor
        drawer.addBasicShape(diamondAdapter2);

        // 9. Diamond3 in background with "Yellow" and dimensions 4.0 and 4.0
        ShapeDiamond diamond3 = new ShapeDiamond(4.0, 4.0, "Yellow");
        ShapeAdapter diamondAdapter3 = new ShapeAdapter(diamond3);
        diamondAdapter3.changeVisibility(); // swtiching visibility with diamondAdaptor
        drawer.addBasicShape(diamondAdapter3);

        // 10. Triangle2 in background with "Blue" and dimensions 6.0, 6.0, 6.0
        Triangle triangle2 = new Triangle(6.0, 6.0, 6.0, "Blue");
        ShapeAdapter triangleAdapter2 = new ShapeAdapter(triangle2); // integrating shapespecial
        triangleAdapter2.changeVisibility(); // same as above
        drawer.addBasicShape(triangleAdapter2);

        // 11. Diamond4 is visible with "Green" and dimensions 1.0 and 1.0
        ShapeDiamond diamond4 = new ShapeDiamond(1.0, 1.0, "Green");
        ShapeAdapter diamondAdapter4 = new ShapeAdapter(diamond4);
        drawer.addBasicShape(diamondAdapter4);

        // 12. BrushStroke1 is in background
        BrushStroke brushStroke1 = new BrushStroke();
        brushStroke1.changeVisibility();
        drawer.addBasicShape(brushStroke1);

        // 13. BurshStroke2 is visible with "someColor"
        BrushStroke brushStroke2 = new BrushStroke();
        brushStroke2.setColor("someColor"); // setting color for brush stroke
        drawer.addBasicShape(brushStroke2);

        // 14. BrushStroke3 is visible with "RED"
        BrushStroke brushStroke3 = new BrushStroke();
        brushStroke3.setColor("RED"); // setting color for brush stroke
        drawer.addBasicShape(brushStroke3);



        drawer.draw();
        drawer.grow();
        drawer.showVisibility();

    }
    
}

