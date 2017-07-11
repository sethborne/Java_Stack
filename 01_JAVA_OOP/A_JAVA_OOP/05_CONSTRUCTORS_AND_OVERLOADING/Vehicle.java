//class
class Vehicle {
    private int numberOfWheels;
    private String color;
    // 00
    public Vehicle(){
        
    }
    // 01
    public Vehicle(String strColor) {
        // setting the color attribute to the value from the color parameter
        
        // if this - change param to color
        // this.color = color;
        // or
        color = strColor;
    }
    //02
    public Vehicle(String strColor, int numOfWheels){
        color = strColor;
        numberOfWheels = numOfWheels;
    }
    //getter
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    //setter
    public void setNumberOfWheels(int number){
        numberOfWheels = number;
    }
    //getter
    public String getColor(){
        System.out.println(color);
        return color;
    }
    //setter
    public void setColor(String c){
        color = c;
    }
}