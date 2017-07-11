import java.util.*;
class ExceptionsGenerics {
    public static void main(String[] args){
        List myList = new ArrayList();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");
        
        // for(int i = 0; i < myList.size(); i += 1){
            
        //     System.out.println("Item " + i + " has value " + myList.get(i));
        // }
        // int item00CastVal = (Integer)myList.get(0);
        System.out.println(myList);
        for(int i = 0; i < myList.size(); i += 1){
            
            boolean convertToIntegerSuccess = true;
            try {
                //is this just a test that can never happen?
                int itemFirst = (Integer)myList.get(i);
            } catch ( ClassCastException e){
                System.err.println("Caught ClassCastException: " + e.getMessage());
                convertToIntegerSuccess = false;
            } finally {
                if( convertToIntegerSuccess == false){
                    // convertToIntegerSuccess = false;
                    System.out.println("ERROR ON INDEX " + i);
                }
                else if( convertToIntegerSuccess == true){
                    System.out.println(myList.get(i));
                }
            }
        }
        
        // System.out.println("Item 0 has value " + item00);
        // Object item01 = myList.get(1);
        // System.out.println("Item 1 has value " + item01);
        // Object item02 = myList.get(2);
        // System.out.println("Item 2 has value " + item02);
        // Object item03 = myList.get(3);
        // System.out.println("Item 3 has value " + item03);
    }
}