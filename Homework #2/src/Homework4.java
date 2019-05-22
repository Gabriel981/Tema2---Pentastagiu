import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Homework4 {

	public static int sum1(LinkedList<Integer> list) {
		int sum=0;
		for(int i:list) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] elemente = {3,6,4,2,5,7,8,0,0};
		LinkedList<Integer> lista = new LinkedList<Integer>();
		for (int i = 0; i < elemente.length; i++) {
			lista.add(elemente[i]);
		}
		System.out.println(lista);
		
	}
	
}
