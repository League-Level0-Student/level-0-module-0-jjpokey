package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hi " + a);
		
		
	}
}
