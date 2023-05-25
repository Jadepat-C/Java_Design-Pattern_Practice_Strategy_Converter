/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;

/**
 * A class representing a unit converter.
 * It can convert values between different units based on the chosen converter implementation.
 * The default converter implementation is FCconverter.
 * The value to be converted can be set using the setValue method.
 * The conversion result can be obtained using the convert method.
 * The converter type can be obtained using the getConverterType method.
 * The conversion result can be displayed using the display method.
 * The converter implementation can be changed using the changeBehaviorTo method.
 * The toString method provides a string representation of the conversion result.
 * 
 * The UnitConverter class relies on the Converter and ConverterUtil interfaces for conversion operations.
 * The ConverterUtil class is used to store the value and units before and after conversion.
 * 
 * Usage example:
 * ```
 * UnitConverter converter = new UnitConverter();
 * converter.setValue(32);
 * converter.display(); // Displays "32.00 in Fahrenheit is 0.00 Celsius"
 * converter.changeBehaviorTo(new CFconverter());
 * converter.setValue(100);
 * converter.display(); // Displays "100.00 in Celsius is 212.00 Fahrenheit"
 * ```
 * 
 * @author Jadepat
 */
public class UnitConverter {
    private double value;
    private Converter converter;
    
    /**
     * Constructs a UnitConverter object with the default value of 0 and the default converter implementation (FCconverter).
     */
    public UnitConverter(){
        this(0);
    }
    
    /**
     * Constructs a UnitConverter object with the specified value and the default converter implementation (FCconverter).
     * 
     * @param value the value to be converted
     */
    public UnitConverter(double value){
        this.converter = new FCconverter(value);
        this.value = value;
    }
    
    /**
     * Changes the behavior of the UnitConverter to use the specified converter implementation.
     * 
     * @param converterBehavior the new converter implementation
     */
    public void changeBehaviorTo(Converter converterBehavior){
        this.converter = converterBehavior;
    }
    
     /**
     * Returns the current value set in the UnitConverter.
     * 
     * @return the current value
     */
    public double getValue(){
        return value;
    }
    
    /**
     * Sets the value to be converted in the UnitConverter.
     * 
     * @param value the value to be converted
     */
    public void setValue(double value){
        this.value = value;
    }
    
    /**
     * Converts the specified value using the current converter implementation.
     * 
     * @param value the value to be converted
     * @return the converted value
     */
    public double convert(double value){
        return converter.convert(value);
    }

    /**
     * Returns the converter type of the current converter implementation.
     * 
     * @return the converter type
     */
    public String getConverterType(){
        return this.converter.getConverterType();
    }
    
    /**
     * Returns a string representation of the conversion result.
     * The format is $"{value} in {beforeUnit} is {convertedValue} {afterUnit}".
     * 
     * @return the string representation of the conversion result
     */
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
    
    /**
     * Displays the conversion result by printing the string representation to the console.
     */
    public void display(){
        System.out.println(this);
    }
}