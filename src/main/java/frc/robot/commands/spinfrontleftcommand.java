package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.motorsubsystem;


public class spinfrontleftcommand extends Command{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final motorsubsystem m_subsystem;
    private final Supplier <Double> speedFunction; 
    
    public spinfrontleftcommand(motorsubsystem subsystem, Supplier<Double> speedFunction){
        m_subsystem = subsystem;
        this.speedFunction = speedFunction;

       addRequirements(subsystem);
    }
    @Override
    public void initialize() {}
  
    
    @Override
    public void execute() {
      double currentSpeed = speedFunction.get()*.25;
      if (currentSpeed > -.1 && currentSpeed < .1) {
        currentSpeed = 0;
      }
      m_subsystem.spinbackleftMotor(currentSpeed);
    }
  
    
    @Override
    public void end(boolean interrupted) {
    m_subsystem.stopbackleftMotor();
    }
  
   
    @Override
    public boolean isFinished() {
      return false;
    }
}
