/**
* @author pgichure
 * @Date Aug 8, 2016
 * @version 1.0
 *
 */
package com.righttek.chemicals;

import java.util.Scanner;

/**
 * @author pgichure
 * @Date Aug 8, 2016
 * @version 1.0
 */
public class PeriodicTable {
	
	private static String symbol;
	
	private static String elementName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Validator validator = new Validator();
			
			Scanner in  = new Scanner(System.in);
			
			System.out.println("Enter the element name: ");
			elementName = in.nextLine();
			
			System.out.println("Enter the element symbol: ");
			symbol = in.nextLine();
			
			validator.validate(symbol, elementName);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
