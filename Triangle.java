import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    private DecimalFormat df2 = new DecimalFormat("#.##");
    private String color = "No color";

    public Triangle() {

    }

    public String Triangle() {

    }

    public double Triangle(double a, double b, double c) {

    }
    
    public Triangle(double a, double b, double c, String color) {

    }

    @Override
    public double calculateArea(){

    }

    @Override
    public double calculatePerimeter(){

    }

    @Override
    public void drawShape() {

    }

    @Override
    default String setColor(){ // check for default

    }

    @Override
    public String getColor(){
        return color; // returning color of the shape

    }
    
}
