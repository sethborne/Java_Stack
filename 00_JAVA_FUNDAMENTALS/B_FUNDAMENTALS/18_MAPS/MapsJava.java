import java.util.*;
import java.util.HashMap;
class MapsJava {
    public static void main(String[] args){
        // MapsJava classObj = new MapsJava();
        HashMap <String, String> userMap = new HashMap<>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        
        String name = userMap.get("nninja@codingdojo.com");
        System.out.println(name);
    }
}