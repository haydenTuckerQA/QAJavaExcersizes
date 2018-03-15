public class Operator {
	/* ask if too brief parameter names (thought it was simple enough to 
	 * understand what was going on) */
	public int add(int x, int y) {
		if(x == 0) {
			return y;
		} else if (y == 0) {
			return x;
		} else {
			return x + y;
		}
	}
	
	public void printAddTenTimes() {
		for (int x = 0; x < 10; x++) {
			System.out.println(add(x, 1));
		}
	}
}
