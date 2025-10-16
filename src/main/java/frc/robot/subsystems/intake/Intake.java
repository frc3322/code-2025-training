// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.intake.IntakeConstants;
import com.revrobotics.spark.SparkMax;
public class Intake extends SubsystemBase {

  private final IntakeIO intakeIO;

  private static Intake instance;

  public static Intake initialize(IntakeIO intakeIO) {
    if (instance == null) {
      instance = new Intake(intakeIO);
    }
    return instance;
  }

  public static Intake getInstance() {
    return instance;
  }

  /** Creates a new Intake. */
  public Intake(IntakeIO intakeIO) {
    this.intakeIO = intakeIO;
  }

  @Override
  public void periodic() {}
}
