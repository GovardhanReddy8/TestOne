package javapract;

import java.util.HashMap;

public class NonRepHashMap {
	public static void main(String[] args) {
		String s="kjhgfdjhfdsrs";
		char[] cs = s.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < cs.length; i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		for (int i = 0; i < cs.length; i++) {
			char c = s.charAt(i);
			if (map.get(c)==1) {
				System.out.println(c);
			}
		}
		
	}

}
