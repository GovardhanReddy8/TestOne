package javapract;

public class RemoveZunk {
	public static void main(String[] args) {
		String s="@#4Jf&867";
		String all = s.replaceAll("[^A-Z0-9]", "");
		System.out.println(all);
	}

}
