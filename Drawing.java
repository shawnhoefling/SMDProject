import java.util.List;
import java.util.ArrayList;

public abstract class Drawing<T> {
    protected List<T> shapeList = new ArrayList<>(); // changed to protected so it could be accessed outside of the class, otherwise getter and setter to access
    public Drawing() {
        // constructor
    }
    void addBasicShape(T shape){ //element given as parameter 
        if(shape != null) { // if the element is not null shape (element) to the variable of the element
            shapeList.add(shape); 
            // add element to list
        }
    }
    List<T> getBasicShapes(){
        return new ArrayList<>(shapeList); // returning copy of list
    }
    public abstract void draw(); // abstract method with no implementation
}

