public class Calc{
	
	public static int add(int a, int b) {
		return a + b;
		
	}
	public static int subt(int a, int b) {
		return a - b;
		
	}		
	
	public static int mult(int a, int b) {
		return a * b;
		
	}		
	
	public static double div(int a, int b) {
		return a / b;
		
	}
	
	
	public static void main (String[] argv) 
	   {
		
		int result = add(2,3);
	     
	      System.out.println("Add: " + result);

		result = Calc.subt(2,3);
		     
		  System.out.println("Subt: " + result);
		
		result = Calc.mult(2,3);
			     
			System.out.println("Mult: " + result);

		double result1 = Calc.div(2,3);
				     
			System.out.println("Div: " + result1);

	   }
}
