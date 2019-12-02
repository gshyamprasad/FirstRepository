package test;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
	String str;
	int len;
	
	Scanner scan = new Scanner("System.in");
	System.out.println("Enter your name :  ");
	str = scan.nextLine();
	len=str.length();
	
	System.out.println("Length of Enetered String is " + len);
	
		}

}
