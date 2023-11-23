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
	
	public static int grades(int mark) {
			
		if (mark >= 71 && mark <= 100) {
			System.out.println("Distinction");
		} else if (mark >= 61 && mark <= 70) {
			System.out.println("Merit");
		} else if (mark >= 50 && mark <= 60) {
			System.out.println("Pass");
		} else if (mark < 50 && mark > 0) {
			System.out.println("Fail");
		} else {
			System.out.println("Error: marks must be between 1..100");
		}
	}
	
	public void part1() {
		String[] names = new String[5];
		int[] marks = new int[5];
		int[] grades = new int[5];
				
//		grades();
		
//		String[] names = {"John", "Luke", "Kate", "Annie", "Matilda"};
		
//		int[] marks = {50, 60, 100, 71, 55};
		
//		Create a loop (while or for) to:
//			a. Get a student name and store it in the names array
		

		
		for (int i = 0; i < names.length; i++) {
			String studentName = getString("Enter student name: ");
			String result = names[i] = studentName;
			
			int mark = getInt("Enter mark: ");
			int markResult = marks[i] = mark;
						
		}
		
		for (int j = 0; j < grades.length; j++) {
			int grade = grades(j);
			int gradeResult = grades[j] = grade;
		}
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(marks));
		System.out.println(Arrays.toString(grades));
		
	}
}
