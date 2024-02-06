package frc.robot;

import frc.robot.commands.SpinAxisMotorCommand;
import frc.robot.commands.SpinButtonMotorCommand;
import frc.robot.subsystems.MotorSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class robotcontainer {
    private motorsubsystem m_motorsubsystem;
    private joystick m_controller;
    private joystickbutton m_forwbutton;
    private joystickbutton m_revbutton;

    public robotcontainer() {
        m_motorsubsystem = new MotorSubsystem();
        m_controller = new Joystick(constants.OperatorConstants.DRIVER_CONTROLLER_PORT);
        m_forwbutton = new JoystickButton(m_controller, constants.OperatorConstants.FWD_BUTTON_PORT);
        m_revbutton = new JoystickButton(m_controller, constants.OperatorConstants.REV_BUTTON_PORT);

        m_motorSubsystem.setDefaultCommand(
            new SpinAxisMotorCommand(m_motorsubsystem, ()-> m_controller.getRawAxis(Constants.OperatorConstants.DRIVE_AXIS)));

        configureBindings();
        m_forwbutton.toggleOnTrue(new SpinButtonMotorCommand(m_motorSubsystem, Constants.Speeds.FWD_DRIVE_SPEED));
        m_revbutton.toggleOnTrue(new SpinButtonMotorCommand(m_motorSubsystem, Constants.Speeds.REV_DRIVE_SPEED));

  }
  private void configureBindings() {}
}
