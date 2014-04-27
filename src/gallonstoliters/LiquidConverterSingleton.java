/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;
import static gallonstoliters.GallonsToLiters.Convert;
import java.util.*;

/**
 *
 * @author devinbost
 */
public class LiquidConverterSingleton {
    private static LiquidConverterSingleton instance = null;
    private static List<Double> _gallonValues = new ArrayList<Double>();
    protected LiquidConverterSingleton(){
        // simple constructor
        _gallonValues = FillListWithValues();
    }
    public static LiquidConverterSingleton getInstance(){
        if(instance == null){
            instance = new LiquidConverterSingleton();
        }
        return instance;
    }
    private List<Double> FillListWithValues(){
        List<Double> gallonValues = new ArrayList<Double>();
        for(int i=1; i<25; i++){
            gallonValues.add(Math.random());
        }
        return gallonValues;
    }
    public List<Double> GetConvertedList(){
        if (_gallonValues == null) {
            _gallonValues = FillListWithValues();
        }
        
        List<Double> literList = new ArrayList<Double>();
        for( Double value : _gallonValues){
            literList.add(Convert(value));
        }
        return literList;
    }
    public List<Double> GetValues(){
        return _gallonValues;
    }
}
