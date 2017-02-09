/**
 * Component class is a super class and this class gives all the informaiton about cost and manufecturer
 * of the components.
 * 
 * @author Valentina Aleksieva
 * @version 0.1 (a version number or a date)
 */
public class Component
{
    // instance variables 
    private String manufacturer;
    private int cost;

    /**
     * Constructor for objects of class Component
     * @param manufacturer The manufacturer of the component
     * @param cost The cost of the component
     */
    public Component(String manufacturer, int cost)
    {
        // initialise instance variables
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    /**
     * Accesor method for geting the cost
     * @return cost
     */
    public int getCost()
    {
        return cost;
    }
    
    /**
     * Mutator method for setting the cost of the component
     * @param c The cost of the component
     */
    public void setCost(int c)
    {
        cost = c;
    }
    
    /**
     * Accesor method for geting the manufacturer of the component
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }
    
    /**
     * Mutator method for setting the manufacturer
     * #param m 
     */
    public void setManufacturer(String m)
    {
        manufacturer = m;
    }
    
    /**
     * Prints out the summary of the component
     */
    public void printSummary(String type) {
        System.out.print(type +" of cost:" + cost + " from maker:" + manufacturer);
    }
    
    /**
     * To be overridden in child classes
     */
    public void printSummary() {
    
    }
}
