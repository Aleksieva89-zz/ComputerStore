

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComputerStoreTest.
 *
 * @author  Valentina Aleksieva
 * @version 0.1 (2017.02.08)
 */
public class ComputerStoreTest
{
    /**
     * Default constructor for test class ComputerStoreTest
     */
    public ComputerStoreTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testTotalCostOfComponents()
    {
        ComputerStore Sample = new ComputerStore();
        HardDisk hardDisk1 = new HardDisk(50, 100, "WD");
        Sample.addComponent(hardDisk1);
        Display display1 = new Display(50, 21, "Red", "DELL");
        Sample.addComponent(display1);
        Processor processo1 = new Processor(50, "Intel", 500);
        Sample.addComponent(processo1);
        assertEquals(150, Sample.totalCostOfComponents());
    }

    @Test
    public void testTotalCostOfComponentsFromType()
    {
        ComputerStore c = new ComputerStore();
        HardDisk hardDisk1 = new HardDisk(50, 100, "WD");
        Processor processo1 = new Processor(50, "Intel", 500);
        Processor processo2 = new Processor(50, "AMD", 600);
        c.addComponent(hardDisk1);
        c.addComponent(processo1);
        c.addComponent(processo2);
        assertEquals(100, c.totalCostOfComponents("Processor"));
    }

    @Test
    public void testGetComponent()
    {
        ComputerStore computer1 = new ComputerStore();
        HardDisk hardDisk1 = new HardDisk(9, 8, "op");
        Display display1 = new Display(9, 89, "red", "yoy");
        computer1.addComponent(hardDisk1);
        computer1.addComponent(display1);
        assertEquals(2, computer1.getComponents().size());
    }
}




