package com.davegreen;

/**
 * Created by daveg on 15/06/2017.
 */
public class Car extends Vehicle
{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String colour, int engineCc, int wheels, int doors, int gears, boolean isManual)
    {
        super(colour, engineCc);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 0;
    }

    public void changeGear(int currentGear)         // This will set the gear to the value of the currentGear parameter when the argument is passed
    {                                               // when calling the method.
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(); Changed to " + this.currentGear + " gear ");
    }

    public void changeSpeed(int speed, int direction)
    {
        System.out.println("Car.changeSpeed(): Speed " + speed + " direction " + direction);
        move(speed, direction);
    }
}
