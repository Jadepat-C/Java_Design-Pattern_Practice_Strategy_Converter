// standard Algonquin header goes here.
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger
 */
public class CFconverter implements Converter{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        private double celsius;
        private final String beforeUnit = "Celsius";
        private final String afterUnit = "Fahrenheit";
        private ConverterUtil converterUtil;
        
        public CFconverter(){
            this(0);
        }
        
        public CFconverter(double celsius) {
            this.celsius = celsius;
            this.converterUtil = new ConverterUtil(celsius, beforeUnit, afterUnit);
        }
        
        
	/**
	 * @param celsius value in Celsius to be converted
	 * @return equivalent in Fahrenheit
	 */
        @Override
	public double convert(double celsius){
                return celsius * convFactor + convOrigin;   		
	}
        
        @Override
        public String getConverterType(){
            return "Celsius to Fahrenheit";
        }
        
        @Override
        public ConverterUtil converterUtil(){
            return converterUtil;
        }
}
