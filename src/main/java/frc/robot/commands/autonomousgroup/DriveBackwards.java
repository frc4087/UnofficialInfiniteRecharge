/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomousgroup;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class DriveBackwards extends CommandBase {
  double currentA = Robot.m_robotContainer.m_drivebase.gyro.getAngle();
  double distance = 5; //PLEASE CHANGE THIS LATER FOR THE LOVE OF GOD!!!!!!!!!!!!!!!!!

  public DriveBackwards() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_robotContainer.m_drivebase);
  }

 // Called when the command is initially scheduled.
 @Override
 public void initialize() {
 }
  // Called every time the scheduler runs while the command is scheduled.
 @Override
 public void execute() {  
   //This makes our robot go backwards at the start of the match (if we want to)
  if(Robot.m_robotContainer.m_drivebase.left_ff.getEncoder().getPosition() > distance){
    Robot.m_robotContainer.m_drivebase.left_side.set(-0.25);
    Robot.m_robotContainer.m_drivebase.right_side.set(-0.25);
   }else{
    Robot.m_robotContainer.m_drivebase.left_side.set(0);
    Robot.m_robotContainer.m_drivebase.right_side.set(0);
  }


}
  // Called once the command ends or is interrupted.
 @Override
 public void end(boolean interrupted) {
 }
  // Returns true when the command should end.
 @Override
 public boolean isFinished() {
   return false;
 }
}