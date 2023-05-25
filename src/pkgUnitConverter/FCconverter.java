/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverter;
/**
 * A class to convert Fahrenheit to Celsius
 * Implements the Converter interface and provides the conversion logic for Celsius to Fahrenheit.
 * 
 * Example usage:
 * ```
 * CFconverter converter = new CFconverter();
 * double fahrenheit = 10;
 * double celsius = converter.convert(fahrenheit); // Convert 10 Fahrenheit to Celsius
 * String converterType = converter.getConverterType(); // "Fahrenheit to Celsius"
 * ConverterUtil converterUtil = converter.converterUtil(); // Get ConverterUtil object with conversion details
 * ```
 * 
 * @author Jadepat
 */
public class FCconverter implements Converter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        private double fahrenheit;
        private final String beforeUnit = "Fahrenheit";
        private final String afterUnit = "Celsius";
        private ConverterUtil converterUtil;
       
        /**
         * Constructs an FCconverter object with the default Fahrenheit value of 0.
         */
        public FCconverter(){
            this(0);
        }
        
        /**
         * Constructs an FCconverter object with the specified Fahrenheit value.
         * 
         * @param fahrenheit the value in Fahrenheit to be converted
         */
        public FCconverter(double fahrenheit){
            this.fahrenheit = fahrenheit;
            this.converterUtil = new ConverterUtil(fahrenheit,beforeUnit,afterUnit);
        }

	/**
         * Converts the given Fahrenheit value to Celsius.
         * 
         * @param fahrenheit the value in Fahrenheit to be converted
         * @return the equivalent value in Celsius
         */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
        
        /**
         * Returns the converter type as "Fahrenheit to Celsius".
         * 
         * @return the converter type
         */
        @Override
        public String getConverterType(){
            return "Fahenheit to Celsius";
        }
        
        /**
         * Returns the ConverterUtil object associated with this FCconverter.
         * 
         * @return the ConverterUtil object
         */
        @Override
        public ConverterUtil converterUtil(){
            return converterUtil;
        }
}
