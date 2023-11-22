package lab04;

import java.util.Scanner;

//In this practical called ‘Kids in a Candy Store’ you’ll practise using if else statements
//
//Introduction to ‘Kids In a Candy Store’
//
//In this practical you will prompt the user for the price of a bag of sweets in pennies, also the amount of money they have (in pennies) and then perform a calculation to work out how many bags of sweets they can afford. Then it will be possible to display a friendly message like:
//
//“The price is ‘x’p and you have ‘y’p then you will be able to buy ‘z’ bags”.

public class Lab4 {
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		int numericValue = s.nextInt();
		 s.nextLine();
		return numericValue;
		
	}
	
	@SuppressWarnings("unused")
	public void part1() {
//		7. Ask the user “Price of a bag please?” and hold the result in a variable.
//		int sweetBagPrice = getInt("Price of a bag please?");
		
//		8. Ask the user “How much money do you have?” and record it in a variable.
//		int userMoney = getInt("How much money do you have?");
		
//		9. Calculate the number of bags they can afford and store in a variable called
		
		while (true) {
			int sweetBagPrice = getInt("Price of a bag please?");
			int userMoney = getInt("How much money do you have?");
			
			if (sweetBagPrice <= 0 && userMoney > 0) {
				System.out.println("Sweet bag price must not be a negative number");
			} else if (sweetBagPrice > 0 && userMoney <= 0) {
				System.out.println("You cannot have negative money, come back with your pocket money.");
			} else if (sweetBagPrice > 0 && userMoney > 0) {
				int numOfsweetBagsUserCanBuy = userMoney / sweetBagPrice;
				int remainingPennies = userMoney % sweetBagPrice;

				if (remainingPennies != 0) {
//					System.out.printf("You can buy %d bags of sweets and have %d pennies left.", numOfsweetBagsUserCanBuy,
//							remainingPennies);
					System.out.printf(
							"If the price is %dp for a bag of sweet and you have %dp then you will be able to buy %d bags and have %dp left.",
							sweetBagPrice, userMoney, numOfsweetBagsUserCanBuy, remainingPennies);
					break;
				} else {
					System.out.printf(
							"If the price is %dp for a bag of sweet and you have %dp then you will be able to buy %dp bags.",
							sweetBagPrice, userMoney, numOfsweetBagsUserCanBuy);
					break;
				}

			} else {
				System.out.println("Sorry please retry");
			}
		}
		
//		if (userMoney >= sweetBagPrice) {
//			int numOfsweetBagsUserCanBuy = userMoney / sweetBagPrice;
//			int remainingPennies = userMoney % sweetBagPrice;
//
//			if (remainingPennies != 0) {
////				System.out.printf("You can buy %d bags of sweets and have %d pennies left.", numOfsweetBagsUserCanBuy,
////						remainingPennies);
//				System.out.printf(
//						"If the price is %dp for a bag of sweet and you have %dp then you will be able to buy %d bags and have %dp left.",
//						sweetBagPrice, userMoney, numOfsweetBagsUserCanBuy, remainingPennies);
//			} else {
//				System.out.printf(
//						"If the price is %dp for a bag of sweet and you have %dp then you will be able to buy %dp bags.",
//						sweetBagPrice, userMoney, numOfsweetBagsUserCanBuy);
//			}
//
//		} else {
//			System.out.println("Sorry you do not have enough pennies to buy a bag of sweet");
//		}
//
	}

	
}

