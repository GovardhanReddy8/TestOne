package javapract;

public class MaxAndMin {
	public static void main(String[] args) {
		int[] num= {21,32,12,56,42,28};
		int value=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>value) {
				value=num[i];
				
				
			}
			
			
		}
		System.out.println("max value is:"+value);
		for (int i : num) {
			if (i<value) {
				value=i;
			}
		}
		System.out.println("min value is:"+value);
		
	}

}
