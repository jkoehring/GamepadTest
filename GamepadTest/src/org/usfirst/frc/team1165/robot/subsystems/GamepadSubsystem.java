
package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.ReportGamepad;
import org.usfirst.frc.team1165.util.Gamepad;
import org.usfirst.frc.team1165.util.Gamepad.Axis;
import org.usfirst.frc.team1165.util.Gamepad.Button;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GamepadSubsystem extends Subsystem
{
	private Gamepad gamepad = new Gamepad(2);

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new ReportGamepad());
	}
	
	public void report()
	{
		SmartDashboard.putNumber("Left X", gamepad.getX(Hand.kLeft));
		SmartDashboard.putNumber("Left Y", gamepad.getY(Hand.kLeft));
		SmartDashboard.putNumber("Left Z", gamepad.getZ(Hand.kLeft));
		SmartDashboard.putNumber("Left T", gamepad.getRawAxis(Axis.LEFT_TRIG.getValue()));
		SmartDashboard.putBoolean("Left Bump", gamepad.getBumper(Hand.kLeft));
		SmartDashboard.putBoolean("Left Top", gamepad.getTop(Hand.kLeft));
		SmartDashboard.putBoolean("Left Trig", gamepad.getTrigger(Hand.kLeft));
		
		SmartDashboard.putNumber("Right X", gamepad.getX(Hand.kRight));
		SmartDashboard.putNumber("Right Y", gamepad.getY(Hand.kRight));
		SmartDashboard.putNumber("Right Z", gamepad.getZ(Hand.kRight));
		SmartDashboard.putNumber("Right T", gamepad.getRawAxis(Axis.RIGHT_TRIG.getValue()));
		SmartDashboard.putBoolean("Right Bump", gamepad.getBumper(Hand.kRight));
		SmartDashboard.putBoolean("Right Top", gamepad.getTop(Hand.kRight));
		SmartDashboard.putBoolean("Right Trig", gamepad.getTrigger(Hand.kRight));
		
		SmartDashboard.putBoolean("A", gamepad.getRawButton(Button.A.getValue()));
		SmartDashboard.putBoolean("B", gamepad.getRawButton(Button.B.getValue()));
		SmartDashboard.putBoolean("X", gamepad.getRawButton(Button.X.getValue()));
		SmartDashboard.putBoolean("Y", gamepad.getRawButton(Button.Y.getValue()));
		SmartDashboard.putBoolean("Back", gamepad.getRawButton(Button.BACK.getValue()));
		SmartDashboard.putBoolean("Start", gamepad.getRawButton(Button.START.getValue()));

	}
}
