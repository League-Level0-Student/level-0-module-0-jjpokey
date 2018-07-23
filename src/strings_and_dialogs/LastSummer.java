package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {

	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you went swimming last summer,\n" +
		" " + a + ". Muhahaha!");
		
		
	}
}
