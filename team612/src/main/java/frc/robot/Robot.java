package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Grabber;

public class Robot extends TimedRobot {

  // Objects of subsystems
  public static Arm arm = new Arm();
  public static Grabber servo = new Grabber();
  public static Drivetrain drivetrain = new Drivetrain();

  @Override
  public void robotInit() {
    System.out.println("This code was written by Prahalad");
  }


  @Override
  public void robotPeriodic() {
  }


  @Override
  public void disabledInit() {
  }


  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }


  @Override
  public void autonomousInit() {
  }


  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }


  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }


  @Override
  public void testPeriodic() {
  }

}
