import java.util.List;
import java.util.ArrayList;

public abstract class Drawing<T> {
    protected List<T> shapeList = new ArrayList<>(); // changed to protected so it could be accessed outside of the class, otherwise getter and setter to access
    public Drawing() {
        // constructor
    }
    void addBasicShape(T shape){ //element given as parameter 
        if(shape != null) { // if the element is not null shape (element) to the variable of the element
            shapeList.add(shape); //check addAll
            // add element to list
        }
    }
    List<T> getBasicShapes(){
        return new ArrayList<>(shapeList); // returning copy of list
    }
    public abstract void draw(); // abstract method with no implementation
}

/*
 Add the required content and functionality shown in the class diagram & following instructions.

The method addBasicShape must add the element (given as a parameter) to the list of elements if the element is not null.
The method getBasicShapes must return a new list of the elements included in the Drawing.
The method draw() is an abstract method in this class (no implementation).
 */