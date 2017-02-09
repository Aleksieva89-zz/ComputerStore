
/**
 *The Processor class is the third of the three component classes for the Computer.
 * This is a child class of the parent class Component.
 * 
 * @author Valentina Aleksieva
 * @version 0.1 (2017.02.08)
 */
public class Processor extends Component
{
    //The clockSpeed of the processor
    private int clockSpeed;
    
    /**
     *Constructor for objects of the class processor
     *@param cost The cost of the proccesor
     *@param m The manufacturer of the processor
     *@param c The clockSpeed of the processor
     */
    public Processor(int cost, String m, int c)
    {
        super(m, cost);
        clockSpeed = c;
    }
    
    /**
     * Accesor method for geting the clock speed of the processor
     * @return clockSpeed
     */
    public int getClockSpeed()
    {
        return clockSpeed;
    }
    
    /**
     * Mutator method for setting the clock speed of the processor
     * @param clockSpeed
     */
    public void setClockSpeed(int clockSpeed)
    {
        this.clockSpeed = clockSpeed;
    }
    
    /**
     * This method prints out the summary for the processor
     */
    public void printSummary()
    {
        super.printSummary("Processor");
        System.out.println(" and clockSpeed:" + clockSpeed);
    }
}
