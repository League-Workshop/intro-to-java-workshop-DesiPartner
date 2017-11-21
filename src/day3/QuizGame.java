package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is the best gaming platform? PS4, PC, or XBOX?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("pc"))
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		score = score + 1;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog("What is love?");
		if(answer2.equalsIgnoreCase("baby don't hurt me"))
		score = score + 1;
		String answer3 = JOptionPane.showInputDialog("What is the best pizza place in San Diego to order from?");
				if(answer3.equalsIgnoreCase("Domino's"))
				score = score + 1;
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, score + "/3");
	}
}
