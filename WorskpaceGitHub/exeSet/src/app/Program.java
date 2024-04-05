package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int cA = scanner.nextInt();
		Set <Integer> setA = new HashSet<>();
		
		for (int i = 0; i<cA;i++ ) {
			int a = scanner.nextInt();
			setA.add(a);
		}
		
		System.out.print("How many students for course B? ");
		int cB = scanner.nextInt();
		Set <Integer> setB = new HashSet<>();
		
		for (int i = 0; i<cB;i++ ) {
			int b = scanner.nextInt();
			setB.add(b);
		}
		
		System.out.print("How many students for course C? ");
		int cC = scanner.nextInt();
		Set <Integer> setC = new HashSet<>();
		
		for (int i = 0; i<cC;i++ ) {
			int c = scanner.nextInt();
			setB.add(c);
		}
		
		Set <Integer> set = new HashSet<>();
		set.addAll(setA);
		set.addAll(setB);
		set.addAll(setC);
		
		System.out.println("Total students: " + set.size());
		
		scanner.close();

	}

}
