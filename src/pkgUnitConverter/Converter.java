/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * An interface representing a converter.
 * Implementing classes should provide the conversion logic and converter type information.
 * They should also return a ConverterUtil object with conversion details.
 * 
 * Example implementation:
 * ```
 * public class EgConverter implements Converter {
 *     // implementation of convert method
 *     
 *     public String getConverterType() {
 *         return "Eg Converter, convert X to Y";
 *     }
 *     
 *     public ConverterUtil converterUtil() {
 *         // return ConverterUtil object with conversion details
 *     }
 * }
 * ```
 * 
 * @author Jadepat
 */
public interface Converter {
    /**
     * Converts the specified value.
     * 
     * @param value the value to be converted
     * @return the converted value
     */
    public double convert(double value);
    
    /**
     * Returns the type of the converter.
     * 
     * @return the converter type
     */
    public String getConverterType();
    
    /**
     * Returns the ConverterUtil object associated with this converter.
     * The ConverterUtil object provides conversion details such as the value, before unit, and after unit.
     * 
     * @return the ConverterUtil object
     */
    public ConverterUtil converterUtil();
    
}
