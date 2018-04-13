public class Arrays {
	public static void main(String[] args) {
		int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int x = 0; x < intArray.length; x++) {
			System.out.println("-----Pass " + (x + 1) + "-----");
			for (int y = 0; y < intArray.length; y++) {
				System.out.println(add(x, y));
			}
		}
	}

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
}
