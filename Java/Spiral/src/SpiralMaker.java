public class SpiralMaker {
	int xUpper ;
	int xLower = 0;
	int yUpper;
	int yLower = 0;
	int number = 1;
	int[][] spiral;
	
	public int[][] makeSpiral(int n) {
		this.spiral = new int[n][n];
		this.xUpper = n;
		this.yUpper = n;
		
		
		boolean keepGoing = true;
		
		while (keepGoing) {
			if (number <= n * n) {
				printRowForwards();
			} else {
				keepGoing = false;
			}
			
			if (number <= n * n) {
				printColDownwards();
			} else {
				keepGoing = false;
			}
			
			if (number <= n * n) {
				printRowBackwards();
			} else {
				keepGoing = false;
			}
			
			if (number <= n * n) {
				printColUpwards();
			} else {
				keepGoing = false;
			}
		}
		
		return this.spiral;
	}
	
	public void printRowForwards() {
		for (int yTemp = xLower; yTemp < xUpper; yTemp++) {
			this.spiral[xLower][yTemp] = number;
			number++;
		}
		this.yLower++;
	}
	
	public void printColDownwards() {
		for (int xTemp = yLower; xTemp < yUpper; xTemp++) {
			this.spiral[xTemp][yUpper-1] = number;
			number++;
		}
		this.xUpper--;
	}
	
	public void printRowBackwards() {
		for (int yTemp = xUpper - 1; yTemp >= xLower; yTemp--) {
			this.spiral[xUpper][yTemp] = number;
			number++;
		}
		this.yUpper--;
	}
	
	public void printColUpwards() {
		for (int xTemp = yUpper - 1; xTemp >= yLower; xTemp--) {
			this.spiral[xTemp][yLower -1] = number;
			number++;
		}
		this.xLower++;
	}
}
