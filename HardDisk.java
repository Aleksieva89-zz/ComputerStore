
/**
 * The Hardisk class is one of the three component classes for the Computer.
 * This is a child class of the parent class Component.
 * 
 * @author Valentina Aleksieva
 * @version 0.1 (2017.02.08)
 */
public class HardDisk extends Component
{
    // The size of the hardisk
    private int size;
    
    /**
     * Constructor of the class 
     * @param c The cost
     * @param s The size
     * @param m The manufacturer
     */
    public HardDisk(int c, int s, String m){
        super(m, c);
        size = s;
    }
    
    /**
     * @return The size of the hardisk
     */
    public int getSize()
    {
        return size;
    }
    
    /**
     * Define the size of the hardisk
     */
    public void setSize(int s)
    {
        size = s;
    }
    
    /**
     * Print out a summary about the hardisk
     */
    public void printSummary() {
        super.printSummary("Hard disk");
        System.out.println(" and size:"+size);
    }
}