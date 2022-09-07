package javapract;

public class EvenOddGiven {
	public static void main(String[] args) {
		int num=1234567;
		while (num>0) {
			int rem=num%10;
			if (rem%2==0) {
				System.out.println(" "+rem);
			}
			if (rem%2!=0) {
				System.out.println(rem);
			}
			num=num/10;
			
		}
		
	}

}
