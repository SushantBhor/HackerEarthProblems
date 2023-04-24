package com.HackerEarth.BAsicPrograms.EasyQuestions;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		
		System.out.println("Enter the no of nos to be accepted");
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=(a.length-1);i<=(a.length-1);i++)
		{

			if(a[i]%10==0)
			{
				System.out.println("Yes");
			}
			else System.out.println("No");
		}
		
	}

}
