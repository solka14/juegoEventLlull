
package juegoevent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karen
 */
public class compuAdivinaTest {
    
    public compuAdivinaTest() {
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

   
    @Test
    public void testAdivinaVos() {
        System.out.println("adivinaVos");
        compuAdivina instance = new compuAdivina();
        int expResult = 0;
        int result = instance.adivinaVos();
        assertEquals(expResult, result);
        
        
    }

    
    @Test
    public void testEsMayor() {
        System.out.println("EsMayor");
        
        compuAdivina instance = new compuAdivina();
        int resultEsp=23; 
        instance.numAleatorio=resultEsp;
        instance.EsMayor();
        
        assertNotNull(instance);
        assertTrue(instance.numAleatorio>resultEsp);
        assertTrue(instance.minimo==resultEsp);
        

    }

   
    @Test
    public void testEsMenor() {
        System.out.println("EsMenor");
        compuAdivina instance = new compuAdivina();
        int resultEsp=74;
        instance.numAleatorio=resultEsp;
        instance.EsMenor();
        assertTrue(instance.numAleatorio<resultEsp);
        assertTrue(instance.maximo==resultEsp);
      
    }

    
    @Test
    public void testEseEs() {
        System.out.println("EseEs");
        compuAdivina instance = new compuAdivina();
        
        instance.EseEs();
       

    }

   
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        compuAdivina.main(args);
        
    }
    
}
