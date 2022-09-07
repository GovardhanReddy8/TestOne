package javapract;

public class MissingNum {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,6};
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		int sum1=0;
		for (int i : num) {
			sum1=sum1+i+1;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
		
	}

}
