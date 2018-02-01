/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5933.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;

	public static WPI_TalonSRX driveTrainMasterLeftMotor;
	public static WPI_TalonSRX driveTrainMasterRightMotor;
	public static SpeedControllerGroup driveTrainRobotDriveLeft;
	public static SpeedControllerGroup driveTrainRobotDriveRight;
	public static DifferentialDrive driveTrainRobotDrive;
	public static WPI_TalonSRX driveTrainFollowerLeftFrontMotor;
	public static WPI_TalonSRX driveTrainFollowerRightFrontMotor;
	public static WPI_TalonSRX driveTrainFollowerLeftRearMotor;
	public static WPI_TalonSRX driveTrainFollowerRightRearMotor;
	public static DoubleSolenoid armSubsystemSolenoid;

	public static void init() {
		//armSubsystemSolenoid = new DoubleSolenoid(0, 0, 0);
		
		
		driveTrainMasterLeftMotor = new WPI_TalonSRX(10);
		driveTrainMasterRightMotor = new WPI_TalonSRX(11);

		
//		driveTrainRobotDriveLeft = new SpeedControllerGroup(driveTrainMasterLeftMotor, driveTrainFollowerLeftRearMotor, driveTrainFollowerLeftFrontMotor);		
//		driveTrainRobotDriveRight = new SpeedControllerGroup(driveTrainMasterRightMotor, driveTrainFollowerRightRearMotor, driveTrainFollowerRightFrontMotor);
		
		
		driveTrainRobotDrive = new DifferentialDrive(driveTrainMasterLeftMotor, driveTrainMasterRightMotor);

		driveTrainRobotDrive.setSafetyEnabled(true);
		driveTrainRobotDrive.setExpiration(0.1);
		//driveTrainRobotDrive.setSensitivity(0.5);
		driveTrainRobotDrive.setMaxOutput(1.0);

		driveTrainFollowerLeftFrontMotor = new WPI_TalonSRX(12);


		driveTrainFollowerRightFrontMotor = new WPI_TalonSRX(13);


		driveTrainFollowerLeftRearMotor = new WPI_TalonSRX(14);


		driveTrainFollowerRightRearMotor = new WPI_TalonSRX(15);
	}
}
