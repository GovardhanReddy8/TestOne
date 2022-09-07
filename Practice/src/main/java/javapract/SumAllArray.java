package javapract;

public class SumAllArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		int num=12345;
		int sum1=0;
		while (num>0) {
			sum1=sum1+num%10;
			num=num/10;
		}
		System.out.println(sum1);
	}

}
