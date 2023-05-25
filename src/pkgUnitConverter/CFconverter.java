/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;
/**
 * A class to convert Celsius to Fahrenheit
 * Implements the Converter interface and provides the conversion logic for Celsius to Fahrenheit.
 * 
 * Example usage:
 * ```
 * CFconverter converter = new CFconverter();
 * double celsius = 10;
 * double fahrenheit = converter.convert(celsius); // Convert 10 Celsius to Fahrenheit
 * String converterType = converter.getConverterType(); // "Celsius to Fahrenheit"
 * ConverterUtil converterUtil = converter.converterUtil(); // Get ConverterUtil object with conversion details
 * ```
 * 
 * @author Jadepat
 */
public class CFconverter implements Converter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        private double celsius;
        private final String beforeUnit = "Celsius";
        private final String afterUnit = "Fahrenheit";
        private ConverterUtil converterUtil;
        
        /**
         * Constructs a CFconverter object with the default Celsius value of 0.
         */
        public CFconverter(){
            this(0);
        }
        
        /**
         * Constructs a CFconverter object with the specified Celsius value.
         * 
         * @param celsius the value in Celsius to be converted
         */
        public CFconverter(double celsius) {
            this.celsius = celsius;
            this.converterUtil = new ConverterUtil(celsius, beforeUnit, afterUnit);
        }
        
        
	/**
         * Converts the given Celsius value to Fahrenheit.
         * 
         * @param celsius the value in Celsius to be converted
         * @return the equivalent value in Fahrenheit
         */
        @Override
	public double convert(double celsius){
                return celsius * convFactor + convOrigin;   		
	}
        
        /**
         * Returns the converter type as "Celsius to Fahrenheit".
         * 
         * @return the converter type
         */
        @Override
        public String getConverterType(){
            return "Celsius to Fahrenheit";
        }
        
        /**
         * Returns the ConverterUtil object associated with this CFconverter.
         * 
         * @return the ConverterUtil object
         */
        @Override
        public ConverterUtil converterUtil(){
            return converterUtil;
        }
}
