package lab06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab6 {
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
	
	public void part1() {
		grades();
	}
	
	public void grades() {
		
		String[] names = new String[5];
		int[] marks = new int[5];
		
		for (int i = 0; i < names.length; i++) {
			String studentName = getString("Enter student name: ");
			String result = names[i] = studentName;
			
			int mark = getInt("Enter mark: ");
			int markResult = marks[i] = mark;
			
						
		}
		
//		Incomplete, need to go back to this
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int mark = marks[i];
			String result = null;
			
			if (mark >= 71 && mark <= 100) {
				result = "Distinction";
			} else if (mark >= 61 && mark <= 70) {
				result = "Merit";
				break;
			} else if (mark >= 50 && mark <= 60) {
				result = "Pass";
			} else if (mark < 50 && mark > 0) {
				result = "Fail";
			} else {
				System.out.println("Error: marks must be between 1..100");
			}
			
			System.out.printf("%s got %d marks and their result is: %s\n", name, mark, result);
		}
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(marks));
				
	}
		
}
