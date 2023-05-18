/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author Jadepat
 */
public class FTMconverter implements ConverterBehavior {
    private final double convFactor = 3.281;
    
    @Override
    public double convert(double feet){
        return feet / convFactor;
    }
    
    @Override
    public String getConverterType(){
        return "Feet to meter";
    }
}
