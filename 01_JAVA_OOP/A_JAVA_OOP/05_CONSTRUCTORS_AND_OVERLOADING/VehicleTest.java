class VehicleTest {
    public static void main(String[] args) {
        // 00 - uses constructor Vehicle(){}
        
        // Vehicle redVehicle = new Vehicle();
        // redVehicle.setColor("poop");
        // String getColor = redVehicle.getColor();
        // System.out.println("The Vehicle color is: " + getColor);
        
        // 01 - uses constructor Vehicle(String strColor){}
        
        // Vehicle redVehicle = new Vehicle("ofRedColor");
        // String getColor = redVehicle.getColor();
        // System.out.println("The Vehicle color is: " + getColor);
        
        //02 - uses constructor Vehicle(String strColor, int numOfWheels){}
        Vehicle redVehicle = new Vehicle("ofRedColor", 16);
        String getColor = redVehicle.getColor();
        int getNumWheels = redVehicle.getNumberOfWheels();
        System.out.println("The Vehicle color is: " + getColor + " and it has " + getNumWheels + " wheels.");
    }
}