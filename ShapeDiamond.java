import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored { 
    private double a = 2.0;
    private double b = 2.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond() { 
        // constructor 

    }

    public ShapeDiamond(String color) {
        setColor(color); // setting color usign setColor method 
    }
    
    public ShapeDiamond(double a, double b) { // sets side lengths a and b, checks if at least 2.0
        if(a >= 2.0) {
            this.a = a; // assign lengths a to this a, same with b 
        }
        if(b >= 2.0) {
            this.b = b;
        }
    }

    public ShapeDiamond(double a, double b, String color) { // set side length a and b, and sets color 
        if(a >= 2.0) {
            this.a = a; // assign lengths a to this a, same with b 
        }
        if(b >= 2.0) {
            this.b = b;
        }
        setColor(color); // setting color using setColor method
    }

    @Override
    public double calculateArea(){ 
        double area = (a * b);
        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = (2 * (a + b));
        return perimeter;
    }

    @Override
    public void drawShape(){
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        String areaFormatted = df2.format(area); // formatting the area calculation according to formatting at top
        String perimeterFormatted = df2.format(perimeter);
        System.out.println("This a diamond shape with an area: " + areaFormatted + " and perimeter: " + perimeterFormatted + "." + " Color: " + getColor());
    }

    @Override
    public String setColor(String color){
        String validatedColor = CanBeColored.super.setColor(color); // super to access interface directly, uses default implementation of setColor in CanBeColored
        this.color = validatedColor;
        return validatedColor;
    }

    @Override
    public String getColor(){ 
        if("No color".equals(this.color)) {
            return "The shape is not colored";
        }
        else {
            return this.color;
        }
    }

}
