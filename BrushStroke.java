import java.util.Random;

public class BrushStroke {
    Random random = new Random();
    int thickness = 0; // change 1 to the random variable from constructor
    String color = "Yellow";
    

    public BrushStroke() { // fix this, ensure thickness is properly set
        
        int thickness = random.nextInt(10) + 1;
    }
    
    @Override
    public void draw() {

    }

    @Override
    public void grow() {

    }

    @Override
    public String printText(){

    }

    @Override
    default String setColor(){

    }

    @Override
    public String getColor(){
        
    }

}
