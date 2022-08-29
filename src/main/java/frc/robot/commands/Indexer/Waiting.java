package frc.robot.commands.Indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IndexerSubsystem;

public class Waiting extends CommandBase {

    private final IndexerSubsystem subsystem;
    private boolean isFinishedFlag = false;

    public Waiting(IndexerSubsystem subsystem) {
        this.subsystem = subsystem;
        addRequirements(this.subsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        // Not used here.
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        subsystem.conveyorStop();

        if (subsystem.bottomSensor() && subsystem.topSensor()) {
            isFinishedFlag = true;
            new Full(subsystem).schedule();
        } else if (!subsystem.bottomSensor() && subsystem.topSensor()) {
            isFinishedFlag = true;
            new Reversing(subsystem).schedule();
        } else if (subsystem.bottomSensor() && !subsystem.topSensor()) {
            isFinishedFlag = true;
            new Moving(subsystem).schedule();
        }
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return isFinishedFlag;
    }
}
