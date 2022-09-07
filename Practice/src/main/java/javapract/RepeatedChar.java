package javapract;

public class RepeatedChar {
	public static void main(String[] args) {
		String s="java is mavaaa";
		int l1 = s.length();
		int l2 = s.replaceAll("a", "").length();
		System.out.println(l1-l2);
	}

}
