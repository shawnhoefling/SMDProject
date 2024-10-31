import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {
    private double a = 2.0;
    private double b = 2.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public ShapeDiamond() { // constructor 

    }

    public ShapeDiamond(String color) {
        
    }
    
    public ShapeDiamond(double a, double b) {

    }

    public ShapeDiamond(double a, double b, String color) {

    }

    @Override
    public double calculateArea(){ // check to see if it needs to calculate area set to shape
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
        return "This a diamond shape with an area: " + area + " and perimeter " + perimeter + "." + " Color: " + color;

    }

    @Override
    public String setColor(String color){

    }

    @Override
    public String getColor(String color){
        if(color == "No color") {
            return "The shape is not colored";
        }
        else {
            
        }

    }

}
