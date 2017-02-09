

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComputerTest.
 *
 * @author  Valentina Aleksieva
 * @version 0.1 (2017.02.08)
 */
public class ComputerTest
{
    /**
     * Default constructor for test class ComputerTest
     */
    public ComputerTest()
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
    public void testGetPrice()
    {
        Computer Computer = new Computer();
        HardDisk hardDisk1 = new HardDisk(50, 100, "WD");
        Computer.addComponent("HardDisk", hardDisk1);
        Display display1 = new Display(50, 21, "Red", "Dell");
        Computer.addComponent("Display", display1);
        Processor processo1 = new Processor(50, "AMD", 700);
        Computer.addComponent("Processor", processo1);
        assertEquals(150, Computer.getPrice());
        Computer.printComputerSummary();
    }
}

