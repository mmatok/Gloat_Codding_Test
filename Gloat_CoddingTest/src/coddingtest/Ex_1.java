package coddingtest;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the nubmer of elements you would like to insert");
		int count = s.nextInt();
		int [] array = new int [count];

		System.out.println("Please enter elements");

		for (int i = 0; i < count; i++) {
			array[i]= s.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int max = 0;
		int secMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]> max) {
				secMax= max;
				max = array[i];
			}
			else if (array[i] > secMax) {
				secMax = array[i];
			}
		}
		System.out.println("The maximum number is " +max);
		System.out.println("The second maximum number is " +secMax);
	}
}
