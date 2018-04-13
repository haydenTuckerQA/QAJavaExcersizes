public class Blackjack {
	public static void main(String[] args) {
		System.out.println(blackjack(22, 22));
	}
	
	public static int blackjack(int x, int y) {
		if (x > 21 && y > 21) {
			return 0;
		} else if (x > 21) {
			return y;
		} else if (y > 21) {
			return x;
		} else {
			int xDistance = 21 - x;
			int yDistance = 21 - y;
			
			if (xDistance < yDistance) {
				return x;
			} else {
				return y;
			}
		}
	}
}
