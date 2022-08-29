package frc.robot.commands.Indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IndexerSubsystem;

public class Reversing extends CommandBase {
    
    private final IndexerSubsystem subsystem;
    private boolean isFinishedFlag = false;

    public Reversing(IndexerSubsystem subsystem) {
        this.subsystem = subsystem;
        addRequirements(this.subsystem);
    }

    @Override
    public void execute() {
        if (subsystem.bottomSensor()) {
            isFinishedFlag = true;
        } else {
            subsystem.conveyorReverse();
        }
    }

    @Override
    public boolean isFinished() {
        return isFinishedFlag;
    }
}
