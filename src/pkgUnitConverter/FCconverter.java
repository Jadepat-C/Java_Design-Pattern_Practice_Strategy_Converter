// standard Algonquin header goes here.
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author kriger
 */
public class FCconverter implements Converter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        private double fahrenheit;
        private final String beforeUnit = "Fahrenheit";
        private final String afterUnit = "Celsius";
        private ConverterUtil converterUtil;
       
        public FCconverter(){
            this(0);
        }
        
        public FCconverter(double fahrenheit){
            this.fahrenheit = fahrenheit;
            this.converterUtil = new ConverterUtil(fahrenheit,beforeUnit,afterUnit);
        }

	/**
	 * @param fahrenheit value in Fahrenheit to be converted
	 * @return equivalent in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
        
        @Override
        public String getConverterType(){
            return "Fahenheit to Celsius";
        }
        
        @Override
        public ConverterUtil converterUtil(){
            return converterUtil;
        }
}
