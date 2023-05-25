/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * A utility class for storing conversion details.
 * It contains the value to be converted, the unit before conversion, and the unit after conversion.
 * 
 * Example usage:
 * ```
 * ConverterUtil converterUtil = new ConverterUtil(32, "Fahrenheit", "Celsius");
 * double value = converterUtil.getValue(); // 32
 * String beforeUnit = converterUtil.getBeforeUnit(); // "Fahrenheit"
 * String afterUnit = converterUtil.getAfterUnit(); // "Celsius"
 * ```
 * 
 * The ConverterUtil class is typically used by converter implementations to provide conversion details.
 * It is not meant to be instantiated directly by users.
 * 
 * @author Jadepat
 */
public class ConverterUtil {
    
    private double value;
    private String beforeUnit;
    private String afterUnit;
    
    /**
     * Constructs a ConverterUtil object with the specified conversion details.
     * 
     * @param value the value to be converted
     * @param beforeUnit the unit before conversion
     * @param afterUnit the unit after conversion
     */
    public ConverterUtil(double value, String beforeUnit, String afterUnit){
        this.value = value;
        this.beforeUnit = beforeUnit;
        this.afterUnit = afterUnit;
    }

    /**
     * Returns the value to be converted.
     * 
     * @return the value to be converted
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value to be converted.
     * 
     * @param value the value to be converted
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Returns the unit before conversion.
     * 
     * @return the unit before conversion
     */
    public String getBeforeUnit() {
        return beforeUnit;
    }

    /**
     * Sets the unit before conversion.
     * 
     * @param beforeUnit the unit before conversion
     */
    public void setBeforeUnit(String beforeUnit) {
        this.beforeUnit = beforeUnit;
    }

    /**
     * Returns the unit after conversion.
     * 
     * @return the unit after conversion
     */
    public String getAfterUnit() {
        return afterUnit;
    }

    /**
     * Sets the unit after conversion.
     * 
     * @param afterUnit the unit after conversion
     */
    public void setAfterUnit(String afterUnit) {
        this.afterUnit = afterUnit;
    }
}
