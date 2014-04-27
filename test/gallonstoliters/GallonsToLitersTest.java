/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author devinbost
 */
public class GallonsToLitersTest {
    
    public GallonsToLitersTest() {
    }
    
    /**
     * Test of main method, of class GallonsToLiters.
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GallonsToLiters.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * */
    /**
     * Test of Convert method, of class GallonsToLiters.
     */
    @Test
    public void GallonsToLiters_IsComputationCorrect_ReturnsTrue() {
        System.out.println("GallonsToLiters: Convert()");
        assertEquals(37.854, GallonsToLiters.Convert(10), 0.0);
       
    }
    
}
