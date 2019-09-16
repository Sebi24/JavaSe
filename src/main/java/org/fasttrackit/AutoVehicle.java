package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    Engine engine;

    public AutoVehicle(Engine engine){
        this.engine = engine;
    }
    public AutoVehicle(){
        this(new Engine());
    }
}
