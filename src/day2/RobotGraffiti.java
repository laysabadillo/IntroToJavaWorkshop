package day2;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		// 1.  Create a new Robot
		Robot Sausage = new Robot ();
		// 2. Make the Robot draw the first letter of your name
		Sausage.penDown();
		Sausage.setSpeed(100);
		Sausage.setPenWidth(20);
		Sausage.hide();
		
		Sausage.move(-100);
		Sausage.turn(90);
		Sausage.move(50);
		
		Sausage.penUp();
		Sausage.move(24);
		
		Sausage.penDown();
		Sausage.move(1);		
		Sausage.penUp();
		Sausage.move(24);
		
		Sausage.penDown();
		Sausage.move(50);
	
		Sausage.turn(-90);
		Sausage.move(50);
	
		Sausage.turn(-90);
		Sausage.move(50);
	
		Sausage.turn(-90);
		Sausage.move(50);
		
		Sausage.turn(180);
		Sausage.move(100);
	
		Sausage.turn(90);
		Sausage.move(43);
		
		Sausage.turn(90);
		Sausage.move(50);
		
	}

}
