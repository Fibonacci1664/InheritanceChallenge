package com.davegreen;

/**
 * Created by daveg on 15/06/2017.
 */
public class Golf extends Car
{
    private int roadServiceMonths;

    public Golf(int roadServiceMonths)
    {
        super("Black", 1800, 4, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

                                                                                                                        // Things that are known should not really
                                                                                                                        // be left as parameters in the constructor
                                                                                                                        // but instead should be hard coded in to the
                                                                                                                        // to the argument fields, e.g. we know that all
                                                                                                                        // Golf cars have 4 wheels.
                                                                                                                        // For arguments sake and as more examples i have assumed
                                                                                                                        // that there is only one make and model of Golf
                                                                                                                        // and so have filled in some of the other arguments,
                                                                                                                        // removing the respective parameters from the constructor.
    public void accelerate(int rate)
    {
        int newSpeed = getCurrentSpeed() + rate;

        if(newSpeed == 0)
        {
            stop();
            changeGear(1);
        }
        else if(newSpeed >0 && newSpeed <= 10)
        {
            changeGear(1);
        }
        else if(newSpeed > 10 && newSpeed <= 15)
        {
            changeGear(2);
        }
        else if(newSpeed > 20 && newSpeed <= 25)
        {
            changeGear(3);
        }
        else if(newSpeed > 25 && newSpeed <= 40)
        {
            changeGear(4);
        }
        else
        {
            changeGear(5);
        }

        if(newSpeed > 0)
        {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }




}
