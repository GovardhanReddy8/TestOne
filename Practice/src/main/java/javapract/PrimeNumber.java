package javapract;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int num,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any buner:");
		num=sc.nextInt();
		for ( i = 2; i < num; i++) {
			if (num%i==0) {
				System.out.println("not prime");
				break;
			}
			
		}
		if (num==i) {
			System.out.println(num+" is prime");
		}
	}

}
