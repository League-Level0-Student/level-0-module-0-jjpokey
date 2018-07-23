package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		
		Robot aaa = new Robot();
		aaa.setSpeed(200);
		aaa.penDown();
		aaa.turn(90);
		aaa.move(100);
		aaa.turn(-180);
		aaa.move(50);
		aaa.turn(-90);
		aaa.move(80);
		aaa.turn(90);
		aaa.move(40);
		aaa.turn(90);
		aaa.move(30);
		aaa.hide();
	}
}
