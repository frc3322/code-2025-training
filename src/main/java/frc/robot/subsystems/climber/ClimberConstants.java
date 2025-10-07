package frc.robot.subsystems.climber;

public abstract class ClimberConstants {
    // Climber motor CAN ID
    // Pid constants
    // setpoints
    public static final int CLIMBER_MOTOR_CAN_ID = 10;

    public static final double CLIMBER_PID_P = 0.1;
    public static final double CLIMBER_PID_I = 0.0;
    public static final double CLIMBER_PID_D = 0.0;

    public static final double CLIMBER_SETPOINT_LOW = 0.0;
    public static final double CLIMBER_SETPOINT_CLIMB = 100.0;
    public static final double CLIMBER_SETPOINT_STOW = 50.0;
}
