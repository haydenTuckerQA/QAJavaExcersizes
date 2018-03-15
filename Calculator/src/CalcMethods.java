public class CalcMethods {

	public void inputIntegers (int num1, int num2, int num3) {		//methods that we call
		//don't need 'static' if it's not in main
		add(num1, num2, num3);
		subtract(num1, num2, num3);
		multiply(num1, num2, num3);
		divide(num1, num2, num3);
	}
	
	private void add (int num1, int num2, int num3) {				//private methods that can only be used in this class
		if (num1 + num2 == num3) {
			System.out.println(num1 + "+" + num2 + "=" + num3 + ".");
		}
		if (num1 + num3 == num2) {
			System.out.println(num1 + "+" + num3 + "=" + num2 + ".");
		}
		if (num2 + num3 == num1) {
			System.out.println(num2 + "+" + num3 + "=" + num1 + ".");
		}
	}
	
	private void subtract (Operation op, int num1, int num2, int num3) {
		if (num1 - num2 == num3) {
			System.out.println(num1 + "-" + num2 + "=" + num3 + ".");
		}
		if (num2 - num1 == num3) {
			System.out.println(num2 + "-" + num1 + "=" + num3 + ".");
		}
		if (num2 - num3 == num1) {
			System.out.println(num2 + "-" + num3 + "=" + num1 + ".");
		}
		if (num3 - num2 == num1) {
			System.out.println(num3 + "-" + num2 + "=" + num1 + ".");
		}
		if (num1 - num3 == num2) {
			System.out.println(num1 + "-" + num3 + "=" + num2 + ".");
		}
		if (num3 - num1 == num2) {
			System.out.println(num3 + "-" + num1 + "=" + num2 + ".");
		}
		
		
	}
	
	private void multiply (int num1, int num2, int num3) {
		if (num1 * num2 == num3) {
			System.out.println(num1 + "x" + num2 + "=" + num3 + ".");
		}
		if (num1 * num3 == num2) {
			System.out.println(num1 + "x" + num3 + "=" + num2 + ".");
		}
		if (num2 * num3 == num1) {
			System.out.println(num2 + "x" + num3 + "=" + num1 + ".");
		}
	}
	
	private void divide (int num1, int num2, int num3) {
		if (num1 / num2 == num3) {
			System.out.println(num1 + "÷" + num2 + "=" + num3 + ".");
		}
		if (num2 / num1 == num3) {
			System.out.println(num2 + "÷" + num1 + "=" + num3 + ".");
		}
		if (num2 / num3 == num1) {
			System.out.println(num2 + "÷" + num3 + "=" + num1 + ".");
		}
		if (num3 / num2 == num1) {
			System.out.println(num3 + "÷" + num2 + "=" + num1 + ".");
		}
		if (num1 / num3 == num2) {
			System.out.println(num1 + "÷" + num3 + "=" + num2 + ".");
		}
		if (num3 / num1 == num2) {
			System.out.println(num3 + "÷" + num1 + "=" + num2 + ".");
		}
		
		
	}

}

