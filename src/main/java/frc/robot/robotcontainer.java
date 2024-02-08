package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.spinbackleftcommand;
import frc.robot.subsystems.motorsubsystem;

public class robotcontainer {
    private motorsubsystem m_motorsubsystem;
    private Joystick m_controller;
    private JoystickButton m_forwbutton;
    private JoystickButton m_revbutton;


    public robotcontainer() {
        m_motorsubsystem = new motorsubsystem();
        m_controller = new Joystick(constants.OperatorConstants.DRIVER_CONTROLLER_PORT);
        m_forwbutton = new JoystickButton(m_controller, constants.OperatorConstants.FWD_BUTTON_PORT);
        m_revbutton = new JoystickButton(m_controller, constants.OperatorConstants.REV_BUTTON_PORT);

        m_motorsubsystem.setDefaultCommand(new spinbackleftcommand(m_motorsubsystem, ()-> m_controller.getRawAxis(constants.OperatorConstants.DRIVE_AXIS)));
        
        configureBindings();
    
  }
  private void configureBindings() {

  }
}
