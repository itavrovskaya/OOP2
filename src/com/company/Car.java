package com.company;

public class Car extends MotorVehicle{

    public Car (String modelName) {
        super(modelName, 4);}

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
