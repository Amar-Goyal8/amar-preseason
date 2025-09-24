// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.Random;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    //RobotBase.startRobot(Robot::new);
    int x = 5;
    System.out.println(x);
    String name = "Amar";
    System.out.println(name);
    double number = 6.7;
    System.out.println(number);
    boolean amarBool = true;
    System.out.println(amarBool);
    int z = 5;
    int g = 10;
    int m = z * g;
    System.out.println(m);

  }
}
