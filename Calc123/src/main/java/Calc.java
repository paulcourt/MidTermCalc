public class Calc{
	
	public static double add(int a, int b) {
		return a + b;
		
	}
	public static double subt(int a, int b) {
		return a - b;
		
	}		
	
	public static double mult(int a, int b) {
		return a * b;
		
	}		
	
	public static double div(int a, int b) {
		return a / b;
		
	}
	
	
	public static void main (String[] argv) 
	   {
		
		double result = add(3,2);
	     
	      System.out.println("Add: " + result);

		result = Calc.subt(3, 2);
		     
		  System.out.println("Subt: " + result);
		
		result = Calc.mult(3,2);
			     
			System.out.println("Mult: " + result);

		result = Calc.div(3,2);
				     
			System.out.println("Div: " + result);

	   }
}
