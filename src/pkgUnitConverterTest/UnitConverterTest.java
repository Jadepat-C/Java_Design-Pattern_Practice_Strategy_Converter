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
                System.out.println(convertItem.toString());
                convertItem.display();
                
		convertItem.changeBehaviorTo(new CFconverter(20));
                System.out.println(convertItem.toString());
                convertItem.display();
                
		UnitConverter convertItem2 = new UnitConverter();
                convertItem2.changeBehaviorTo(new MFTconverter(50));
                System.out.println(convertItem2.toString());
                convertItem2.display();
                
                convertItem2.changeBehaviorTo(new FTMconverter(164));
                System.out.println(convertItem2.toString());
                convertItem2.display();
	}

}
