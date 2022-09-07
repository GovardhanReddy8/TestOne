package javaclass;

import javax.swing.JOptionPane;

public class GUIlev {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("enter your name");
		JOptionPane.showMessageDialog(null, "hello to you "+name);
		int sw = JOptionPane.showConfirmDialog(null, "msg", name, 0);
		
	}

}
