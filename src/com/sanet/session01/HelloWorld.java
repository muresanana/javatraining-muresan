package com.sanet.session01;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.print("Your name:");
		
		Scanner scanner=new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello,"+name);
		
		scanner.close();
	}
	
}


