package javapract;

import java.util.Arrays;

public class EqualsArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,4};
		boolean c = Arrays.equals(a, b);
		if (c==true) {
			System.out.println("arrayes are equal");
			
		}else {
			System.out.println("not equal");
		}
	}

}
