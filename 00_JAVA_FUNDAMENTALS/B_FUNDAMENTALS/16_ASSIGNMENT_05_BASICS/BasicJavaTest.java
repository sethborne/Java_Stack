import java.util.Arrays;
import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava classObj = new BasicJava();
        String logAllBetween = classObj.printAllBetween(1, 255);
        System.out.println(logAllBetween);
        
        String logAllOddBetween = classObj.printAllOddsBetween(1, 255);
        System.out.println(logAllOddBetween);
        
        String logSumBetween = classObj.printSumBetween(100, 255);
        System.out.println(logSumBetween);
        
        int[] arrayToIterate = { 1, 3, 5, 7, 9, 11, 13 };
        String logIterateArray = classObj.iterateArray(arrayToIterate);
        System.out.println(logIterateArray);
        
        // ArrayList arrayMixedToIterate = new ArrayList();
        // arrayMixedToIterate.add(1);
        // arrayMixedToIterate.add("Three");
        // arrayMixedToIterate.add(5);
        // arrayMixedToIterate.add("Seven");
        // arrayMixedToIterate.add(7);
        // arrayMixedToIterate.add("Nine");
        // arrayMixedToIterate.add(11);
        // arrayMixedToIterate.add("Thirteen");
        // String logIterateArrayMixed = classObj.iterateArrayMixed(arrayMixedToIterate);
        // System.out.println(logIterateArrayMixed);
        
        int[] arrayToIterateForMax = { 1, 3, 5, 7, 9, 11, 13 };
        String logFindMax = classObj.findMaxInArray(arrayToIterateForMax);
        System.out.println(logFindMax);
        
        int[] arrayToIterateForAverage = { 1, 3, 5, 7, 9, 11, 13 };
        String logFindAverage = classObj.findAverageInArray(arrayToIterateForAverage);
        System.out.println(logFindAverage);
        
        String logArrayOddsBetween = classObj.arrayOddsBetween(1, 255);
        System.out.println(logArrayOddsBetween);
        
        int[] arrayToIterateForGreaterThanY = { 1, 3, 5, 7, 9, 11, 13 };
        String logGreaterThanY = classObj.greaterThanY(arrayToIterateForGreaterThanY, 1);
        System.out.println(logGreaterThanY);
        String logGreaterThanY1 = classObj.greaterThanY(arrayToIterateForGreaterThanY, 13);
        System.out.println(logGreaterThanY1);
        
        int[] arrayToSquareValues = { 1, 5, 10, -2};
        String logSquareValues = classObj.squareTheValues(arrayToSquareValues);
        System.out.println(logSquareValues);
        
        int[] arrayToElimNegNumbers = { 1, 5, 10, -2};
        String logElimNegNumbers = classObj.eliminateNegativeNumbers(arrayToElimNegNumbers);
        System.out.println(logElimNegNumbers);
        int[] arrayToElimNegNumbers2 = { -1, -5, -10, -2};
        String logElimNegNumbers2 = classObj.eliminateNegativeNumbers(arrayToElimNegNumbers2);
        System.out.println(logElimNegNumbers2);
        
        int[] arrayToGetMinMaxAverage = { 1, 5, 10, -4};
        String logGetMinMaxAverage = classObj.getMinMaxAverage(arrayToGetMinMaxAverage);
        System.out.println(logGetMinMaxAverage);
        
        int[] arrayShiftValuesInArrayForward = { 1, 5, 10, -4};
        String logShiftValuesInArrayForward = classObj.shiftValuesInArrayForward(arrayShiftValuesInArrayForward);
        System.out.println(logShiftValuesInArrayForward);
    }
}