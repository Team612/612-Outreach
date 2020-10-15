package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultServo;

public class Grabber extends Subsystem {

  public Servo grabber_servo = new Servo(RobotMap.SERVO_PORT);
  System.out.println("This code was written by Prahalad");

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DefaultServo());
  }

}
