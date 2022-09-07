package abcd;

import java.io.IOException;

import utils.UtilKit;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {
		Object[][] data = UtilKit.data("Sheet", "Login");
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(data[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
