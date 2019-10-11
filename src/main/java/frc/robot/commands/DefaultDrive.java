/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Drivetrain;

public class DefaultDrive extends Command {
  public DefaultDrive() {

     


    requires(Robot.drivetrain);
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    System.out.println("Sped");
    Robot.drivetrain.talon_wheel_fr.set(OI.driver.getY(Hand.kRight)*-.5);
     Robot.drivetrain.talon_wheel_br.set(OI.driver.getY(Hand.kRight)*-.5);
     Robot.drivetrain.talon_wheel_fl.set(OI.driver.getY(Hand.kLeft)*.5);
     Robot.drivetrain.talon_wheel_bl.set(OI.driver.getY(Hand.kLeft)*.5);
      
    System.out.println("Right: " + OI.driver.getY(Hand.kRight));
    System.out.println("Left : " + OI.driver.getY(Hand.kLeft));

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
