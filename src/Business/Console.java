package Business;
import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	
	public static Boolean promptToContinue(String prompt) {
		int count = 0;
		System.out.print(prompt);
		while (true) {
			String s = sc.nextLine();
			if (!s.isEmpty()) {
				if (!s.toLowerCase().equals("y")&&!s.toLowerCase().equals("n")) {
					System.out.print("Please enter either y or n: ");
				} else if (s.toLowerCase().equals("y")) {
					return true;
				} else {
					return false;
				}
			} else {
				if (count==0) {
					count++;
					continue;
				} else {
					System.out.println("There was an error with your input. Please try again.");
					System.out.println();
					System.out.print(prompt);
					continue;
				}
			}
		}
	}
	
	
	public static String checkNullInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			String s = sc.nextLine();
			if (!s.isEmpty()) {
				return s;
			} else {
				System.out.println("There was an error with your input. Please hit enter to refresh this prompt.");
				System.out.println();
				continue;
			}
		}
	}
	
	public static String getString(String prompt){
		while (true) {
			System.out.print(prompt);
			String s = sc.nextLine();
			if (!s.isEmpty()) {
				return s;
			} else {
				System.out.println("There was an error with your input. Please hit enter to refresh this prompt.");
				System.out.println();
				continue;
			}
		}
	}
	
	public static String getString(String prompt, String op1, String op2){
		while (true) {
			System.out.print(prompt);
			String s = sc.nextLine();
			if (!s.isEmpty()) {
				if (s.toLowerCase().equals(op1)||s.toLowerCase().equals(op2)) {
					return s;
				} else {
					System.out.println("Please enter either "+op1+" or "+op2);
				}
			} else {
				System.out.println("There was an error with your input. Please hit enter to refresh this prompt.");
				System.out.println();
				continue;
			}
		}
	}

	public static int getInt(String prompt) {
		int i = 0;
		boolean isValid = false;
		while(!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
				sc.next();
				continue;
			}
		}
		return i;
	}
	
	public static int getInt(String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while(!isValid) {
			i = getInt(prompt);
			if (i<=min) {
				System.out.println("Error! Number must be greater than "+min+".");
			} else if (i>=max) {
				System.out.println("Error! Number must be less than "+max+".");
			} else {
				isValid = true;
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static Boolean isEven(int userInput) {
		if (userInput%2==0) {
			return true;
		}
		return false;
	}
	
}
