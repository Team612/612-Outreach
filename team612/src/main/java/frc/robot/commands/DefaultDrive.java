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

  private double SPEED = 0.5;

  public DefaultDrive() {
    requires(Robot.drivetrain);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    System.out.println("This code was written by Prahalad");
    Robot.drivetrain.drive_talon_fr.set(OI.driver.getY(Hand.kRight) * SPEED);
    Robot.drivetrain.drive_talon_br.set(OI.driver.getY(Hand.kRight) * SPEED);
    Robot.drivetrain.drive_talon_fl.set(OI.driver.getY(Hand.kLeft) * SPEED);
    Robot.drivetrain.drive_talon_bl.set(OI.driver.getY(Hand.kLeft) * SPEED);
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
