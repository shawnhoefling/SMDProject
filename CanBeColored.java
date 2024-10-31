public interface CanBeColored {
    default String setColor(String color) { // default implementation to check color and null
        if(color == null) { // if null, return no color
            return "No color";
        }

        switch(color) { // switch case to check String color is correct, if not return no color
            case "Blue":
            case "Green":
            case "Red":
            case "Yellow":
                return color;
            default:
                return "No color";
        }
  
    }
    public abstract String getColor();
    

}