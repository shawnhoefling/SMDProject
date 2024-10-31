import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public Triangle() { // default constructor 

    }

    public Triangle(String color) {
        setColor(color);

    }

    public Triangle(double a, double b, double c) { // ensure sides greater than 3.0
        if (a >= 3.0) {
            this.a = a;
        }
        if (b >= 3.0) {
            this.b = b;
        }
        if (c >= 3.0) {
            this.c = c;
        }

    }
    
    public Triangle(double a, double b, double c, String color) { // ensure sides greater than or equal to 3.0, set color
        if (a >= 3.0) {
            this.a = a;
        }
        if (b >= 3.0) {
            this.b = b;
        }
        if (c >= 3.0) {
            this.c = c;
        }
        setColor(color);

    }

    @Override
    public double calculateArea(){
        double sp = (a + b  + c) / 2.0; // calculating semi-perimeter
        double x = (sp * (sp - a) * (sp - b) * (sp - c)); // herons formula
        double area = Math.sqrt(x); // square root of above
        return area;

    }

    @Override
    public double calculatePerimeter(){
        double perimeter = a + b + c; // sum of all sides
        return perimeter;

    }

    @Override
    public void drawShape() { // same implementation as ShapeDiamond
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        String areaFormatted = df2.format(area); // formatting the area calculation according to formatting at top
        String perimeterFormatted = df2.format(perimeter);
        System.out.println("This a triangle with area: " + areaFormatted + " and perimeter: " + perimeterFormatted + "." + " Color: " + getColor());

    }

    @Override // same implemenation as ShapeDiamond
    public String setColor(String color){ 
        String validatedColor = CanBeColored.super.setColor(color); // super to access interface directly, uses default implementation of setColor in CanBeColored
        this.color = validatedColor;
        return validatedColor;

    }

    @Override
    public String getColor(){
        return this.color; // returning color of the shape

    }
    
}
