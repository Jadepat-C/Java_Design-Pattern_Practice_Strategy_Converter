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
		UnitConverter convertItem = new UnitConverter(70);
                convertItem.display();
                
		convertItem.changeBehaviorTo(new CFconverter(20));
                convertItem.display();
                
		UnitConverter convertItem2 = new UnitConverter();
                convertItem2.changeBehaviorTo(new MFTconverter(50));
                convertItem2.display();
                
                convertItem2.changeBehaviorTo(new FTMconverter(164));
                convertItem2.display();
	}

}
