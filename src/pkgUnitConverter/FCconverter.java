// standard Algonquin header goes here.
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author kriger
 */
public class FCconverter implements ConverterBehavior{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        private double fahrenheit;
       
        public FCconverter(){
            this(0);
        }
        
        public FCconverter(double fahrenheit){
            this.fahrenheit = fahrenheit;
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
        public String toString() {
        return String.format("%5.2f in Fahrenheit is %5.2f Celsius", fahrenheit, convert(fahrenheit));
        }
}
