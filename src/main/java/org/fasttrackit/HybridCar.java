package org.fasttrackit;

public class HybridCar extends Vehicle {

    Engine engine;
    public HybridCar(Engine engine){
        this.engine = engine;
    }
    public HybridCar(){
        this(new Engine());
    }


    @Override
    public double accelerate(double speed, double durationInHours){
        System.out.println(getName() + " is accelerating with " + speed +  "km/h for " + durationInHours+ "h.");
        speed = speed * 2;
        double distance = speed * durationInHours;
        System.out.println("Distance: " + distance);

        setTraveledDistance(getTraveledDistance() + distance);

        System.out.println("Used fuel: " + 0);
        System.out.println("Remaining fuel: " + getFuelLevel());
        System.out.println("Cheater has been detected!");
        return distance;
    }

    //co-variant return type
    @Override
    protected HybridCar clone() throws CloneNotSupportedException {
        return new HybridCar();
    }
    public void fly(){
        System.out.println("Flying!");
    }

}
