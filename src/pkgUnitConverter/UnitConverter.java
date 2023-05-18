/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author Jadepat
 */
public class UnitConverter {
    private double value;
    private ConverterBehavior converterBehavior;
    
    public UnitConverter(){
        this.converterBehavior = new FCconverter();
    }
    
    public UnitConverter(double value){
        this.value = value;
        this.converterBehavior = new FCconverter();
    }
    
    public void changeBehaviorTo(ConverterBehavior converterBehavior){
        this.converterBehavior = converterBehavior;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public double convert(double value){
        return converterBehavior.convert(value);
    }

    public String getConverterType(){
        return this.converterBehavior.getConverterType();
    }
}
