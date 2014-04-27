/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;
import java.util.*;
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
    public void GallonsToLiters_IsComputationCorrect_ReturnsValue() {
        System.out.println("GallonsToLiters: Convert()");
        assertEquals(37.854, GallonsToLiters.Convert(10), 0.0);
       
    }
    @Test
    public void LiquidConverterSingleton_IsConstructionValid_ReturnsInstance(){
        LiquidConverterSingleton converter = LiquidConverterSingleton.getInstance();
        assertTrue(converter instanceof LiquidConverterSingleton);
    }
    @Test
    public void LiquidConverterSingleton_DoesFillListWithValuesWork_ReturnsListSize(){
        LiquidConverterSingleton converter = LiquidConverterSingleton.getInstance();
        List<Double> myvalues = converter.GetValues();
        assertTrue(myvalues.size() > 10);
    }
    
    @Test
    public void LiquidConverterSingleton_DoesConvertListWork_ReturnsComputedList(){
        LiquidConverterSingleton converter = LiquidConverterSingleton.getInstance();
        List<Double> myvalues = converter.GetValues();
        List<Double> myConvertedValues = converter.GetConvertedList();
        for(int i=1; i<24; i++){
            System.out.println(myConvertedValues.get(i) + " liters = " + myvalues.get(i) + " gallons.");
            assertTrue(myConvertedValues.get(i) == myvalues.get(i) * 3.7854);
        }
    }
}
