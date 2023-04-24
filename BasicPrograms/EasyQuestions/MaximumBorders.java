package com.HackerEarth.BAsicPrograms.EasyQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumBorders {
	public static void main(String[] args) {

//	System.out.println("Enter the no of cases");
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		// int arr[]=new int[cases];
		int count = 0;
		for (int i = 0; i < cases; i++) {
			int rows = sc.nextInt();
			int columns = sc.nextInt();
			int a[] = new int[rows];

			String s[] = new String[rows];
			for (int j = 0; j < rows; j++) {

				count = 0;
				s[j] = sc.next();
				//char c[] = s[j].toCharArray();
				for (int k = 0; k < columns; k++) {
					if (s[j].charAt(k) == '#') {
						count++;
					}
				}
				a[j] = count;
			}
			Arrays.sort(a);
			int p = a.length - 1;
			// arr[i]=p;
			System.out.println(a[p]);
			// System.out.println("End of case");
		}
//	for(int m=0;m<cases;m++)
//	{
//		System.out.println(arr[m]);
//	}
	}

}
