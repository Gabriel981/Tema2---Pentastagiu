package Homework1;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Introdu string-ul: ");
		String cuvant = input.nextLine();
		java.util.Stack<Character>stac=new java.util.Stack<Character>();
		
		for (int i = 0; i < cuvant.length(); i++) {
			stac.push(cuvant.charAt(i));
			
		}
		
		System.out.println(stac);
		
		while(!stac.empty()) {
			System.out.println(stac.pop());
		}
		System.out.println(stac);

	}

}
