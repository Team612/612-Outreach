package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultGrabber;

public class Grabber extends Subsystem {

  public DoubleSolenoid grabber_sol = new DoubleSolenoid(RobotMap.PCM_solenoid_G, RobotMap.solenoid_G_one, RobotMap.solenoid_G_two);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DefaultGrabber());
  }

}
