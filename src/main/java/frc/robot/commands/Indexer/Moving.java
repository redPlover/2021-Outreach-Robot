package frc.robot.commands.Indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IndexerSubsystem;

public class Moving extends CommandBase {
    private final IndexerSubsystem subsystem;
    private boolean isFinishedFlag = false;

    public Moving(IndexerSubsystem subsystem) {
        this.subsystem = subsystem;
        addRequirements(this.subsystem);
    }

    @Override
    public void execute() {
        if (subsystem.bottomSensor() && subsystem.topSensor()) {
            isFinishedFlag = true;
            new Full(subsystem).schedule();
        } else if (subsystem.topSensor()) {
            isFinishedFlag = true;
            new Reversing(subsystem).schedule();
        } else if (!subsystem.bottomSensor()) {
            isFinishedFlag = true;
        } else {
            subsystem.conveyorForward();
        }
    }

    @Override
    public boolean isFinished() {
        return isFinishedFlag;
    }
}
