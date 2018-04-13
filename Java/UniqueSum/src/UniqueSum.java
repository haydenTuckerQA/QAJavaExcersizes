public class UniqueSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(uniqueSum(1, 1, 2));
	}

	public static int uniqueSum(int x, int y, int z) {
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
