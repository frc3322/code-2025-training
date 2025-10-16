// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.intake.IntakeConstants;
import com.revrobotics.spark.SparkMax;
public class Intake extends SubsystemBase {

  private static Intake instance;

  public static Intake initialize() {
    if (instance == null) {
      instance = new Intake();
      
    }
    return instance;
  }

  public static Intake getInstance() {
    return instance;
  }

  /** Creates a new Intake. */
  public Intake() {}

  @Override
  public void periodic() {}
}
