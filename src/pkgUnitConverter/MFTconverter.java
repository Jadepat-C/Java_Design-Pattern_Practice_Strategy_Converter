/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * A class to convert meters to feet.
 * Implements the Converter interface and provides the conversion logic for meters to feet.
 * 
 * Example usage:
 * ```
 * MFTconverter converter = new MFTconverter();
 * double meters = 5;
 * double feet = converter.convert(meters); // Convert 5 meters to feet
 * String converterType = converter.getConverterType(); // "Meter to feet"
 * ConverterUtil converterUtil = converter.converterUtil(); // Get ConverterUtil object with conversion details
 * ```
 * 
 * @author Jadepat
 */
public class MFTconverter implements Converter {
    
    private final double convFactor = 3.281;
    private double meter;
    private final String beforeUnit = "meters";
    private final String afterUnit = "feet";
    private ConverterUtil converterUtil;
    
    /**
     * Constructs an MFTconverter object with default meters set to 0.
     */
    public MFTconverter(){
        this(0);
    }
    
    /**
     * Constructs an MFTconverter object with the specified meter value.
     * 
     * @param meter the value in meters to be converted
     */
    public MFTconverter(double meter){
        this.meter = meter;
        this.converterUtil = new ConverterUtil(meter,beforeUnit,afterUnit);
    }
    
    /**
     * Converts the specified value in meters to feet.
     * 
     * @param meter the value in meters to be converted
     * @return the equivalent value in feet
     */
    @Override
    public double convert(double meter){
        return meter*convFactor;
    }
    
    /**
     * Returns the type of the converter.
     * 
     * @return the converter type
     */
    @Override
    public String getConverterType(){
        return "Meter to feet";
    }
    
    /**
     * Returns a string representation of the MFTconverter object.
     * The string includes the original value in meters and the converted value in feet.
     * 
     * @return the string representation of the object
     */
    @Override
    public String toString(){
        return String.format("%5.2f in meter is %5.2f feet", meter, convert(meter));
    }
    
     /**
     * Returns the ConverterUtil object associated with this MFTconverter.
     * 
     * @return the ConverterUtil object
     */
    @Override
    public ConverterUtil converterUtil(){
        return converterUtil;
    }
    
}
