package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants;


public class motorsubsystem extends SubsystemBase {
    private CANSparkMax frontleft;
    private TalonFX backleft;
    private CANSparkMax frontright;
    private TalonFX backright;
    private RelativeEncoder frontleftEncoder;
    private RelativeEncoder frontrightEncoder;
    

  public motorsubsystem() {
    frontleft = new CANSparkMax(constants.motorconstants.frontleftid, MotorType.kBrushless);
    frontright = new CANSparkMax(constants.motorconstants.frontrightid, MotorType.kBrushless);
    backleft = new TalonFX(constants.motorconstants.backleftidfalcon);
    backright = new TalonFX(constants.motorconstants.backlrightidfalcon);
    frontleftEncoder = frontleft.getEncoder();
    frontrightEncoder = frontright.getEncoder();
  }

  public void spinfrontleftMotor(double speed) {
    frontleft.set(speed);
  }

  public void spinfrontrightMotor(double speed) {
    frontright.set(speed);
  }

  public void spinbackleftMotor(double speed) {
    backleft.set(speed);
  }

  public void spinbackrightMotor(double speed) {
    backright.set(speed);
  }

  public void stopfrontleftMotor() {
    frontleft.set(constants.Speeds.STOP_SPEED);
  }

  public void stopbackleftMotor(){
    backleft.set(constants.Speeds.STOP_SPEED);
  }

  public void stopfrontrightMotor() {
    frontright.set(constants.Speeds.STOP_SPEED);
  }

  public void stopbackrightMotor(){
    backright.set(constants.Speeds.STOP_SPEED);
  }
  @Override
  public void periodic() {
    SmartDashboard.putNumber("front left Motor Position: ", frontleftEncoder.getPosition());
    SmartDashboard.putNumber("front right Motor Position: ", frontrightEncoder.getPosition());
  }
}

