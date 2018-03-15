import java.util.ArrayList;

public class PaintWizard {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Paint> paintOptions = new ArrayList<Paint>();
		paintOptions.add(new Paint("CheapoMax", 20, 19.99, 10));
		paintOptions.add(new Paint("AverageJoes", 15, 17.99, 11));
		paintOptions.add(new Paint("DuluxourousPaints", 10, 25, 20));
		
		PaintCalculator paintCalculator = new PaintCalculator();
		
		paintCalculator.cheapestForRoom(paintOptions, 1000);
		paintCalculator.leastWastefulPaint(paintOptions, 200);
		paintCalculator.cheapestPaintPerMetre(paintOptions);
	}
}