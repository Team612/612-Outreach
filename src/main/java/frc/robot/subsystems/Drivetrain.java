/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  public WPI_TalonSRX talon_wheel_fr = new WPI_TalonSRX(RobotMap.talon_wheel_fr_port);
  public WPI_TalonSRX talon_wheel_br = new WPI_TalonSRX(RobotMap.talon_wheel_br_port);
  public WPI_TalonSRX talon_wheel_fl = new WPI_TalonSRX(RobotMap.talon_wheel_fl_port);
  public WPI_TalonSRX talon_wheel_bl = new WPI_TalonSRX(RobotMap.talon_wheel_bl_port);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DefaultDrive());
  }
}
