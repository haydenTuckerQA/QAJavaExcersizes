public class Conditionals {
	public static void main(String[] args) {
		System.out.println(addOrMultiply(3, 2, false));
	}

	/* ask if too brief parameter names (thought it was simple enough to 
	 * understand what was going on) */
	public static int addOrMultiply (int x, int y, boolean addMultiply) {
		if (addMultiply) {
			return x + y;
		} else {
			return x * y;
		}
	}
}
