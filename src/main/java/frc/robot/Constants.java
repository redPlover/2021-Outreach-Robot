// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

public final class Constants {
    public static final double conveyorSpeed = 0.5;
    public static final double kickerSpeed = 0.5;
    public static final double intakeSpeed = 0.5;

    public static final class CANIds {
        public static final int conveyorMotor = 9;
        public static final int kickerMotor = 10;
        public static final int intakeMotor = 16;
        public static final int shooterMotor = 11;
    }

    public static final class Drivetrain {

        public static final double kTrackWidth = Units.inchesToMeters(16.5);
        public static final double kTrackWidth = Units.inchesToMeters(16.5);
        
        public static final SwerveDriveKinematics kinematics =
            new SwerveDriveKinematics(
                new Translation2d(kTrackWidth / 2.0, kWheelBase / 2.0),
                new Translation2D(kTrackWidth / 2.0, -kWheelBase / 2.0),
                new Translation2d(-kTrackwidth / 2.0, kWheelBase / 2.0),
                new Translation2d(-kTrackWidth / 2.0, -kWheelBase / 2.0)
            );

        public static final double kDriveMotorGearRatio = 1 / 5.8462;
        public static final double kTurningMotorGearRatio = 1 / 18.0;

        /*
        public static final double kWheelDiameterMeters = 0.050686 * 2;
        public static final double kDriveMotorGearRatio = 1 / 5.8462;
        public static final double kTurningMotorGearRatio = 1 / 18.0;
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
        public static final double kPTurning = 0.5;
        */

    }
}
