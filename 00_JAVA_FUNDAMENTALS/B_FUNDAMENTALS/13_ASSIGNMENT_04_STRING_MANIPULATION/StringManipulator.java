public class StringManipulator {
    //methods
    public String trimAndConcat(String string1, String string2){
        String stringConcat = string1.concat(string2);
        // return "trimAndConcat";
        String stringTrimAndConcat = stringConcat.trim();
        // return stringConcat;
        return stringTrimAndConcat;
    }
    public int getIndexOrNull(String string1, char char1){
        int charIndex = string1.indexOf(char1);
        if(charIndex == -1){
            return charIndex;
        }
        else{
            return charIndex;
        }
    }
    public int getIndexOrNull(String string1, String string2){
        int stringIndex = string1.indexOf(string2);
        return stringIndex;
    }
    public String concatSubstring(String string1, int indexBeg, int indexEnd, String string2){
        String stringToIndex = string1;
        if(stringToIndex.length() < indexEnd){
            return "Your Index End Parameter is to large for you input String.  Please either reduce the Index End Parameter, or lengthen your String";
        }
        else if(indexEnd < indexBeg){
            return "Your Index End Parameter is less than your Index Beginning.  Please Fix.";
        }
        else{
            String stringSubstring = stringToIndex.substring(indexBeg, indexEnd);
            String stringConcat = stringSubstring.concat(string2);
            return stringConcat;
        }
    }
}