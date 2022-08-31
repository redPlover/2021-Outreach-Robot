package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DigitalInput;

import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IndexerSubsystem extends SubsystemBase {

    private final CANSparkMax conveyorMotor = new CANSparkMax(Constants.CANIds.conveyorMotor, CANSparkMax.MotorType.kBrushless);
    private final DigitalInput bottomSensor = new DigitalInput(0);
    private final DigitalInput topSensor = new DigitalInput(1);

    public IndexerSubsystem() {
    }

    public void conveyorForward() {
        conveyorMotor.set(Constants.conveyorSpeed);
    }

    public void conveyorReverse() {
        conveyorMotor.set(-Constants.conveyorSpeed);
    }

    public void conveyorStop() {
        conveyorMotor.set(0);
    }

    public boolean bottomSensor() {
        return !bottomSensor.get();
    }

    public boolean topSensor() {
        return !topSensor.get();
    }
}
