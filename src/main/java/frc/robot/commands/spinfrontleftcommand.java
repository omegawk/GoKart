package frc.robot.commands;

import frc.robot.subsystems.motorsubsystem;
import edu.wpi.first.wpilibj2.command.Command;


public class spinfrontleftcommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final motorsubsystem m_subsystem;
  private double speed;

 
  public spinfrontleftcommand(motorsubsystem subsystem, double speed) {
    m_subsystem = subsystem;
    this.speed = speed;
   
    addRequirements(subsystem);
  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    m_subsystem.spinfrontleftMotor(speed);
  }

  
  @Override
  public void end(boolean interrupted) {
    m_subsystem.stopfrontleftMotor();
  }

 
  @Override
  public boolean isFinished() {
    return false;
  }
}