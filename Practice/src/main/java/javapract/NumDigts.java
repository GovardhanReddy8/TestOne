package javapract;

import java.util.Scanner;

public class NumDigts {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		int count=0;
		while (num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
