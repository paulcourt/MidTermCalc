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
		if (b == 0) {
	        	throw new ArithmeticException("Division by 0");
			}
	        else{
	            return a / b;
	        }
			
	}
		
		
		public static void main (String[] argv) 
		   {
			
			double result = add(2,3);
		     
		      System.out.println("Add: " + result);

			result = Calc.subt(2,3);
			     
			  System.out.println("Subt: " + result);
			
			result = Calc.mult(2,3);
				     
				System.out.println("Mult: " + result);

			result = Calc.div(2,0);
					     
				System.out.println("Div: " + result);

		   }
	}
