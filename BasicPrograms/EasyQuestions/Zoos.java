package com.HackerEarth.BAsicPrograms.EasyQuestions;

import java.util.Scanner;

public class Zoos {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int countz=0;
	int counto=0;
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)=='z')countz++;	
	if(s.charAt(i)=='o')counto++;	
	}
	if((countz*2)==counto)
		System.out.println("Yes");
	else System.out.println("No");
}

}
