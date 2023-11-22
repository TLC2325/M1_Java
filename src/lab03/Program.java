package lab03;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
//		int i = getInt("Enter a numeric value: ");
//		String str = getString("Enter a string: ");
//		getInt("Enter a numeric value: ");
//		getString("Enter a string: ");
//		System.out.printf("Input 1: %d and Input 2: %s", i, str);
		
		theLunchQueue();

		int userWeight = getInt("Enter your weight: ");
        convertLbsToStonesPounds(userWeight);
        
        int weightToConvert = getInt("Kgs to convert: ");
        convertKgsToStonesPounds(weightToConvert);
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		int numericValue = s.nextInt();
		 s.nextLine();
		return numericValue;
		
	}
	
	public static String getString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
		
	}

	public static void theLunchQueue() {
		String dish = getString("What main dish would you like(Fish, Burger or Veg)?");
			
		int numOfPotatoes = getInt("How many roast potatoes would you like?");
		
		int numOfBrussleSprouts = getInt("How many Brussel Sprouts would you like?");
		
		System.out.printf("Hello, your lunch is %s, with %d roast potatoes and %d Brussel sprouts.", dish, numOfPotatoes, numOfBrussleSprouts);
	}
	
	
	public static void convertLbsToStonesPounds(int userWeight) {
		int stones = userWeight / 14;
		int pounds = userWeight % 14;
	
		System.out.printf("You weigh %d stones %d lbs.\n", stones, pounds);
	}

	public static void convertKgsToStonesPounds(int kgs) {
    	double kgsToStones = kgs * 2.20462;
    	convertLbsToStonesPounds((int)kgsToStones);
    }
}

