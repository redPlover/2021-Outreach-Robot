package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogInput;

import frc.robot.Constants;

public class SwerveModule {
    /*
    private final CANSparkMax driveMotor;
    private final CANSparkMax rotatingMotor;

    private final RelativeEncoder driveEncoder;
    private final RelativeEncoder rotatingEncoder;

    private final PIDController drivePIDController;
    private final PIDController rotatingPIDController;

    private final AnalogInput absoluteEncoder;
    private final boolean absoluteEncoderReversed;
    private final double absoluteEncoderOffset;

    public SwerveModule(int driveId, int rotatingId, boolean driveReversed, boolean rotatingReversed, int absoluteEncoderId, double absoluteEncoderOffset, boolean absoluteEncoderReversed) {
        
        this.absoluteEncoderOffset = absoluteEncoderOffset;
        this.absoluteEncoderReversed = absoluteEncoderReversed;
        absoluteEncoder = new AnalogInput(absoluteEncoderId);

        driveMotor = new CANSparkMax(driveId, CANSparkMax.MotorType.kBrushless);
        rotatingMotor = new CANSparkMax(rotatingId, CANSparkMax.MotorType.kBrushless);

        driveMotor.setInverted(driveReversed);
        rotatingMotor.setInverted(rotatingReversed);

        driveEncoder = driveMotor.getEncoder();
        rotatingEncoder = rotatingMotor.getEncoder();

        driveEncoder.setPositionConversionFactor(Constants.Drivetrain.kDriveEncoderRot2Meter);
        driveEncoder.setVelocityConversionFactor(Constants.Drivetrain.kDriveEncoderRPM2MeterPerSec);
        rotatingEncoder.setPositionConversionFactor(Constants.Drivetrain.kTurningEncoderRot2Rad);
        rotatingEncoder.setVelocityConversionFactor(Constants.Drivetrain.kTurningEncoderRPM2RadPerSec);

        drivePIDController = new PIDController(Constants.Drivetrain.kPDrive, 0, 0);
        rotatingPIDController = new PIDController(Constants.Drivetrain.kPRotating, 0, 0);
    }
    */
}
