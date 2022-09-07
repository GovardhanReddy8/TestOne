package javapract;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		File f = new File("Properties\\config.property");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			System.out.println(sc.next());
			
		}
		
		FileReader fl = new FileReader(f);
		BufferedReader fb = new BufferedReader(fl);
		String st;
		while ((st=fb.readLine())!=null) {
			System.out.println(st);
			
		}
	}

}
