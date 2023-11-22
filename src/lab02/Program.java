package lab02;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Part 1 – Declaring and initialising local variables.
//		 int age = 30;
//		 String name = "John";
//		 int houseNumber = 10;
//		 String streetName = "Downing St";
//		 String postcode = "W1 8DA";
//		 String telephone = "02083947651";
//		 String company = "Government";
//		 double salary = 89.5;
//		 boolean drivingLicense = true;
//	
//	     System.out.println("Age:" + age);
//	     System.out.println("Name:" + name);		
//	     System.out.print(houseNumber + " " + streetName + "\nPostcode: " + postcode + "\n");
//	     System.out.println(telephone);
//	     System.out.println("Company: " + company);
//	     System.out.println("Salary: " + salary);
//	     System.out.println("Driving License [t/f]:" +  drivingLicense);
		
		
		
		
//		Part 2 – Doing some maths work.
		
		int number = 5;
		System.out.println("Initial Value: " + number );

		// Task 1
		
		// - double it using the '*' operator
		number = number * 2;
		
		// - now double it again using the '*=' operator
		number *= 2;
		
		System.out.println("\n1. After doubling it twice: " + number);
		
		
		
		// Task 2

		// - add 3 to it using the '+' operator
		number = number + 3;

		// - now add 3 to it using the '+=' operator
		number += 3;

		System.out.println("\n2. After adding 3 twice: " + number);
		
		
		
		// Task 3 - subtract 12 from it using an appropriate 'compound' operator
		number -= 12;

		System.out.println("\n3. After subtracting 12: " + number);
		
		
		
		// Task 4 - divide the number (ought to be 14 now) by 3

		// what do you think the answer is
		number /= 3;

		System.out.println("\n4. After dividing by 3: " + number);
		
		
		
		
		// Task 5 write 4 different statements that all do the same thing

		// namely 'add 1 to the number'
		
		number = number + 1;
		
		number += 1;
		
		int number2 = 1;
		
		number += number2;
		
		while (number <= 7) {
			  number++;
			  System.out.println(number);
			}

		System.out.println("\n5. After adding 1 four times: " + number);
		
		
		
		
		// Task 6 decrement by 1 the value of number
		number--;

		System.out.println("\n6. After decrementing once: " + number);
		
		
		
		
		// Task 7 put the remainder when dividing by 3 into 'remainder'

		int remainder = 0;
		
		remainder = number %= 3;

		System.out.println("\n7. Remainder when dividing by 3 is :" + remainder);
		
		
		
		
		// Task 8

		// decide what it will print before uncommenting the println()

		int a = 2, b = 3, c = 5;

		double d1, d2, d3, d4;

		d1 = a + b * c / 2; 
//		 System.out.println("\n" + b * c / 2);
//				* c / 2;

		d2 = (a + b * c) / 2;

		d3 = (a + b) * c / 2;

		d4 = (a + b) * (c / 2);
		
	    System.out.println("\n8. Values: " + d1 + " : " + d2 + " : " + d3);

		// + " : " + d4);

		// Type your answer here--> Newline; prints string "Values: " and concatenate the variables after performing calculations.
		// d1 = 12.5
		// d2 = 8.5
		// d3 = 7.5
		// d4 = 12.5
		
	    // How it actually works out the calculation: similar to BODMA?
	    // BODMAS - when presented with a number sentence containing more than one operation (such as 3 + 4 x 2) the operations cannot be completed from left to right, but instead in their order of “importance”, which is what BODMAS stands for.
	    // Brackets, Orders, Division, Multiple, Addition, Subtraction
	    // HOWEVER
	    
	    
	    
	    //(2 + 3 * 5) = 5
	    
	    
	    
	    
	    
	    
	    // Task 9

	    int p, q;

	    p = 10;

	    q = 10;

	    p += q++;
	    
	    // 10 + 10 = 20  p = 20 and q = 11

	    // Decide what the next line will print

	    //System.out.println("\n9. Result is: " + (p + q)); // Answer-->31

	    
	    
	    
	    
	    // Task 10 – Uncomment the code below

	    System.out.println("\n11.");

	    // Decide what the following 4 lines will print

	    // The 4th one might surprise you

	    System.out.println("fred" + 3 + 4); // Answer-->fred34

	    System.out.println(3 + 4 + "fred"); // Answer-->7fred

	    System.out.println("" + 3 + 4); // Answer-->34

	    System.out.println(3 + ' ' + 4); // Answer--> 3 4
	    
	    
		
	}

}
