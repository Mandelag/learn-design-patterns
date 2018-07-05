package com.mandelag.patterns.builder.inner;


/**
 * An example of immutable object Car.
 * The constructor of object can only be obtained from Car.CarBuilder object.
 *
 * @author Keenan Mandela Gebze
 * @version 5 July 2018
 */
public class Car
{
    private String name;
    private String color;
    private double maxSpeed;
    private double handle;
    private String sound;

    private Car(String name, String color, double maxSpeed, double handle, String sound) {
        super();
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.handle = handle;
        this.sound = sound;
    }
    
    public String start() {
        return this.sound;
    }
    
    public static class CarBuilder
    {
        private String name;
        private String color;
        private double maxSpeed;
        private double handle;
        private String sound;
        
        public CarBuilder() {
            super();
            this.name = "Caronymous";
            this.color = "RED";
            this.maxSpeed = 50.0;
            this.handle = 25.0;
            this.sound = "Brrrm!";
        }
        
        public CarBuilder withName(String name) {
            this.name = name;
            return this;
        }
        
        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }
        
        public CarBuilder withMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        
        public CarBuilder withHandle(double handle) {
            this.handle = handle;
            return this;
        }
        
        public CarBuilder withSound(String sound) {
            this.sound = sound;
            return this;
        }
        
        public Car build() {
            Car c = new Car(this.name, this.color, this.maxSpeed, this.handle, this.sound);
            return c;
        }
    }   
}
