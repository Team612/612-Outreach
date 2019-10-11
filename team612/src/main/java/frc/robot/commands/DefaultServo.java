/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultServo extends Command {

  public DefaultServo() {
    requires(Robot.servo);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    if(OI.gunner_button_A.get()){
      Robot.servo.grabber_servo.setAngle(90);
    }
    else {
      Robot.servo.grabber_servo.setAngle(0);
    }   
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
