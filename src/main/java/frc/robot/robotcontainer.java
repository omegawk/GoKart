package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.spinbackleftcommand;
import frc.robot.commands.spinbackrightcommand;
import frc.robot.commands.spinfrontleftcommand;
import frc.robot.commands.spinfrontrightcommand;
import frc.robot.subsystems.motorsubsystem;

public class robotcontainer {
    private motorsubsystem m_motorsubsystem;
    private Joystick m_controller;



    public robotcontainer() {
        m_motorsubsystem = new motorsubsystem();
        m_controller = new Joystick(constants.OperatorConstants.DRIVER_CONTROLLER_PORT);
  

        m_motorsubsystem.setDefaultCommand(new spinbackrightcommand(m_motorsubsystem, ()-> m_controller.getRawAxis(constants.OperatorConstants.backright_axis)));
        m_motorsubsystem.setDefaultCommand(new spinbackleftcommand(m_motorsubsystem, ()-> m_controller.getRawAxis(constants.OperatorConstants.backleft_axis)));
        m_motorsubsystem.setDefaultCommand(new spinfrontleftcommand(m_motorsubsystem, ()-> m_controller.getRawAxis(constants.OperatorConstants.frontleft_axis)));
        m_motorsubsystem.setDefaultCommand(new spinfrontrightcommand(m_motorsubsystem, ()-> m_controller.getRawAxis(constants.OperatorConstants.frontright_axis)));
        // ()-> is needed do not delete
        
        configureBindings();
      
    }
        
  private void configureBindings() {

  }
}
