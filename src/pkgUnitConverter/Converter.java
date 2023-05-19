/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author Jadepat
 */
public interface Converter {
    public double convert(double value);
    
    public String getConverterType();
    
    public double getValue();
    
    public String getBeforeUnit();
    
    public String getAfterUnit();
    
    public default void display(){
        System.out.println(this.toString());
    }
    
}
