package com.mandelag.patterns.builder.inner;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CarTest
{
    /**
     * Default constructor for test class CarTest
     */
    public CarTest()
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
    public void createCar()
    {
        //This cannot be done
        //Car c = new Car("Subaru", "GREEN", 2.0, 1.0, "Vroom!");
        
        Car c = new Car.CarBuilder()
            .withName("SuperBaroe")
            .withColor("SKY BLEUE")
            .withSound("Vrooom!")
            .build();
        
        assertEquals(c.start(), "Vrooom!");
        
        System.out.println(c.start());
    }
}

