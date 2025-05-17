package frc.robot.commands;

import frc.robot.Constants.ArmConstants;
import frc.robot.subsystems.ArmSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class ArmEncoderCommand extends Command {
  private final ArmSubsystem m_arm;
  private double kP = 0.05, kI = 0, kD = 0, kILimit = 0;
  public ArmEncoderCommand(ArmSubsystem arm) {
    m_arm = arm;
    addRequirements(arm);
  }

  @Override
  public void initialize()
  {
    
  }

  @Override
  public void execute() {
    m_arm.runArm();
  }

  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
