package com.mandelag.patterns.builder;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProjectedCoordinateSystemBuilderTest.
 *
 * @author  Keenan Mandela Gebze
 * @version 27/6/2018
 */
public class ProjectedCoordinateSystemBuilderTest
{
    /**
     * Default constructor for test class ProjectedCoordinateSystemBuilderTest
     */
    public ProjectedCoordinateSystemBuilderTest()
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

    
    public void testCreate() {
        
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
    public void newInstance()
    {
        ProjectedCoordinateSystemBuilder pcsb = new ProjectedCoordinateSystemBuilder()
            .withName("Aseeek")
            .withFalseEasting(2.0)
            .withCentralLongitude(106.42);
        ProjectedCoordinateSystem pcs = pcsb.build();
        assertNotEquals(pcs,null);
    }
}

