import java.util.Arrays;
import java.util.ArrayList;

public class BasicJava {
    public String printAllBetween(int intStart, int intEnd){
        for(int i = intStart; i <= intEnd; i += 1){
            // int print = i;
            System.out.println(i);
        }
        return "Completed printing numbers from " + intStart + " to " + intEnd;
    }
    public String printAllOddsBetween(int intStart, int intEnd) {
        for(int i = intStart; i <= intEnd; i += 1){
            if( i % 2 == 1 ){
                System.out.println(i);
            }
            else {
                
            }
        }
        return "Completed printing all odd numbers from " + intStart + " to " + intEnd;
    }
    public String printSumBetween(int intStart, int intEnd){
        int sumAll = 0;
        for(int i = intStart; i <= intEnd; i += 1){
            sumAll = sumAll + i;
            System.out.println("New Number: " + i + " Sum: " + sumAll);
        }
        return "The final Sum of All Numbers Between " + intStart + " and " + intEnd + " is " + sumAll;
    }
    public String iterateArray(int[] arrayParamToIterate){
        for(int i = 0; i < arrayParamToIterate.length; i += 1){
            System.out.println(arrayParamToIterate[i]);
        }
        return "Array Iterated!";
    }
    // public String iterateArrayMixed(ArrayList mixedArrayParamToIterate){
    //     int arraySize = mixedArrayParamToIterate.size();
    //     System.out.println(arraySize);
    //     // return arraySize;
    //     return "Mixed Array Iterated!";
    // }
    public String findMaxInArray(int[] arrayParamToIterate){
        int currentMaxVal = arrayParamToIterate[0];
        for(int i = 0; i < arrayParamToIterate.length; i += 1){
            if( arrayParamToIterate[i] > currentMaxVal){
                currentMaxVal = arrayParamToIterate[i];
            }
        }
        // return "You Found the Max";
        return "The Maximum Value in the Array is " + currentMaxVal;
    }
    public String findAverageInArray(int[] arrayParamToIterate){
        int totalSum = 0;
        int arrayLength = arrayParamToIterate.length;
        for(int i = 0; i < arrayParamToIterate.length; i += 1){
            totalSum = totalSum + arrayParamToIterate[i];
        }
        double arrayAverage = totalSum / arrayLength;
        return "The Average Value in the Array is " + arrayAverage;
    }
    public String arrayOddsBetween(int intStart, int intEnd){
        ArrayList<Integer> arrayListOdds = new ArrayList<>();
        //loop through start and end
        for(int i = intStart; i <= intEnd; i += 1){
            // if i is odd - then add a new entry to a new ArrayList
            if( i % 2 == 1){
                arrayListOdds.add(i);
                System.out.println("The Value " + i + " was added to the array");
                // System.out.println(arrayListOdds);
            }
        }
        return "The Resulting Array is " + arrayListOdds;
    }
    public String greaterThanY(int[] arrayParamToEval, int numValToCompare){
        int countLarger = 0;
        //loop
        for(int i = 0; i < arrayParamToEval.length; i += 1){
            if( arrayParamToEval[i] > numValToCompare ){
                countLarger += 1;
            }
        }
        if( countLarger != 0){
            return "There are " + countLarger + " Values Greater Than " + numValToCompare + " in the Array.";
        }
        else {
            return "There are no Values Greater than " + numValToCompare + " in the Array.";
        }
    }
    public String squareTheValues(int[] arrayParamToSquare){
        //loop
        for(int i = 0; i < arrayParamToSquare.length; i += 1){
            arrayParamToSquare[i] = arrayParamToSquare[i] * arrayParamToSquare[i];
        }
        String stringifyArray = Arrays.toString(arrayParamToSquare);
        // return "The Resulting Squared Array is: " + Arrays.toString(arrayParamToSquare);
        return "The Resulting Squared Array is: " + stringifyArray;
        // return "The Resulting Squared Array is: " + arrayParamToSquare;
    }
    public String eliminateNegativeNumbers(int[] arrayParamToIterate){
        for(int i = 0; i < arrayParamToIterate.length; i += 1){
            if(arrayParamToIterate[i] < 0){
                arrayParamToIterate[i] = 0;
            }
        }
        String stringifyArray = Arrays.toString(arrayParamToIterate);
        return "The Resulting Array is: " + stringifyArray;
    }
    public String getMinMaxAverage(int[] arrayParamToIterate) {
        int numValMin = arrayParamToIterate[0];
        int numValMax = arrayParamToIterate[0];
        int numValAverage = 0;
        int numValSumAll = 0;
        for(int i = 0; i < arrayParamToIterate.length; i += 1){
            if(arrayParamToIterate[i] < numValMin){
                numValMin = arrayParamToIterate[i];
            }
            else if(arrayParamToIterate[i] > numValMax){
                numValMax = arrayParamToIterate[i];
            }
            numValSumAll = numValSumAll + arrayParamToIterate[i];
        }
        numValAverage = numValSumAll / arrayParamToIterate.length;
        int[] arrayOfMinMaxAverage = { numValMin, numValMax, numValAverage };
        String stringifyArray = Arrays.toString(arrayOfMinMaxAverage);
        return stringifyArray + " - The Minimum Value is " + numValMin + " The Maximum Value is " + numValMax + " The Average Value is " + numValAverage;
    }
    
    public String shiftValuesInArrayForward(int[] arrayParamToShift){
        int arraySubValue = 0;
        int arrayLengthShort = arrayParamToShift.length - 1;
        for(int i = 0; i < arrayLengthShort; i += 1){
            arrayParamToShift[i] = arrayParamToShift[i + 1];
        }
        arrayParamToShift[arrayParamToShift.length-1] = arraySubValue;
        String stringifyArray = Arrays.toString(arrayParamToShift);
        return "The Shifted Array is " + stringifyArray;
    }
}