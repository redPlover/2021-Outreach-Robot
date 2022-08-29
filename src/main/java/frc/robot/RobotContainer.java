// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.Indexer.Waiting;
import frc.robot.subsystems.IndexerSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final IndexerSubsystem indexerSubsystem = new IndexerSubsystem();
  private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();

  Joystick leftStick = new Joystick(0);
  Joystick rightStick = new Joystick(1);

  XboxController gamepad = new XboxController(2);

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    indexerSubsystem.setDefaultCommand(new Waiting(indexerSubsystem));
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
   * it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    // Move ball forward
    new JoystickButton(gamepad, Button.kY.value)
      .whileHeld(
        new ParallelCommandGroup(
          new InstantCommand(shooterSubsystem::kickerMove),
          new InstantCommand(indexerSubsystem::conveyorForward)
        )
      )
      .whenReleased(
        new ParallelCommandGroup(
          new InstantCommand(shooterSubsystem::stopKicker),
          new InstantCommand(indexerSubsystem::stopConveyor),
        )
      );

    // Reverse ball
    new JoystickButton(gamepad, Button.kX.value)
      .whileHeld(
        new ParallelCommandGroup(
          new InstantCommand(shooterSubsystem::kickerReverse),
          new InstantCommand(indexerSubsystem::conveyorReverse)
        )
      )
      .whenReleased(
        new ParallelCommandGroup(
          new InstantCommand(shooterSubsystem::stopKicker),
          new InstantCommand(indexerSubsystem::conveyorStop),
        )
      );
  }

}
