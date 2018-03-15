public class SumPerformer {
	public int uniqueSum(int x, int y, int z) {
		int sum = 0;
		
		if (x != y && x != z) {
			sum += x;
		}
		
		if (y != x && y != z) {
			sum += y;
		}
		
		if (z != y && z != x) {
			sum += z;
		}
		
		return sum;
	}
}
