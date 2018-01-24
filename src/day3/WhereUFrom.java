package day3;
import javax.swing.JOptionPane;

class WhereUFrom {
public static void main(String[] args){
		String home = JOptionPane.showInputDialog(null, "Where Are You From?");

if(home.equals("San Diego")){
	JOptionPane.showMessageDialog(null, "You Have Good Tastes In Living Locations!");
}
else if(home.equals("Oregon")){
	JOptionPane.showMessageDialog(null, "Go DUCKS!!!");
}

else{
	JOptionPane.showMessageDialog(null, "You Should Move Away From " + home);
}

}
}


