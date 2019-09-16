package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        Engine engine = new Engine();
//        engine.setManufacturer("Renault");
//        engine.setCapacity(1500);
//        Car car = new Car(engine);
//        car.setName("Dacia");
//        car.setFuelLevel(60);
//        car.setMileage(8.5);
//        car.setDoorCount(5);
//        car.setMaxSpeed(100);
//        car.setFuelType("Gasoline");
////        System.out.println(car.getName());
//
////
////        Scanner scanner = new Scanner(System.in);
////        String text = scanner.nextLine();
////        System.out.println("Input from user: " + text);
//
//
//
//        Engine engine2 = new Engine();
//        engine2.setManufacturer("Mercedes");
//        engine2.setCapacity(2500);
//        Car car2 = new Car(engine2);
////        car.accelerate(120,0.5);
//        car2.setName("Mercedes-Benz C");
//        car2.setFuelLevel(60);
//        car2.setMileage(8.5);
//        car2.setDoorCount(3);
//        car2.setMaxSpeed(280);
//        car2.setFuelType("Gasoline");
//        System.out.println(car2.engine);
////        System.out.println(car2.getName());
//
        Engine engine = new Engine();
        engine.setManufacturer("Mercedes");
        Vehicle hybridCar = new HybridCar(engine);
        hybridCar.setName("Prius");
        hybridCar.setFuelLevel(60);
        hybridCar.accelerate(100,1);
        System.out.println(hybridCar);
        ((HybridCar) hybridCar).fly();
        

    }
}
