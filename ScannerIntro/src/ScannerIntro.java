import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		boolean desiredInputReceived = false;
		
		while(!desiredInputReceived) {
			System.out.println("Enter a number!");
			if (scanner.hasNextInt()) {
				i = scanner.nextInt();
				desiredInputReceived = true;
			} else {
				System.out.println("You did not enter a number!");
				scanner.next();
			}
			
			
		}
		System.out.println("The number you entered is " + i);
		
		desiredInputReceived = false;
		
		while(!desiredInputReceived) {
			System.out.println("Enter a string! Enter Stop to end.");
			String input = scanner.next();
			
			if (input.equals("Stop")) {
				desiredInputReceived = true;
			}
			
			System.out.println(input);
		}
		
		scanner.close();
	}

}
