package Homework2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sorting {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	que.add(2);
	que.add(3);
	que.add(5);
	System.out.println(que);
	System.out.println(que.poll());
	
	int n=que.size();
	
	if(checkIsSorted(n))
		System.out.println("Yes"+que);
	else
		System.out.println("No");
	
	
	}
	
	static Queue<Integer> que= new LinkedList<Integer>();
	static boolean checkIsSorted(int n) {
		Stack<Integer> stac = new Stack<Integer>();
		int expected = 1;
		int fnt;
		
		while(que.size()!=0) {
			fnt=que.peek();
			que.poll();
			
			if(fnt==expected)
				expected++;
			else {
				if(stac.size()==0)
					stac.push(fnt);
				else if(stac.size()!=0 && stac.peek()<fnt) {
					return false;
				}
				else
					stac.push(fnt);
			}
			
			while(stac.size()!=0 && stac.peek()==expected) {
				stac.pop();
				expected++;
			}
		}
		
		if(expected-1 ==n && stac.size()==0)
			return true;
		return false;
	}
	
	
}
