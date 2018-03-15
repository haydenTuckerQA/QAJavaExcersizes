public class Calculator {

	public static void main(String[] args) {

		CalcMethods calculation = new CalcMethods();	//similar to creating a variable, e.g. int variableName = 7.
		//using CalcMethods class to create a new object, i.e. calculation, which will run the methods in CalcMethods
		
		calculation.inputIntegers (2,2,4);		//using the 'calculation' object to run the 'inputIntegers' method
		//calculation.add will not work because it is private in the 'CalcMethods' class
	}
}
