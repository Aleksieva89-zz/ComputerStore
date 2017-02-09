import java.util.HashMap;
/**
 * This class represents a computer, as a part of a Computer Store
 * The Computer contains a collection of components that make it a whole. 
 * 
 * @author Valentina Aleksieva
 * @version 0.1 (2017.02.08)
 */
public class Computer
{
    // A HashMap for the components of the computer
    private HashMap<String, Component> components;

    /**
     * Constructor for objects of class Computer
     * takes no parameters
     * it call the constructor of each of the fields
     */
    public Computer()
    {
        // initialising instance variable
        components = new HashMap<>();
    }
    
    /**
     * Add a component to the collection
     * @param name The name of the components
     * @param c The type of the component
     */
    public void addComponent(String name, Component c) {
        components.put(name, c);
    }
    
    /**
     * Remove a component from the collection
     * @param name The name of the component
     */
    public void removeComponent(String name) {
        components.remove(name);
    }
    
    /**
     * This method prints a summary of the Computer components and by using the the getPrice method,
     * it prints out the total price
     */
    public void printComputerSummary() 
    {
        System.out.println("This computer contains: ");
        for(String key : components.keySet()) {
            Component c = components.get(key);
            c.printSummary();
        }
        System.out.println();
        System.out.println("Total price: " + getPrice());
        
    }
    
    /**
     * Accessor method for the total cost of the components 
     * @return The total cost
     */
    public int getPrice() {
        int total = 0;
        for(Component c : components.values()) {
            total += c.getCost();
        }
        return total;
    }
}
   
