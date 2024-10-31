import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {
    private int thickness; // change 1 to the random variable from constructor
    private String color = "Yellow";
    Random random = new Random();
    

    public BrushStroke() { // fix this, ensure thickness is properly set
        this.thickness = random.nextInt(10, 1); // check bounds here
    }
    
    @Override
    public void draw() {
        System.out.println("Brush strokes with thickness " + thickness); //ensure correct thickness being calculated

    }

    @Override
    public void grow() {
        System.out.println("Adding some color... " + getColor());

    }

    @Override
    public String printText(){
        return "Brush Stroke";

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
            return "Out of color...";
        }
        else {
            return this.color;
        }

    }

}
