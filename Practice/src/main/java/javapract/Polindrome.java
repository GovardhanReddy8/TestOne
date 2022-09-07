package javapract;

public class Polindrome {
	public static void main(String[] args) {
		int num=121,rev=0;
		int org=num;
		while (num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if (rev==org) {
			System.out.println("given nummbers is polindrome");
		} else {
			System.out.println("not polindrome");

		}
	}

}
