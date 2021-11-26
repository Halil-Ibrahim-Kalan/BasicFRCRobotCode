// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */

  PWMTalonSRX leftRearMotor = new PWMTalonSRX(Constants.DriveConstants.leftRearMotor);
  //PWMTalonSRX leftFrontMotor = new PWMTalonSRX(Constants.DriveConstants.leftFrontMotor);
  //SpeedControllerGroup m_left = new SpeedControllerGroup(leftFrontMotor, leftRearMotor);

  PWMTalonSRX rightRearMotor = new PWMTalonSRX(Constants.DriveConstants.rightRearMotor);
  //PWMTalonSRX rightFrontMotor = new PWMTalonSRX(Constants.DriveConstants.rightFrontMotor);
  //SpeedControllerGroup m_right = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);

  DifferentialDrive m_drive = new DifferentialDrive(leftRearMotor, rightRearMotor);
  public DriveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
  public void arcadeDrive(double x, double y){
    m_drive.arcadeDrive(x, y);
  }

  public void TankDrive(double l, double r){
    m_drive.tankDrive(l, r);
  }
}
