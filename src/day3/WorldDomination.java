package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	private static final Object Yes = null;
	private static final Object No = null;

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog(null, "Do You Know How To Write Code?");
		
		// 2. If they say "yes", tell them they will rule the world.
		if(input.equals(Yes)) {
			JOptionPane.showMessageDialog(null, "You Will Rule The World!");
		
		// 3. Otherwise, wish them good luck washing dishes.
		}else{ JOptionPane.showMessageDialog(null, "The Good Luck Washing Dishes");
		}
		}

			
}

