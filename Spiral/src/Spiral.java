public class Spiral {
	public static void main(String args[]) {
		SpiralMaker sm = new SpiralMaker();
		int input = 5;
		int[][] spiral = sm.makeSpiral(input);
		
		int digitsInSquare = String.valueOf(input*input).length();
		
		for (int[] row : spiral) {
			for (int pos : row) {
				int digits = String.valueOf(pos).length();
				for (int x = 0; x < (digitsInSquare - digits); x++) {
					System.out.print("0");
				}
				System.out.print(pos + " ");
			}
			System.out.println();
		}
	}
}
