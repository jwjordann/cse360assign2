
package cse360assign2;
public class Calculator {

	private int total;
	
	public Calculator () {
		//total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public int add (int value) {
		total = total + value;
		return total;
	}
	
	public int subtract (int value) {
		total = total - value;
		return total;
	}
	
	public int multiply (int value) {
		total = total * value;
		return total;
	}
	
	public int divide (int value) {
		if (value == 0) {
			return 0;
		}
		total = total/value;
		return total;
	}
	
	public String getHistory () {
		return "";
	}
	
}