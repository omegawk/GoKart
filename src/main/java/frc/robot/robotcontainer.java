package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.spinbackleftcommand;
import frc.robot.commands.spinbackrightcommand;
import frc.robot.commands.spinfrontleftcommand;
// import frc.robot.commands.spinbackrightcommand;
// import frc.robot.commands.spinfrontrightcommand;
// import frc.robot.commands.spinfrontleftcommand;
import frc.robot.subsystems.motorsubsystem;

public class robotcontainer {
    private motorsubsystem m_motorsubsystem;
    private Joystick m_controller;
    private JoystickButton m_forwbutton;
    private JoystickButton m_revbutton;
    private JoystickButton m_forwturnbutton;
    private JoystickButton m_revturnbutton;


    public robotcontainer() {
        m_motorsubsystem = new motorsubsystem();
        m_controller = new Joystick(constants.OperatorConstants.DRIVER_CONTROLLER_PORT);
        m_forwbutton = new JoystickButton(m_controller, constants.OperatorConstants.FWD_BUTTON_PORT);
        m_revbutton = new JoystickButton(m_controller, constants.OperatorConstants.REV_BUTTON_PORT);
        m_forwturnbutton = new JoystickButton(m_controller, constants.OperatorConstants.TURNFWD_BUTTON_PORT);
        m_revturnbutton = new JoystickButton(m_controller, constants.OperatorConstants.TURNREV_BUTTON_PORT);

        m_motorsubsystem.setDefaultCommand(new spinbackrightcommand(m_motorsubsystem, ()-> m_controller.getRawAxis(constants.OperatorConstants.TURN_AXIS)));
        m_motorsubsystem.setDefaultCommand(new spinbackleftcommand(m_motorsubsystem, ()-> m_controller.getRawAxis(constants.OperatorConstants.DRIVE_AXIS)));
        // ()-> is needed do not delete
        
        configureBindings();
        m_forwbutton.toggleOnTrue(new spinfrontleftcommand(m_motorsubsystem, constants.Speeds.FWD_DRIVE_SPEED));
        m_revbutton.toggleOnTrue(new spinfrontleftcommand(m_motorsubsystem, constants.Speeds.REV_DRIVE_SPEED));

    }
        
  private void configureBindings() {

  }
}
