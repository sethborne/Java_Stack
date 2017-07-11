// Work on the puzzles below. Make your code as clean as possible. The class name should be PuzzleJava; you will need to create methods for each of the tasks below, and test them in the main method.
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class PuzzleJava {
    
// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    public String printSumOfAllInArray(int[] arrayParamsToIterate, int numValOverSelect){
        int numValSumAll = 0;
        //over x should be a ArrayList - no way to know how many per array.
        ArrayList<Integer> arrayValuesOverSelect = new ArrayList<>();
        for(int i = 0; i < arrayParamsToIterate.length; i += 1){
            numValSumAll = numValSumAll + arrayParamsToIterate[i];
            if(arrayParamsToIterate[i] > numValOverSelect){
                arrayValuesOverSelect.add(arrayParamsToIterate[i]);
            }
        }
        if(arrayValuesOverSelect.size() > 1){
            // String stringifyArray = Arrays.toString(arrayValuesOverSelect);
            return "The Sum of all Values in the Given Array is " + numValSumAll + " and the Values in the Array Over " + numValOverSelect + " are " + arrayValuesOverSelect + ".";
        }
        else if(arrayValuesOverSelect.size() == 1){
            return "The Sum of all Values in the Given Array is " + numValSumAll + " and the Value in the Array Over " + numValOverSelect + " is " + arrayValuesOverSelect + ".";
        }
        else {
            return "The Sum of all Values in the Given Array is " + numValSumAll + " ; however, there are no Values in the Array Over " + numValOverSelect + ".";
        }
    }


// Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
    public String shuffleArray(String[] arrayParamsToIterate, int numValNameOverCharLength){
        ArrayList<String> arrayListNamesOverSelectLength = new ArrayList<>();
        // Find All items over a certain character limit.
        for(int i = 0; i < arrayParamsToIterate.length; i += 1){
            if(arrayParamsToIterate[i].length() > numValNameOverCharLength){
                arrayListNamesOverSelectLength.add(arrayParamsToIterate[i]);
            }
        }
        //Shuffle loop
        Random rand = ThreadLocalRandom.current();
        for(int i = arrayParamsToIterate.length - 1; i > 0; i -= 1){
            // System.out.println(arrayParamsToIterate[i]);
            int index = rand.nextInt(i + 1);
            // Swap Here
            String temp = arrayParamsToIterate[index];
            arrayParamsToIterate[index] = arrayParamsToIterate[i];
            arrayParamsToIterate[i] = temp;
            
        }
        String stringifyArray = Arrays.toString(arrayParamsToIterate);
        if(arrayListNamesOverSelectLength.size() > 1){
            // String stringifyArray = Arrays.toString(arrayValuesOverSelect);
            return "The Shuffled Names in the Array Are " + stringifyArray + " and the Names in the Array Over " + numValNameOverCharLength + " are " + arrayListNamesOverSelectLength + ".";
        }
        else if(arrayListNamesOverSelectLength.size() == 1){
            return "The Shuffled Names in the Array Are " + stringifyArray + " and the Name in the Array Over " + numValNameOverCharLength + " is " + arrayListNamesOverSelectLength + ".";
        }
        else {
            return "The Shuffled Names in the Array Are " + stringifyArray + " ; however, there are no names in the Array Over " + numValNameOverCharLength + ".";
        }
    }

// Create an array that contains all 26 letters in the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message
    public String shuffleArrayOfChars(String[] arrayParamsToIterate){
        //Shuffle Loop - Fisher/Yates
        Random rand = ThreadLocalRandom.current();
        for(int i = arrayParamsToIterate.length - 1; i > 0; i -= 1){
            
            int index = rand.nextInt(i + 1);
            String tempSwap = arrayParamsToIterate[index];
            arrayParamsToIterate[index] = arrayParamsToIterate[i];
            arrayParamsToIterate[i] = tempSwap;
        }
        String arrayValFirst = arrayParamsToIterate[0];
        String arrayValLast = arrayParamsToIterate[arrayParamsToIterate.length - 1];
        String stringifyArray = Arrays.toString(arrayParamsToIterate);
        boolean isFirstVowel = false;
        if( arrayValFirst == "A" || arrayValFirst == "E" || arrayValFirst == "I" || arrayValFirst == "O" || arrayValFirst == "U"){
            isFirstVowel = true;
        }
        if( isFirstVowel == true ){
            return "The First Value in the Array is " + arrayValFirst + " and the Last Value in the Array is " + arrayValLast + " The Array is " + stringifyArray + ".  Additionally - the First Value in the Sorted Array IS a Vowel, Congrats!";
        }
        else {
            return "The First Value in the Array is " + arrayValFirst + " and the Last Value in the Array is " + arrayValLast + " The Array is " + stringifyArray; 
        }
    }
// Generate and return an array with 10 random numbers between 55-100.
    public String getRandNumberArray(int numValStart, int numValEnd, int numValArraySize){
    int[] randNumberArray = new int[numValArraySize];
    // Import Random
    // String rand = ThreadLocalRandom.current();
    for(int i = 0; i < randNumberArray.length; i += 1){
        // Test fill
        // randNumberArray[i] = 0;
        // Random Number
        int randomNumGen = ThreadLocalRandom.current().nextInt(numValStart, numValEnd + 1);
        randNumberArray[i] = randomNumGen;
    }
    String stringifyArray = Arrays.toString(randNumberArray);
    return "The Random Array with " + numValArraySize + " Values is " + stringifyArray;
    }
// Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public String getRandNumberSortedArray(int numValStart, int numValEnd, int numValArraySize){
        int[] randNumberArray = new int[numValArraySize];
        for(int i = 0; i < randNumberArray.length; i += 1){
            int randNumberGen = ThreadLocalRandom.current().nextInt(numValStart, numValEnd + 1);
            randNumberArray[i] = randNumberGen;
        }
        // int[] randNumberArraySorted = new int[numValArraySize];
        Arrays.sort(randNumberArray);
        int arrayValMin = randNumberArray[0];
        int arrayValMax = randNumberArray[randNumberArray.length - 1];
        String stringifyArray = Arrays.toString(randNumberArray);
        return "The Random Array with " + numValArraySize + " Values is " + stringifyArray + " The Minimum Value in the Array is " + arrayValMin + " - And the Maximum Value in the Array is " + arrayValMax;
    }
// Create a random string that is 5 characters long.
    public String getRandStringOfLength(String stringOfRandChars, int numValStringLength){
        StringBuilder randString = new StringBuilder( numValStringLength );
        //loop to select random and put in string
        Random rand = new Random();
        for(int i = 0; i < numValStringLength; i += 1){
            randString.append(stringOfRandChars.charAt(rand.nextInt(stringOfRandChars.length())));
        }
        // return "I'm Here";
        return randString.toString();
    }

// Generate an array with 10 random strings that are each 5 characters long
    public String getRandArrayOfRandStrings(String stringOfRandChars, int numValStringLength, int numValArraySize){
        String[] arrayOfRandomStrings = new String[numValArraySize];
        for(int x = 0; x < arrayOfRandomStrings.length; x += 1){
            StringBuilder randString = new StringBuilder( numValStringLength );
            Random rand = new Random();
            for(int y = 0; y < numValStringLength; y += 1){
                randString.append(stringOfRandChars.charAt(rand.nextInt(stringOfRandChars.length())));
                arrayOfRandomStrings[x] = randString.toString();
            }
            // System.out.println("Loop " + x + " value is " + randString);
        }
        String stringifyArray = Arrays.toString(arrayOfRandomStrings);
        return stringifyArray;
    }

}