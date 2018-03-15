public class TooHotCalculator {
	public boolean isNotTooHot(int temperature, boolean isSummer) {
		if (isSummer) {
			return (temperature >= 60 && temperature <= 100);
		} else {
			return (temperature >= 60 && temperature <= 90);
		}
	}
}
