package lab05;

import java.util.Scanner;

public class Lab5 {
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		int numericValue = s.nextInt();
		 s.nextLine();
		return numericValue;
		
	}
	
	public void grades() {
		
		while (true) {
			int grade = getInt("Enter grade: ");
			
			if (grade >= 71 && grade <= 100) {
				System.out.println("Distinction");
				break;
			} else if (grade >= 61 && grade <= 70) {
				System.out.println("Merit");
				break;
			} else if (grade >= 50 && grade <= 60) {
				System.out.println("Pass");
				break;
			} else if (grade < 50 && grade > 0) {
				System.out.println("Fail");
				break;
			} else {
				System.out.println("Error: marks must be between 1..100");
			}
		}
	}
	
	public static String getString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
		
	}
	
	public void part2() {
		String userResponse1 = getString("Is it Summer time?");	
		String userResponse2 = getString("Is it early evening?");

		Boolean summerTime = (userResponse1.equals("yes")) ? true : false;
		Boolean earlyEvening = (userResponse2.equals("yes")) ? true : false;
				
		if (summerTime && earlyEvening) {
			System.out.println(summerTime);
			System.out.println(earlyEvening);
			System.out.println("Action: Take a shower\nAction: Eat outside\nAction: Do outdoors hobby\nAction: Contact friends");
		} else if (summerTime && !earlyEvening) {
			System.out.println("Action: Take a shower\nAction: Eat inside\nAction: Do outdoors hobby\nAction: Contact friends");
		} else if (!summerTime && earlyEvening) {
			System.out.println("Action: Take a shower\nAction: Eat inside\nAction: Take a walk\nAction: Contact friends");
		} else if (!summerTime && !earlyEvening) {
			System.out.println("Action: Take a shower\nAction: Eat inside\nAction: Contact friends");
		}
		
	}
}

