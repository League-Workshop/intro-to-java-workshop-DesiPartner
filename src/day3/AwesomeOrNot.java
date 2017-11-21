package day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		int i = new Random().nextInt(4);
		// JOptionPane.showMessageDialog(null, i);

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"

		// 3. Print out this variable

		// 4. Get the user to enter something that they think is awesome
		JOptionPane.showInputDialog("What do you think is awesome?");
		// 5. If the random number is 0
		if (i == 0) {
			JOptionPane.showMessageDialog(null, "That's awesome!");
		}

		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1
		if (i == 1) {
			JOptionPane.showMessageDialog(null, "That's ok, I  guess.");
		}
		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
		if (i == 2) {
			JOptionPane.showMessageDialog(null, "That's boring");
		}
		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3
		if (i == 3) {
			JOptionPane.showMessageDialog(null, "Honestly? You like that? Loser.");
		}
		// -- write your own answer
	}
}
