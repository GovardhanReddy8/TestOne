package javapract;

public class DuplicatesInArray {
	public static void main(String[] args) {
		String[] s= {"me","my","me","own"};
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println(s[i]);
					
				}
				
			}
		}
	}

}
