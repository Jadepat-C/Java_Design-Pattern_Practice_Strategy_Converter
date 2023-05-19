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
    private Converter converter;
    
    public UnitConverter(){
        this(0);
    }
    
    public UnitConverter(double value){
        this.converter = new FCconverter(value);
        this.value = value;
    }
    
    public void changeBehaviorTo(Converter converterBehavior){
        this.converter = converterBehavior;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public double convert(double value){
        return converter.convert(value);
    }

    public String getConverterType(){
        return this.converter.getConverterType();
    }
    
    @Override
    public String toString(){
        ConverterUtil converterUtil = converter.converterUtil();
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%5.2f", converterUtil.getValue()))
                .append(" in ")
                .append(converterUtil.getBeforeUnit())
                .append(" is ")
                .append(String.format("%5.2f", converter.convert(converterUtil.getValue())))
                .append(" ")
                .append(converterUtil.getAfterUnit());
        return builder.toString();
    }
    
    public void display(){
        System.out.println(this);
    }
}
