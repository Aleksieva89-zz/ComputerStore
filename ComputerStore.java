import java.util.ArrayList;
import java.util.Iterator;
/**
 * ComputerStore sells computers and components for computers.
 * This class gives us a lot information about the computers or components we want to buy.
 * 
 * @author Valentina Aleksieva
 * @version 0.1 (2017.02.08)
 */
public class ComputerStore
{
    // An Array list of computers
    private ArrayList<Computer> computers;
    //An Array list of components
    private ArrayList<Component> components;
 
    /**
     * Constructor for objects of class ComputerStore
     */
    public ComputerStore()
    {
        // initialising instance variables
        computers = new ArrayList<>();
        components = new ArrayList<>();
    }
 
    /**
     * Add computer to the store
     * @param newComputer If this computer if not in the store, we add it
     * @return true if we don't have that computer in the store
     * @return false If that computer already exists
     */
    public boolean addComputer(Computer newComputer) 
    {
        if(!computers.contains(newComputer)) {
            computers.add(newComputer);
            return true;
        }
        else{
            System.out.println("This computer already exists");
            return false;
        }
    }
    
    /**
     * Remove the computer
     * @param index
     * @return true If the index exists in the collection and we remove it
     * @return false If there is no that index
     */
    public boolean removeComputer(int index)
    {
        if(index >= 0 && index < computers.size()) {
            computers.remove(index);
            return true;
        }
        else {
            System.out.println("There is no item with this index");
            return false;
        }
    }
    
    /**
     * prints out all the details of each computer in store
     */
    public void printAllComputers() 
    {
        for(Computer c : computers) {
            c.printComputerSummary();
        }
    }
    
    /**
     * prints the total cost for all computers
     */
    public void printTotalValue() 
    {
        double sum = 0;
        for(int i = 0; i < computers.size(); i++) {
           Computer c = computers.get(i);
           sum += c.getPrice();
        }
        System.out.println(sum);
    }
    
    /**
     * Finds the most expensive computer using a for each loop
     * @return mostExpensive
     */
    public Computer findMostExpensiveComputerV1( ) {
        if(computers.size() == 0) {
            return null;
        }
        Computer mostExpensive = computers.get(0);
        for (Computer c : computers) {
            if(c.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = c;
            }
        }
        return mostExpensive;
    }
    
    /**
     * Finds the most expensive computer using the traditional loop
     * @return mostExpensive
     */
    public Computer findMostExpensiveComputerV2()
    {  
        if(computers.size() == 0) {
            return null;
        }
        Computer mostExpensive = computers.get(0);
        for(int i = 0; i < computers.size(); i++) {
            Computer c = computers.get(i);
            if(c.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = c; 
            }
        }
        return mostExpensive;
    }
    
    /**
     * Finds the most expensive computer using the while loop
     * @return mostExpensive
     */
    public Computer findMostExpensiveComputerV3()
    {
        if(computers.size() == 0) {
            return null;
        }
        Computer mostExpensive = computers.get(0);
        int i = 0;
        while(i < computers.size()) {
            Computer c = computers.get(i);
            if(c.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = c;
            }
            i++;
        }
        return mostExpensive;
    }
    
    /**
     * Finds the most expensive computer using Iterator loop
     * @retunr mostExpensive
     */
    public Computer findMostExpensiveComputerV4()
    {
        if(computers.size() == 0) {
            return null;
        }
        Iterator<Computer> it = computers.iterator();
        Computer mostExpensive = it.next();
        while(it.hasNext()) {
            Computer a = it.next();
            if(a.getPrice() > mostExpensive.getPrice()){
                mostExpensive = a;
            }
        }
        return mostExpensive;
    }
    
    /**
     * Accesor method for components
     * @return components
     */
    public ArrayList<Component> getComponents() {
        return components;
    }
    
    /**
     * Adds components
     */
    public void addComponent(Component c) {
        components.add(c);
    }
    
    /**
     * Calculate the total cost of the components
     * @return totalCost
     */
    public int totalCostOfComponents()
    {
        int totalCost = 0;
        for(Component c : components) {
            totalCost += c.getCost();
        }
        return totalCost;
    }
    
    /**
     * Calculate the total cost of the components
     * @return totalCost
     */
    public int totalCostOfComponents(String component_type) { 
        int totalCost = 0;
        for(Component c : components) {
            String className = c.getClass().getName();
            if (component_type == className) {
                totalCost += c.getCost();
            }
        }
        return totalCost;
    }
}
 