public class TooHot {
	public static void main(String[] args) {
		System.out.println(tooHot(100, true));
	}
	
	public static boolean tooHot(int temperature, boolean isSummer) {
		if (isSummer) {
			return (temperature >= 60 && temperature <= 100);
		} else {
			return (temperature >= 60 && temperature <= 90);
		}
	}
}
