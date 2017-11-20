package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {

	public static void main(String[] args) {

		int baseSize = 300; // the size of the black part of the star
		int flameSize = 200; // the length of the flaming arms

		// 1. Make a new robot, and set it's pen down.
		Robot finn = new Robot();
		// *14. Use the methods setX and setY to move the ninja star into the center of
		// the screen
finn.moveTo(500, 500);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
		finn.setSpeed(10);
		// 13. Make all the code below repeat 25 times
		int i = 0;
		while (i < 25) {
			// 2. Turn the robot 1/8 of a circle
			finn.turn(360 / 8);
			// 3. Move the robot 64 pixels
			finn.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the
			// robot counter-clockwise.)
			finn.move(-40);
			// 5. Move the robot the distance in the variable flameSize
			finn.move(flameSize);
			// 6. Turn the robot 170 degrees
			finn.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			finn.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			finn.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			finn.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the
			// ninja star.

			// 11. Color your ninja star like Figure 2.
			finn.penDown();
			finn.setPenColor(Color.CYAN);
			
		}
	}

}
