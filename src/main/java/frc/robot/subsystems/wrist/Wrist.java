// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.wrist;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Wrist extends SubsystemBase {

  private static Wrist instance;

  public static Wrist initialize() {
    if (instance == null) {
      instance = new Wrist();
    }
    return instance;
  }

  public static Wrist getInstance() {
    return instance;
  }

  /** Creates a new Wrist. */
  public Wrist() {}

  @Override
  public void periodic() {}
}
