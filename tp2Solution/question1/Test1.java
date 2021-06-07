package question1;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Test1.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test1 extends junit.framework.TestCase 
{
    /**
     * Default constructor for test class Test1
     */
    public Test1()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestMethod()
    {
        question1.FahrenheitCelsius.main(new String[] {"0","100","1000","2000","5000"});
   
    }
    
    public void test_fahrenheitEnCelsius() {
        assertEquals("    0 °F -> -17.8 °C ? ", -17.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals("  100 °F -> 37.8 °C ? ", 37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals("  1000 °F -> 537.8 °C ?", 537.8, question1.FahrenheitCelsius.fahrenheitEnCelsius(1000), 0.1);
        assertEquals(" 2000 °F -> 1093.3 °C ?", 1093.3, question1.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
        assertEquals(" 5000 °F -> 2760.0 °C ?", 2760.0, question1.FahrenheitCelsius.fahrenheitEnCelsius(5000), 0.1);
    }
}

