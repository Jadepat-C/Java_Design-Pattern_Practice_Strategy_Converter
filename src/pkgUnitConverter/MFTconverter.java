/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author Jadepat
 */
public class MFTconverter implements Converter {
    
    private final double convFactor = 3.281;
    private double meter;
    private final String beforeUnit = "meters";
    private final String afterUnit = "feet";
    
    public MFTconverter(){
        this(0);
    }
    
    public MFTconverter(double meter){
        this.meter = meter;
    }
    
    @Override
    public double getValue(){
        return meter;
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
    public double convert(double meter){
        return meter*convFactor;
    }
    
    @Override
    public String getConverterType(){
        return "Meter to feet";
    }
    
    @Override
    public String toString(){
        return String.format("%5.2f in meter is %5.2f feet", meter, convert(meter));
    }
    
}
