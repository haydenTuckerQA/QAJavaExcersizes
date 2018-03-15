public class ArrayHandler {
	public int[] populateArray () {
		int[] intArray = new int[10];
		int value = 5;
		
		for (int x = 0; x < intArray.length; x++) {
			intArray[x] = value;
			value += 5;
		}
		printArray(intArray);
		
		return intArray;
	}
	
	public void outputArrayTimesTen(int[] intArray) {
		for (int x = 0; x < intArray.length; x++) {
			intArray[x] *= 10;
		}
		printArray(intArray);
	}
	
	public void printArray(int[] intArray) {
		for (int x = 0; x < intArray.length; x++) {
			if(x < intArray.length - 1) {
				System.out.print(intArray[x] + ", ");
			} else {
				System.out.print(intArray[x]);
			}
		}
		System.out.println();
	}
	
}
