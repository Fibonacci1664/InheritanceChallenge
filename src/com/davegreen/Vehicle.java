package com.davegreen;

/**
 * Created by daveg on 15/06/2017.
 */
public class Vehicle
{
    private String colour;
    private int engineCc;
    private int currentDirection;
    private int currentSpeed;

    public Vehicle(String colour, int engineCc)
    {
        this.colour = colour;
        this.engineCc = engineCc;
        this.currentDirection = 0;
        this.currentSpeed = 0;
    }

    public void steering(int direction)         // This method can change and set the direction of travel as opposed to the move method below
    {                                           // which simply states the direction and speed your already traveling.
        this.currentDirection += direction;
        System.out.println("Vehicle.steering(): Steering at " + currentDirection + " degrees ");
    }

    public void move(int speed, int direction)
    {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public void stop()
    {
        this.currentSpeed = 0;
    }

    public String getColour()
    {
        return colour;
    }

    public int getEngineCc()
    {
        return engineCc;
    }

    public int getCurrentDirection()
    {
        return currentDirection;
    }

    public int getCurrentSpeed()
    {
        return currentSpeed;
    }
}
