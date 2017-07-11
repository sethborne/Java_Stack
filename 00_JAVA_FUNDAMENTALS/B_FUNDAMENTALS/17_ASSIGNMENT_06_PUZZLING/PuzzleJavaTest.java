import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args){
        PuzzleJava classObj = new PuzzleJava();
        // this is a global var for clean terminal
        String spacerBetweenProblems = "----------------------------";
        
        System.out.println(spacerBetweenProblems);
        
        int[] arrayToSumAll = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        String logPrintSumOfAllInArray = classObj.printSumOfAllInArray(arrayToSumAll, 10);
        System.out.println(logPrintSumOfAllInArray);
        
        System.out.println(spacerBetweenProblems);
        
        String[] arrayOfNames = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        String logArrayOfNames = classObj.shuffleArray(arrayOfNames, 5);
        System.out.println(logArrayOfNames);
        
        System.out.println(spacerBetweenProblems);
        
        String[] arrayOfChars = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W","X", "Y", "Z" };
        String logArrayOfChars = classObj.shuffleArrayOfChars(arrayOfChars);
        System.out.println(logArrayOfChars);
        
        System.out.println(spacerBetweenProblems);
        
        String logRandNumberArray = classObj.getRandNumberArray(55, 100, 20);
        System.out.println(logRandNumberArray);
        
        System.out.println(spacerBetweenProblems);
        
        String logRandNumberSortedArray = classObj.getRandNumberSortedArray(55, 100, 10);
        System.out.println(logRandNumberSortedArray);
        
        System.out.println(spacerBetweenProblems);
        
        String stringCharsToRandomize = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz";
        String logRandStringOfLength = classObj.getRandStringOfLength(stringCharsToRandomize, 5);
        System.out.println(logRandStringOfLength);
        
        System.out.println(spacerBetweenProblems);
        
        String stringCharsToRandomize2 = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz";
        String logRandArrayOfRandStrings = classObj.getRandArrayOfRandStrings(stringCharsToRandomize2, 5, 10);
        System.out.println(logRandArrayOfRandStrings);
        
        System.out.println(spacerBetweenProblems);
    }
}