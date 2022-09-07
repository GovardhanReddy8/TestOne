package javaclass;

public class Zeros {
	public static void main(String[] args) {
		int a=10500;
		int count=0;
		for (int i = 0; i < a; i++) {
			if (a<=0) {
				count++;
				
			}
			a=a/10;
			System.out.println(count);
		}
		
	}

}
