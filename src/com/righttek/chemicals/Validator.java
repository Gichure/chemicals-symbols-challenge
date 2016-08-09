package com.righttek.chemicals;

public class Validator {
	
	public void validate(String symbol,String name) throws Exception{
		
		if(symbol.length() != 2)
			throw new Exception("All chemical symbols must be exactly two letters!");
		
		else if(!name.contains(symbol.substring(0, 1)) || !name.contains(symbol.substring(1)))
			throw new Exception("Both letters in the symbol must appear in the element name!");
		
		else if(name.indexOf(symbol.substring(0, 1)) > name.indexOf(symbol.substring(1)))
			throw new Exception("The two letters must appear in order in the element name!");
		
		else if(symbol.substring(0, 1).contentEquals(symbol.substring(1))){
			 int count = name.length() -name.replaceAll(symbol.substring(0, 1), "").length();
			 if(count < 2)
				 throw new Exception("If the two letters in the symbol are the same, it must appear twice in the element name!");
		}
		
		else
			System.out.println("Valid Name Convention: "+name + ", "+symbol);
		
		
		
	}

}
