// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {

  private final ClimberIO climberIO;

  private static Climber instance;

  public static Climber initialize(ClimberIO climberIO) {
    if (instance == null) {
      instance = new Climber(climberIO);
    }
    return instance;
  }

  public static Climber getInstance() {
    return instance;
  }

  /** Creates a new Climber. */
  public Climber(ClimberIO climberIO) {
    this.climberIO = climberIO;
  }

  @Override
  public void periodic() {
  }
}
