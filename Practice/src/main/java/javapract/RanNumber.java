package javapract;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RanNumber {
	public static void main(String[] args) {
		int num=100;
		Random r = new Random();
		int i = r.nextInt(num);
		System.out.println(i);
		
		String re = RandomStringUtils.randomNumeric(3);
		System.out.println(re);
	}

}
