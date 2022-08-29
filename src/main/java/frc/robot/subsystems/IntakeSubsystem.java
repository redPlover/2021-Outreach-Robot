package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase{
    
    private final CANSparkMax intakeMotor = new CANSparkMax(8, CANSparkMax.MotorType.kBrushless);

    public IntakeSubsystem() {
    }
    
    public void intakeMove() {
        intakeMotor.set(Constants.intakeSpeed);
    }
    
    public void intakeReverse() {
        intakeMotor.set(-Constants.intakeSpeed);
    }
    
    public void intakeStop() {
        intakeMotor.set(0);
    }
}
