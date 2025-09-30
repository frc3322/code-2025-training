// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.pivot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pivot extends SubsystemBase {

  private static Pivot instance;

  public static Pivot initialize() {
    if (instance == null) {
      instance = new Pivot();
    }
    return instance;
  }

  public static Pivot getInstance() {
    return instance;
  }

  /** Creates a new Pivot. */
  public Pivot() {}

  @Override
  public void periodic() {}
}
