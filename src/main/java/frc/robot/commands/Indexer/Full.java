package frc.robot.commands.Indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IndexerSubsystem;

public class Full extends CommandBase {
    
    private final IndexerSubsystem subsystem;
    private boolean isFinishedFlag = false;

    public Full(IndexerSubsystem subsystem) {
        this.subsystem = subsystem;
        addRequirements(this.subsystem);
    }

    @Override
    public void execute() {
        subsystem.conveyorStop();
        
        if (!subsystem.bottomSensor() || !subsystem.topSensor()) {
            isFinishedFlag = true;
        }
    }

    @Override
    public boolean isFinished() {
        return isFinishedFlag;
    }
}
