package com.company;

public abstract class MotorVehicle extends WheeledVehicle {

    public MotorVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service() {
        super.service();
        checkEngine();
    }
}
