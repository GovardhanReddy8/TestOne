package javapract;

public class EvenOddAray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		for (int i : a) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		
	}

}
