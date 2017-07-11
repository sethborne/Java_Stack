// import java.util.Arrays;
import java.util.ArrayList;
public class Loops {
    public static void main(String[] args) {
        
        // 01 - while
        // String space = " ";
        // String dash = "-";
        // int i = 0;
        // while( i < 7 ){
        //     System.out.println("Seth you are so smart" + space + dash + space + i);
        //     i = i + 1;
        // }
        
        // 02 - for loop
        // for (int i = 0; i < 7; i = i + 1){
        //     System.out.println("Bah");
        // }
    
        // 03 - for loop
        // ArrayList<String> dynamicArray = new ArrayList<>();
        // dynamicArray.add("Hello");
        // dynamicArray.add("World");
        // dynamicArray.add("Etc.");
        // System.out.println(dynamicArray.size());
        // // System.out.println(dynamicArray(1));
        
        // for (int i = 0; i < dynamicArray.size(); i++){
        //     System.out.println(dynamicArray.get(i));
        // }
        
        // int i = 0;
        // while( i < dynamicArray.size()){
        //     System.out.println(dynamicArray[i]);   
        // } 
        
        // 04 - Enhanced Loop
        
        ArrayList<String> dynamicArray2 = new ArrayList<>();
        dynamicArray2.add("Hello");
        dynamicArray2.add("World");
        dynamicArray2.add("Etc.");
        
        for (String indexContent : dynamicArray2){
            System.out.println(indexContent);
        }
    }
}