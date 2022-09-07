package javaclass;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {
	public static void main(String[] args) {
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some string");
		s=sc.nextLine();
		String[] sd = s.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (String words : sd) {
			if (map.containsKey(words)) {
				map.put(words.toLowerCase(), map.get(words.toLowerCase())+1);
			}else {
				map.put(words.toLowerCase(), 1);
			}
		}
		Set<String> set = map.keySet();
		for (String word : set) {
			if (map.get(word)>1) {
				System.out.println(word+" :"+map.get(word)+" :"+map);
				
			}
		}
		
	}
	
}
