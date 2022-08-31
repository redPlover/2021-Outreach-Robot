package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShooterSubsystem extends SubsystemBase {
    
    private final WPI_VictorSPX flywheelMotor = new WPI_VictorSPX(Constants.CANIds.shooterMotor);
    private final CANSparkMax kickerMotor = new CANSparkMax(Constants.CANIds.kickerMotor, CANSparkMax.MotorType.kBrushless);

    private double flywheelModifier;

    public ShooterSubsystem() {
        SmartDashboard.putNumber("Flywheel Modifier", 0.5);
    }

    @Override
    public void periodic() {
        flywheelModifier = SmartDashboard.getNumber("Flywheel Modifier", 0.5);
    }

    public void kickerMove() {
        kickerMotor.set(Constants.kickerSpeed);
    }

    public void kickerReverse() {
        kickerMotor.set(-Constants.kickerSpeed);
    }

    public void kickerStop() {
        kickerMotor.set(0);
    }

    public void flywheelShoot(double speed) {
        flywheelMotor.set(speed * flywheelModifier);
    }

    public void flywheelStop() {
        flywheelMotor.set(0);
    }

}
