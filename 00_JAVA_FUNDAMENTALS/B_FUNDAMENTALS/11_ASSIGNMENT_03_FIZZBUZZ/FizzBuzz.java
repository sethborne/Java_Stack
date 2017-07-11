public class FizzBuzz {
    public String fizzBuzz(int numVal){
        if(numVal % 3 == 0 && numVal % 5 == 0){
            // System.out.println("FizzBuzz");
            return "FizzBuzz";
        }
        else if(numVal % 5 == 0){
            // System.out.println("Buzz");
            return "Buzz";
        }
        else if(numVal % 3 == 0){
            // System.out.println("Fizz");
            return "Fizz";
        }
        else {
            // System.out.println("");
            return "" + numVal;
        }
    }
}