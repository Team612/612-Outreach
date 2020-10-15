package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDrive;

public class Drivetrain extends Subsystem {

  public WPI_TalonSRX drive_talon_fr = new WPI_TalonSRX(RobotMap.TALON_FR_PORT);
  public WPI_TalonSRX drive_talon_br = new WPI_TalonSRX(RobotMap.TALON_BR_PORT);
  public WPI_TalonSRX drive_talon_fl = new WPI_TalonSRX(RobotMap.TALON_FL_PORT);
  public WPI_TalonSRX drive_talon_bl = new WPI_TalonSRX(RobotMap.TALON_BL_PORT);
  System.out.println("This code was written by Prahalad");

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DefaultDrive());
  }

}
