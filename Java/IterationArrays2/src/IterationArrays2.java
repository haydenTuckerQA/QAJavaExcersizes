public class IterationArrays2 {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		int value = 5;
		
		for (int x = 0; x < intArray.length; x++) {
			intArray[x] = value;
			System.out.print(intArray[x] + " ");
			value += 5;
		}
		System.out.println();
		
		for (int x = 0; x < intArray.length; x++) {
			System.out.print((intArray[x] * 10) + " ");
		}
	}
}