/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;

import java.util.*;

/**
 *
 * @author devinbost
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons = 10;
        double myliters = Convert(gallons);
        LiquidConverterSingleton converter = LiquidConverterSingleton.getInstance();
        List<Double> myGallonValues = converter.GetValues();
        System.out.println(gallons + " gallons is " + myliters);
    }
    public static double Convert(double gallons){
        double liters;
        return liters = gallons * 3.7854;
    }
   
    public static List<Double> ConvertList(List<Double> gallonValues){
        List<Double> literList = new ArrayList<Double>();
        for( Double value : gallonValues){
            literList.add(Convert(value));
        }
        return literList;
    }
}


