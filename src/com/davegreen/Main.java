package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Golf golf = new Golf(36);
        golf.steering(45);
        golf.accelerate(30);
        golf.accelerate(20);
        golf.accelerate(-42);
    }
}
