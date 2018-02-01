package org.usfirst.frc.team5933.robot.subsystems;

import org.usfirst.frc.team5933.robot.RobotMap;
import org.usfirst.frc.team5933.robot.commands.StopArm;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private final DoubleSolenoid armSubsystemSolenoid = RobotMap.armSubsystemSolenoid;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new StopArm());
    }
    
    public void turnArmOff() {
    	armSubsystemSolenoid.set(DoubleSolenoid.Value.kOff);
    }
    
    public void forwardArm() {
    	
    }
}

