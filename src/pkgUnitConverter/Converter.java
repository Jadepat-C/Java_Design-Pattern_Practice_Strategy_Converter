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
    
    public ConverterUtil converterUtil();
    
}
