package cse360assign2;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator values = new Calculator();
		//int totalVal = values.getTotal();
		
		//int addVal = values.add(1);
		//int subVal = values.subtract(1);
		//int multVal = values.multiply(0);
		//int divideVal = values.divide(0);
		int totalVal = values.getTotal();
		String hist = values.getHistory();
		
		//System.out.println(addVal);
		//System.out.println(totalVal);
		//System.out.println(subVal);
		//System.out.println(multVal);
		//System.out.println(divideVal);
		System.out.println(totalVal + " total value");
		System.out.println(hist);
	}

}
