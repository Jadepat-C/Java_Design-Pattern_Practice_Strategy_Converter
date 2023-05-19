/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author Jadepat
 */
public class FTMconverter implements Converter {
    private final double convFactor = 3.281;
    private double feet;
    private final String beforeUnit = "feet";
    private final String afterUnit = "meters";
    
    public FTMconverter(){
        this(0);
    }
    
    public FTMconverter(double feet){
        this.feet = feet;
    }
    
    @Override
    public double getValue(){
        return feet;
    }
    
    @Override
    public String getBeforeUnit(){
        return beforeUnit;
    }
    
    @Override
    public String getAfterUnit(){
        return afterUnit;
    }
    
    @Override
    public double convert(double feet){
        return feet / convFactor;
    }
    
    @Override
    public String getConverterType(){
        return "Feet to meter";
    }
    
    @Override
    public String toString(){
        return String.format("%5.2f in feet is %5.2f meter", feet, convert(feet));
    }
}
