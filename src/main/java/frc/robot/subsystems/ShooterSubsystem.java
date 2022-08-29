package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DigitalInput;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    
    private final CANSparkMax kickerMotor = new CANSparkMax(5, CANSparkMax.MotorType.kBrushless);
    private final CANSparkMax flywheelMotor = new CANSparkMax(6, CANSparkMax.MotorType.kBrushless);

    public ShooterSubsystem() {
    }

    public void kickerMove() {
        kickerMotor.set(Constants.kickerSpeed);
    }

    public void flywheelShoot() {
        flywheelMotor.set(Constants.flywheelSpeed);
    }

}
