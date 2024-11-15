 
public abstract class Visibility{ 
    private boolean inBackground = false; // private for encapsulation
    public Visibility() {
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


