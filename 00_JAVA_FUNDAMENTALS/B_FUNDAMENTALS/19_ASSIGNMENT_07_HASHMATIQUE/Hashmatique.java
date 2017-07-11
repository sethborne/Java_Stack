// import java.util.*;
import java.util.HashMap;

class Hashmatique {
    public static void main(String[] args){
        HashMap <String, String> trackList = new HashMap<>();
        trackList.put("Track 01", "There Must Be Some Kinda");
        trackList.put("Track 02", "Way Outta Here");
        trackList.put("Track 03", "Said the Joker To The Thief");
        trackList.put("Track 04", "There Must Be Some Confusion");
        
        String track01 = trackList.get("Track 01");
        System.out.println(track01);
        
        for(HashMap.Entry<String, String> entry : trackList.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}