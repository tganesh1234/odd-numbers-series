package gani.assignments;

import java.util.Scanner;

public class Oddnumberprinting {

	public static void main(String[] args) {
		// print odd numbers from 1 to n.
		int n,m=1;
		System.out.print("enter the length of series :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.print(m+" ");
			m+=2;
		}

	}

}
