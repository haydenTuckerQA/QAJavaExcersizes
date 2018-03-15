public class Operator {
	/* ask if too brief parameter names (thought it was simple enough to 
	 * understand what was going on) */
	public int addOrMultiply (int x, int y, boolean addMultiply) {
		if (addMultiply) {
			return x + y;
		} else {
			return x * y;
		}
	}
}
