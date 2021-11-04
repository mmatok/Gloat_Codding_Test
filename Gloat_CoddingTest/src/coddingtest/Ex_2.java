package coddingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the nubmer of characters you would like to insert");
		int size = s.nextInt();
		String [] array = new String [size];

		Scanner cha = new Scanner(System.in);
		System.out.println("Please enter characters");

		for (int i = 0; i < size; i++) {
			array[i]= cha.next();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		ArrayList<String> found = new ArrayList<>();
		for (int i = 0; i < array.length; i++){
			if (!found.contains(array[i])) {
				int count = 0;
				for (int j = i; j < array.length; j++) {
					if (array[i].equals(array[j]) ){
						count++;
					}	
				}
				found.add(array[i]);
				System.out.println(array[i] + "=" + count);
			}

		}

	}
}
