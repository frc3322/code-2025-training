// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.elevator;

import java.lang.invoke.VarHandle;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {

    private final ElevatorIO elevatorIO;

    public static int trackState;

    public static void setTrackState(int state) {
        trackState = state;
    }

    private static Elevator instance;

    public static Elevator initialize(ElevatorIO elevatorIO) {
        if (instance == null) {
            instance = new Elevator(elevatorIO);
        }
        return instance;
    }

    public static Elevator getInstance() {
        return instance;
    }

    /** Creates a new Elevator. */
    public Elevator(ElevatorIO elevatorIO) {
        this.elevatorIO = elevatorIO;
    }

  @Override
  public void periodic() {
    // States that each number of trackState sends the robot to a different position
    if (trackState == 1) 
    {
        elevatorIO.setPosition(ElevatorConstants.ElevatorSetpoints.l1Position);
    }
    if (trackState == 2) 
    {
        elevatorIO.setPosition(ElevatorConstants.ElevatorSetpoints.l2Position);
    }
    if (trackState == 3) 
    {
        elevatorIO.setPosition(ElevatorConstants.ElevatorSetpoints.l3Position);  
    }
    if (trackState == 4) 
    {
        elevatorIO.setPosition(ElevatorConstants.ElevatorSetpoints.l4Position);  
    }
    if (trackState == 5) 
    {
        elevatorIO.setPosition(ElevatorConstants.ElevatorSetpoints.groundPosition);  
    }
    if (trackState == 6) 
    {
        elevatorIO.setPosition(ElevatorConstants.ElevatorSetpoints.sourcePosition);  
    }
  }
