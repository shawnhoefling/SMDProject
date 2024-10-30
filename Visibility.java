// completed, only note check isVisible() method 
public abstract class Visibility{ // look into abstract classes
    private boolean inBackground = false; // private for encapsulation
    public Visibility() { // look into constructor construction here
        // constructor
    }
    public void changeVisibility() { // if inBackground is false, change it to true, and vice versa
        if (inBackground == false) {
            inBackground = true;
        } 
        else if(inBackground == true) {
            inBackground = false;
        }
    }
    public boolean isVisible() { // return the opposite of inBackground as if inBackground is true, it is not visible, and if inBackground is false, is is visible
        return !inBackground;

    }
}

/* Add the required content and functionality shown in the class diagram above and following the instructions below.

The default value of the attribute inBackground must be false.
The method changeVisibility must change the visibility. If the value of the attribute inBackground is false, the method must change its value to true. Similarly, if the value of the attribute inBackground is true, the method must change its value to false.
The method isVisible must return the "visibility" of the element (is it in the background or visible).

*/ 
