package strings_and_dialogs;

import javax.swing.JOptionPane;

public class KnockKnock {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Knock Knock!");
		if (a.equals("who is there")) {
		String b = JOptionPane.showInputDialog("BOO!");
		if (b.equals("boo who")) {
			JOptionPane.showMessageDialog(null, "Why are you crying?");
		}
		
		
		}
		
		
	}
}
