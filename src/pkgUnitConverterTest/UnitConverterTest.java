/*
Student Name: Jadepat Chernsonthi
Student Number: 041074866
Course & Section #: 22S_CST8288_011
Declaration:
This is my own original work and is free from Plagiarism.
*/
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * A simple class to test two classes for converting Fahrenheit to Celsius and meters to feet (and vice versa).
 * The main method creates instances of UnitConverter and tests the conversion functionalities.
 * 
 * Example usage:
 * ```
 * UnitConverter convertItem = new UnitConverter(50);
 * convertItem.display(); // Display the conversion result from Fahrenheit to Celsius
 * 
 * convertItem.changeBehaviorTo(new CFconverter(10)); // Change the behavior to convert Celsius to Fahrenheit
 * convertItem.display(); // Display the conversion result from Celsius to Fahrenheit
 * ```
 * 
 * The main method demonstrates the usage of the UnitConverter class by creating instances and
 * performing conversions. It showcases the conversion from Fahrenheit to Celsius, Celsius to Fahrenheit,
 * meters to feet, and feet to meters using different converter implementations.
 * 
 * The UnitConverterTest class serves as a simple test class to validate the functionality of the converters.
 * It can be modified or expanded to include additional test cases if needed.
 * 
 * Note: The declaration comment at the beginning includes the student name, student number, course, section,
 * and a declaration of original work and freedom from plagiarism.
 * 
 * @author Jadepat
 */
public class UnitConverterTest {

    /**
     * The entry point of the program.
     * Creates instances of UnitConverter and tests the conversion functionalities.
     * 
     * @param args the command line arguments
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
