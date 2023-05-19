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
    private Converter converterBehavior;
    
    public UnitConverter(){
        this(0);
    }
    
    public UnitConverter(double value){
        this.converterBehavior = new FCconverter(value);
        this.value = value;
    }
    
    public void changeBehaviorTo(Converter converterBehavior){
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
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%5.2f", converterBehavior.getValue()))
                .append(" in ")
                .append(converterBehavior.getBeforeUnit())
                .append(" is ")
                .append(String.format("%5.2f", converterBehavior.convert(converterBehavior.getValue())))
                .append(" ")
                .append(converterBehavior.getAfterUnit());
        return builder.toString();
    }
    
    public void display(){
        System.out.println(this.toString());
    }
}
