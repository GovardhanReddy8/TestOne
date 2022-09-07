package javapract;

public class RevStringNum {
	public static void main(String[] args) {
		int num=1234,rev=0;
		while (num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		String s="mango";
		int l = s.length();
		String r="";
		for(int i=l-1;i>=0;i--) {
			char c = s.charAt(i);
			r=r+c;
			
		}
		System.out.println(r);
	}

}
