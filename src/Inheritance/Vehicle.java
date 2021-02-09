package Inheritance;
// start with a base class of a vehicle, then create a car class that inherits from this base class
// finally create another base class, a specific type of car that inherits from the car class
// you should be able to hand steering, changing gears, and moving (speed in other words)
// you will want to decide where to put the appropriate state and behaviour (fields and methods)
// As mentioned above, changing gears, increasing / decreasing speed should be included
// for your specific type of vehicle, you will want to add something specific for that type of car.

public class Vehicle {
    private String name;
    private int wheels;
    private  int weight;
    private  int height;
    private String engine;
    private String gear;
    private String steering;
    private int currentVelocity;
    private int currentDirection;




    public Vehicle(String name, int wheels, int weight, int height, String engine, String gear, String steering) {
        this.name = name;
        this.wheels = wheels;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
        this.gear = gear;
        this.steering = steering;
        this.currentDirection = 0;
        this.currentVelocity = 0;
        }

    public void steer(int direction){
    this.currentDirection += direction;
        System.out.println("steering at" + currentDirection );
    }


    public void move(int velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("moving at speed: " + currentVelocity + "km, " + "in direction :" + currentDirection );

    }

    public void stop(){
        System.out.println("stop method called with marching brakes");
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getEngine() {
        return engine;
    }

    public String getGear() {
        return gear;
    }

    public String getSteering() {
        return steering;
    }
}
