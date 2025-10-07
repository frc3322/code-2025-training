package frc.robot.subsystems.elevator;

public class ElevatorConstants {

  public static final int elevatorMotorCurrentLimit = 60;

  public static final double positionConversionFactor = .0526;
  public static final double velocityConversionFactor = .0526;

  public static class ControllerConstants {
    public static final double kP = 2;
    public static final double kI = 0.1;
    public static final double kD = 0.0;
  }

  public static class ElevatorSetpoints {
    public static final double groundPosition = 0.0;
    public static final double sourcePosition = 0.2403;
    public static final double l1Position = 0.0;
    public static final double l2Position = 0.19;
    public static final double l3Position = 0.57;
    public static final double l4Position = 1.4;
  }
}