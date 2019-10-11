/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultArm extends Command {

  private double SPEED = 0.5;

  public DefaultArm() {
    requires(Robot.arm);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.arm.grabber_arm.set(OI.gunner.getY(Hand.kLeft) * SPEED);
  }


  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
  }


  @Override
  protected void interrupted() {
  }
  
}
