package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = { "1", "2", "3", "4", "5" };
		// 2. print the third element in the array
		System.out.println(array[2]);
		// 3. set the third element to a different value
		array[2] = "Not 3";
		// 4. print the third element again
		System.out.println(array[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// 6. make an array of 50 integers
		int[] numbers = new int[50];
		Random r = new Random();
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numbers.length; i++) {
			int rand = r.nextInt(2147483646);
			numbers[i] = rand;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = 1;
		int largest = 1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < numbers[smallest]) {
				smallest = i;
			}
			if (numbers[i] > numbers[largest]) {
				largest = i;
			}
		}
		System.out.println(numbers[smallest]);
		// 9 print the entire array to see if step 8 was correct
for (int i = 0; i < numbers.length; i++) {
	System.out.println(numbers[i]);
}
		// 10. print the largest number in the array.
		System.out.println(numbers[largest]);
	}
}
