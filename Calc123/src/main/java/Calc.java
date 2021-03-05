public class Calc{
	
	public static double add(double a, double b) {
		return a + b;
		
	}
	public static double subt(double a, double b) {
		return a - b;
		
	}		
	
	public static double mult(double a, double b) {
		return a * b;
		
	}		
	
	public static double div(double a, double b) {
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
