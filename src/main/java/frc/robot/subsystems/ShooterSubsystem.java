package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;

import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShooterSubsystem extends SubsystemBase {
    
    private final WPI_VictorSPX flywheelMotor = new WPI_VictorSPX(6);
    private final CANSparkMax kickerMotor = new CANSparkMax(7, CANSparkMax.MotorType.kBrushless);

    private double kickerModifier;

    public ShooterSubsystem() {
        SmartDashboard.putNumber("Kicker Modifier", 0.5);
    }

    @Override
    public void periodic() {
        kickerModifier = SmartDashboard.getNumber("Kicker Modifier", 0.5);
    }

    public void kickerMove() {
        kickerMotor.set(Constants.kickerSpeed);
    }

    public void flywheelShoot() {
        flywheelMotor.set(Constants.flywheelSpeed * kickerModifier);
    }

}
