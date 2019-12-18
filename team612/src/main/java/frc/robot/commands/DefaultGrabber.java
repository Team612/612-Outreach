/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultGrabber extends Command {

  private boolean isOpened = true;


  public DefaultGrabber() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.grabber);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    
    if (OI.driver_button_RB.get()) {  // Open Grabber
      Robot.grabber.grabber_sol.set(Value.kReverse);
    } else {
      Robot.grabber.grabber_sol.set(Value.kOff);
    }

    if (OI.driver_button_LB.get()) {  // Open Grabber
      Robot.grabber.grabber_sol.set(Value.kForward);
    } else {
      Robot.grabber.grabber_sol.set(Value.kOff);
    }


  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
