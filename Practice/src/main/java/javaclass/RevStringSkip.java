package javaclass;

public class RevStringSkip {
	public static void main(String[] args) {
		String name="Srilath";
		String rev="";
		for(int i=name.length()-1;i>=0;i-=2) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
