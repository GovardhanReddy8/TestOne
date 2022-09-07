package javapract;

import java.util.Arrays;
import java.util.Collections;

public class SortingNum {
	public static void main(String[] args) {
		Integer[] a= {21,32,12,17};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
	}

}
