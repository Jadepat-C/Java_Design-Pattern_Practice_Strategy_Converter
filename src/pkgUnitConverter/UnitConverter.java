/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author Jadepat
 */
public class UnitConverter implements ConverterBehavior {
    private double value;
    private ConverterBehavior converterBehavior;
    
    public UnitConverter(){
        this(0);
    }
    
    public UnitConverter(double value){
        this.converterBehavior = new FCconverter(value);
        this.value = value;
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
    
    @Override
    public double convert(double value){
        return converterBehavior.convert(value);
    }

    @Override
    public String getConverterType(){
        return this.converterBehavior.getConverterType();
    }
    
    @Override
    public String toString(){
        return this.converterBehavior.toString();
    }
}
