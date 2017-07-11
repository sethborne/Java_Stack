class VehicleTest {
    public static void main(String[] args){
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        //set bike
        bike.setNumberOfWheels(2);
        bike.setColor("red");
        //get bike
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        //set car
        car.setNumberOfWheels(4);
        car.setColor("green");
        //get car
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();
        //print bike
        System.out.println("Bike Object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        //print car
        System.out.println("Car Object - Wheels: " + carWheels + ", Color: " + carColor);
    }
}