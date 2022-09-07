package javapract;

public class Fibonacci {
	public static void main(String[] args) {
		int num=8,first=0,second=1,next=0;
		for (int i = 0; i <= num; i++) {
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
			
		}
	}

}
