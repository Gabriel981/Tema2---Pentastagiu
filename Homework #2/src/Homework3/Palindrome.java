package Homework3;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue string = new LinkedList();
		System.out.println("Input: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		
		for (int i = inputString.length()-1;i>=0 ;i--) {
			string.add(inputString.charAt(i));
		}
		
		String reverse = "";
		
		while(!string.isEmpty()) {
			reverse = reverse+string.remove();
		}
		
		if(inputString.equals(reverse)) {
			System.out.println("Input string is a palindrome "+reverse);
		}
		else
			System.out.println("The input string is not a palindrome");
	}
	
	
	

}
