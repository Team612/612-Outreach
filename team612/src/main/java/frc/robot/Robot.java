package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Grabber;

public class Robot extends TimedRobot {

  // Objects of subsystems
  public static Grabber grabber = new Grabber();
  public static Drivetrain drivetrain = new Drivetrain();
  public static Compressor compressor = new Compressor(RobotMap.COMPRESSOR_PORT);

  @Override
  public void robotInit() {

    compressor.setClosedLoopControl(true);

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
