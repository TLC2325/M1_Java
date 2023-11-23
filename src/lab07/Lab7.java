package lab07;

import java.util.Arrays;

public class Lab7 {
	public void start() {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		
		System.out.println(Arrays.toString(numbers));
		
		int sum = sum(numbers);
		System.out.println("The sum of the array numbers: " + sum);
		
		int average = average(numbers);
		System.out.println("The average of the array: " + average);
		
		int smallest = smallestValue(numbers);
		System.out.println("Smallest element in given array: " + smallest);
		
		int highestValue = highestValue(numbers);
		System.out.println("Highest element in given array: " + highestValue);
		
		int findNumber = numToFind(numbers);
		System.out.println("The index is: " + findNumber);
	}
	
	public int sum(int[] array) {
		int result = 0;
		
		for (int num : array) {
			result += num;
		}
		
		return result;
	}
	
	public int average(int[] array) {
		int lengthOfArray = array.length;
		return sum(array) / lengthOfArray;
	}
	
	public int smallestValue(int[] array) {
		int  smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest)
				smallest = array[i];
		}
		
		return smallest;
	}
	
	public int highestValue(int[] array) {
		int max = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public int numToFind(int[] array) {
		int numberToFind = 0;
		int arrayIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numberToFind) {
				arrayIndex = i;
				break;
			}
		}
		return arrayIndex;
		
	}
	
}
