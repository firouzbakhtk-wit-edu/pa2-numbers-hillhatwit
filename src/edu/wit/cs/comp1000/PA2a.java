package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to the PA2a assignment When it runs it it ask the user for five whole numbers Then output
 * - The sum of the positive numbers.
 * - The sum of the negative numbers.
 * - The sum of all five numbers.
 * - The average of the positive numbers (up to two decimal places).
 * - The average of the negative numbers (up to two decimal places).
 * - The average of all five numbers (up to two decimal places).
 * @author Harljen Hill
 */

public class PA2a {

	 /**
     * The main method starts the program by prompting the user to input five whole numbers.
     * It calculates the sums and averages of positive, negative, and all numbers. It then
     * outputs the results in a formatted manner, handling singular/plural grammar for the number
     * of positive/negative values, and displaying averages to two decimal places.
     * 
     * Logic:
     * - Loops through the input numbers to compute sums and counts.
     * - Averages are computed as sums divided by the count of positive/negative numbers.
     * 
     * Output:
     * - The sum of positive numbers.
     * - The sum of negative numbers.
     * - The sum of all five numbers.
     * - The average of positive numbers.
     * - The average of negative numbers.
     * - The average of all numbers.
     * 
     * @param args command line arguments, ignored
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter five whole numbers: ");
		int[] user_input_num = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		int number_of_positive_number = 0;
		int number_of_negative_number = 0;
		int sum_of_positive_num = 0;
		int sum_of_negative_num = 0;
		int sum_of_user_input_num = 0;

		String number_single_or_plural_for_positive_num;
		String number_single_or_plural_for_negative_num;

		for (int i = 0; i < 5; i++) {
			sum_of_user_input_num = sum_of_user_input_num + user_input_num[i];
			if (user_input_num[i] > 0) {
				number_of_positive_number++;
				sum_of_positive_num = sum_of_positive_num + user_input_num[i];
			} else {
				number_of_negative_number++;
				sum_of_negative_num = sum_of_negative_num + user_input_num[i];

			}
		}
		if (number_of_positive_number > 1 || number_of_positive_number == 0) {
			number_single_or_plural_for_positive_num = "numbers";

		} else {
			number_single_or_plural_for_positive_num = "number";
		}
		;
		if (number_of_negative_number > 1 || number_of_negative_number == 0) {
			number_single_or_plural_for_negative_num = "numbers";

		} else {
			number_single_or_plural_for_negative_num = "number";
		}
		;

		double avg_of_positive_num;
		double avg_of_negative_num;
		if (number_of_negative_number == 0) {
			avg_of_negative_num = 0;
		} else {
			avg_of_negative_num = (sum_of_negative_num + 0.0) / number_of_negative_number;
		}
		;
		if (number_of_positive_number == 0) {
			avg_of_positive_num = 0;
		} else {
			avg_of_positive_num = (sum_of_positive_num + 0.0) / number_of_positive_number;
		}
		;

		System.out.printf("The sum of the " + number_of_positive_number + " positive "
				+ number_single_or_plural_for_positive_num + ": " + sum_of_positive_num + "%n");
		System.out.printf("The sum of the " + number_of_negative_number + " non-positive "
				+ number_single_or_plural_for_negative_num + ": " + sum_of_negative_num + "%n");
		System.out.printf("The sum of the 5 numbers: " + (sum_of_positive_num + sum_of_negative_num) + "%n");
		System.out.printf("The average of the " + number_of_positive_number + " positive "
				+ number_single_or_plural_for_positive_num + ": " + "%.2f" + "%n", avg_of_positive_num);
		System.out.printf("The average of the " + number_of_negative_number + " non-positive "
				+ number_single_or_plural_for_negative_num + ": " + "%.2f" + "%n", avg_of_negative_num);
		System.out.printf("The average of the 5 numbers: " + "%.2f" + "%n",
				((sum_of_positive_num + sum_of_negative_num) / 5.0));

	};

}
