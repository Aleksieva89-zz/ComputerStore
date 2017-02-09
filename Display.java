
/**
 * The Display class is the second class of the three component classes for the Computer.
 * This is a child class of the parent class Component.
 * 
 * @author Valentina Aleksieva
 * @version 0.1 (2017.02.08)
 */
public class Display extends Component
{
    //A diagonal of the display
    private double diagonal;
    //The color of the display
    private String color;
    
    /**
     * Constructor of objects for the class Display
     * @param initCost The cost of the display
     * @param diagonal The diagonal of the display
     * @param color The color of the display
     * @param manufacturer The manufacturer of the display
     */
    public Display(int initCost, double diagonal, String color,String manufacturer)
    {
        super(manufacturer, initCost);
        this.diagonal = diagonal;
        this.color = color;
    }
    
    /**
     * Accesor method for the diagonal
     * @return The diagonal
     */
    public double getDiagonal()
    {
        return diagonal;
    }
    
    /**
     * Mutator method for seting the diagonal of the dispaly
     */
    public void setDiagonal(double d)
    {
        diagonal = d;
    }
    
    /**
     * Accesor method for the color
     * @return The color
     */
    public String getColor()
    {
        return color;
    }
    
    /**
     * Mutator method for the color
     */
    public void setColor(String color)
    {
        this.color = color;
    }
    
    /**
     * Prints out the summary for the Display
     */
    public void printSummary() 
    {
        super.printSummary("Display");
        System.out.println(" size:" + diagonal + " and color:" + color);
    }
}
