import java.util.ArrayList;

public class PaintCalculator {
	public Paint cheapestForRoom(ArrayList<Paint> paintOptions, int roomSize) {
		Paint cheapestPaintForRoom = new Paint("NoneExist", 0, 0, 0);
		double cheapestPrice = 0;
		
		for (Paint paint : paintOptions) {
			double priceForRoom = paint.getPriceForRoom(roomSize);
			
			if (cheapestPrice == 0) {
				cheapestPrice = priceForRoom;
				cheapestPaintForRoom = paint;
			} else if (priceForRoom < cheapestPrice) {
				cheapestPrice = priceForRoom;
				cheapestPaintForRoom = paint;
			}
		}
		
		System.out.println("\nThe Cheapest price for a " + roomSize + "m^2 room is " + cheapestPaintForRoom.getName() + " for £" + cheapestPrice + "\n");
		return cheapestPaintForRoom;
	}
	
	public Paint leastWastefulPaint(ArrayList<Paint> paintOptions, int roomSize) {
		Paint leastWastefulPaint = new Paint("NoneExist", 0, 0, 0);
		int leastWaste = 0;
		
		for (Paint paint : paintOptions) {
			int wasteForRoom = paint.getWasteForRoom(roomSize);
			
			if (leastWaste == 0) {
				leastWaste = wasteForRoom;
				leastWastefulPaint = paint;
			} else if (wasteForRoom < leastWaste) {
				leastWaste = wasteForRoom;
				leastWastefulPaint = paint;
			}
		}
		
		System.out.println("\nThe Least waste for a " + roomSize + "m^2 room is " + leastWastefulPaint.getName() + " wasting " + leastWaste + "m^2\n");
		return leastWastefulPaint;
	}
	
	public Paint cheapestPaintPerMetre(ArrayList<Paint> paintOptions) {
		Paint cheapestPaint = new Paint("NoneExist", 0, 0, 0);
		double cheapestPrice = 0;
		
		for (Paint paint : paintOptions) {
			double priceForRoom = paint.getPricePerMetre();
			
			if (cheapestPrice == 0) {
				cheapestPrice = priceForRoom;
				cheapestPaint = paint;
			} else if (priceForRoom < cheapestPrice) {
				cheapestPrice = priceForRoom;
				cheapestPaint = paint;
			}
		}
		
		System.out.println("\nThe Cheapest price per m^2 is " + cheapestPaint.getName() + " for £" + cheapestPrice + "\n");
		return cheapestPaint;
	}
}
