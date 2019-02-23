
package cse360assign2;
public class Calculator {

	private int total; 
	public int value1 = 4 ,value2 = 2,value3 = 1,value4 = 1; // values for calculations
	
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return ((value1-value2*value3/value4));  //values 
	}
	
	public int add (int value1) { //add int to functions so that I could put in string in getHistory()
		
		total = total + value1;
		
		return total;
		
	}
	
	public int subtract (int value2) {
		
		total = total - value2;
		
		return total;
	}
	
	public int multiply (int value3) {
		
		total = total * value3;
		
		return total;
	}
	
	public int divide (int value4) {
		
		if (value4 == 0) {
			
			return 0;
		}
	    total = total/value4;
	    
		return total;
	}
	
	public String getHistory () {  // you can put however many histories you want here, but you have to add manually
		
		return (" 0 + " + add(value1) + " - " + subtract(value2) + " * " + multiply(value3) + " / " + divide(value4));
	}
	
}