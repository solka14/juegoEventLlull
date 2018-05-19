/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoevent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karen
 */
public class personaAdivinaTest {
    
    public personaAdivinaTest() {
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
     * Test of adivinoyo method, of class personaAdivina.
     */
    @Test
    public void testAdivinoyo() {
        System.out.println("adivinoyo");
        int valor = 0;
        personaAdivina instance = new personaAdivina();
        int expResult = 0;
        int result = instance.adivinoyo(valor);
        assertNotNull(instance);
        assertTrue(0<= instance.adivinoyo(valor)&&instance.adivinoyo(valor)<=100);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class personaAdivina.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        personaAdivina.main(args);
       
    }
    
}
