package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.motorsubsystem;


public class spinbackleftcommand extends Command{
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final motorsubsystem m_subsystem;
  private final Supplier <Double> speedFunction;    

}
