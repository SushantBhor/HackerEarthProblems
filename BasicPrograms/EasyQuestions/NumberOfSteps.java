package com.HackerEarth.BAsicPrograms.EasyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfSteps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = sc.nextInt();
		if (a <= 5000) {
			int arr1[] = new int[a];
			int arr2[] = new int[a];
			for (int i = 0; i < a; i++) {
				arr1[i] = sc.nextInt();
			}

			for (int i = 0; i < a; i++) {
				arr2[i] = sc.nextInt();
			}
			// System.out.println("Temp array");
			int temp[] = new int[a];
			for (int i = 0; i < a; i++) {
				temp[i] = arr1[i];

			}
			Arrays.sort(temp);

//			for (int i = 0; i < a; i++) {
//				System.out.print(temp[i]);
//
//			}

			int min = temp[1];
			for (int a=0;a>)
			
			
		}
	}
}