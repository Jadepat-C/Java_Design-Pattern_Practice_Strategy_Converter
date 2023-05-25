/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * A class to convert feet to meters.
 * Implements the Converter interface and provides the conversion logic for feet to meters.
 * 
 * Example usage:
 * ```
 * FTMconverter converter = new FTMconverter();
 * double feet = 10;
 * double meters = converter.convert(feet); // Convert 10 feet to meters
 * String converterType = converter.getConverterType(); // "Feet to meter"
 * ConverterUtil converterUtil = converter.converterUtil(); // Get ConverterUtil object with conversion details
 * ```
 * 
 * @author Jadepat
 */
public class FTMconverter implements Converter {
    private final double convFactor = 3.281;
    private double feet;
    private final String beforeUnit = "feet";
    private final String afterUnit = "meters";
    private ConverterUtil converterUtil;
    
    /**
     * Constructs an FTMconverter object with feet set to 0.
     */
    public FTMconverter(){
        this(0);
    }
    
     /**
     * Constructs an FTMconverter object with the specified feet value.
     * 
     * @param feet the value in feet to be converted
     */
    public FTMconverter(double feet){
        this.feet = feet;
        this.converterUtil = new ConverterUtil(feet,beforeUnit,afterUnit);
    }
    
    /**
     * Converts the specified value in feet to meters.
     * 
     * @param feet the value in feet to be converted
     * @return the equivalent value in meters
     */
    @Override
    public double convert(double feet){
        return feet / convFactor;
    }
    
    /**
     * Returns the type of the converter.
     * 
     * @return the converter type
     */
    @Override
    public String getConverterType(){
        return "Feet to meter";
    }
    
    /**
     * Returns a string representation of the FTMconverter object.
     * The string includes the original value in feet and the converted value in meters.
     * 
     * @return the string representation of the object
     */
    @Override
    public String toString(){
        return String.format("%5.2f in feet is %5.2f meter", feet, convert(feet));
    }
    
    /**
     * Returns the ConverterUtil object associated with this FTMconverter.
     * 
     * @return the ConverterUtil object
     */
    @Override
    public ConverterUtil converterUtil(){
        return converterUtil;
    }
}
