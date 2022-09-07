package javapract;

public class NonRep {
	public static void main(String[] args) {
		String s="kjhgfdjhfd";
		char[] all = s.toCharArray();
		for (int i = 0; i < all.length; i++) {
			char c = s.charAt(i);
			int count=0;
			for (int j = 0; j < all.length; j++) {
				if (c==all[j]) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(s.charAt(i));
				
			}
		}
	}

}
