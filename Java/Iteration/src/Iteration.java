public class Iteration {
	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			System.out.println(add(x, 1));
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
