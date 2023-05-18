//standard Algonquin header here
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * simple class to test 2 classes for converting Fahrenheit to Celsius and the reverse
 * @author kriger
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
		UnitConverter convertItem = new UnitConverter();
		System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, convertItem.convert(70.0));
                
		convertItem.changeBehaviorTo(new CFconverter());
		System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, convertItem.convert(20.0));
                
		UnitConverter convertItem2 = new UnitConverter();
                convertItem2.changeBehaviorTo(new MFTconverter());
                System.out.printf("%5.2f in meter is %5.2f feet\n", 50.0, convertItem2.convert(50.0));
                
                convertItem2.changeBehaviorTo(new FTMconverter());
                System.out.printf("%5.2f in feet is %5.2f meter\n", 164.0, convertItem2.convert(164.0));
	}

}
