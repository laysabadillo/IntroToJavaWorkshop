package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "The Boxing Glove");
		
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog(null, "Enter An Adjective");
		
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog(null, "Enter A Type Of Liquid");
		
		// Get the user to enter a body part
		String bodyPart = JOptionPane.showInputDialog(null, "Enter A Body Part");
		
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog(null, "Enter A Verb");
		
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog(null, "Enter A Place");
		
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "Their once was a " + adjective + " Boxing Glove. It loves punching " + liquid + ". It was mostly put on the " + bodyPart + ". It loved " + verb + ". Its favorite place in the world was " + place + ". ");
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		
		JOptionPane.showMessageDialog(null, "The Boxing Glove");
	}
}

