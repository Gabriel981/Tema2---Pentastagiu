package Homework2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Sorting11 {
	static Queue<Integer> queue = new LinkedList<Integer>();
	static void orderQue(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		if(queue.size()==0)
			System.out.println("Queue gol");
		else {
			for (int i = 0; i < queue.size(); i++) {
				
			}
		}
			
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0;
		do{
			System.out.println("Enter: ");
			double value = scanner.nextDouble();
			if(value==0)
				break;
			queue.add((int) value);
			i++;
		}while(scanner.hasNextDouble() && i<=10);
		
		System.out.println(queue);
	
		
	}

}
