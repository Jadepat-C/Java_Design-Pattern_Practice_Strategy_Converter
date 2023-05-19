/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 *
 * @author Jadepat
 */
public class ConverterUtil {
    
    private double value;
    private String beforeUnit;
    private String afterUnit;
    
    public ConverterUtil(double value, String beforeUnit, String afterUnit){
        this.value = value;
        this.beforeUnit = beforeUnit;
        this.afterUnit = afterUnit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getBeforeUnit() {
        return beforeUnit;
    }

    public void setBeforeUnit(String beforeUnit) {
        this.beforeUnit = beforeUnit;
    }

    public String getAfterUnit() {
        return afterUnit;
    }

    public void setAfterUnit(String afterUnit) {
        this.afterUnit = afterUnit;
    }
    
    
  
    
}
