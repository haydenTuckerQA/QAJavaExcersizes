public class Operator {
	/* ask if too brief parameter names (thought it was simple enough to 
	 * understand what was going on) */
	public static int add(int x, int y) {
		if(x == 0) {
			return y;
		} else if (y == 0) {
			return x;
		} else {
			return x + y;
		}
	}
	
	public void outputAllAdditions(int[] intArray) {
		for (int x = 0; x < intArray.length; x++) {
			System.out.println("-----Pass " + (x + 1) + "-----");
			for (int y = 0; y < intArray.length; y++) {
				System.out.println(intArray[x] + " + " + intArray[y] + " = " + add(x, y));
			}
		}
	}
}
