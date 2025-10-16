package frc.robot.subsystems.intake;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

public class IntakeIOSpark implements IntakeIO {

    public SparkMax intakeMotor;

    public IntakeIOSpark() {
        intakeMotor = new SparkMax(IntakeConstants.IntakeMotorCanId, MotorType.kBrushless);

        SparkMaxConfig intakeConfig = new SparkMaxConfig();

        intakeConfig
                .idleMode(IdleMode.kCoast)
                .smartCurrentLimit(IntakeConstants.intakeMotorCurrentLimit)
                .inverted(true);

        intakeMotor.configure(
                intakeConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    public void SetIntakePower(int power) {
        intakeMotor.set(power);
    }

}
