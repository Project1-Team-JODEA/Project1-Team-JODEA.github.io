/*
 * Team Name: J.O.D.E.A.
 * Project:Vaccination Tracking System 
 * School: STLCC
 * Members: Elena Miller, Jaccob Stanton, Deshane Sims,
 * Alexander Breitnebach, and Osama Aater
 */
package business;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eVmPr
 */
public class ConnectionPoolTest {
    
    public ConnectionPoolTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class ConnectionPool.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ConnectionPool expResult = null;
        ConnectionPool result = ConnectionPool.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class ConnectionPool.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        ConnectionPool instance = null;
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of freeConnection method, of class ConnectionPool.
     */
    @Test
    public void testFreeConnection() {
        System.out.println("freeConnection");
        Connection c = null;
        ConnectionPool instance = null;
        instance.freeConnection(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
