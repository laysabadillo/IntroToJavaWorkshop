package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Sausage = new Robot ();
	Sausage.setSpeed(100);
	Sausage.penDown();
	Sausage.setPenWidth(20);
	Sausage.setAngle(500);
	for(int i + 0; i < 4; i++) {
	Sausage.move(250);	
	Sausage.turn(130);
	}
	}
}
