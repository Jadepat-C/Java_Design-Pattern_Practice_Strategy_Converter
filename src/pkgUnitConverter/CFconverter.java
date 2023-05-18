// standard Algonquin header goes here.
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger
 */
public class CFconverter implements ConverterBehavior{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        private double celsius;
        
        public CFconverter(){
            this(0);
        }
        
         public CFconverter(double celsius) {
            this.celsius = celsius;
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
        public String toString(){
            return String.format("%5.2f in Celsius is %5.2f Fahrenheit", celsius, convert(celsius));
        }
        
}
