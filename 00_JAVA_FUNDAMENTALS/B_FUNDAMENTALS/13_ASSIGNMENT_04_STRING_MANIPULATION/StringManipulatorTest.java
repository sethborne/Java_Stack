public class StringManipulatorTest  {
    public static void main(String[] args) {
        //new
        StringManipulator classObj = new StringManipulator();
        //invoke
        String trimConcat = classObj.trimAndConcat("   This is a ", "Test of the       ");
        //output
        System.out.println(trimConcat);
        
        int getIndex1 = classObj.getIndexOrNull("TestString", 'S');
        if(getIndex1 == -1){
            System.out.println("null");
        }
        else {
            System.out.println(getIndex1);
        }
        
        int getIndex2 = classObj.getIndexOrNull("TestString", "String");
        if(getIndex2 == -1){
            System.out.println("null");
        }
        else {
            System.out.println(getIndex2);
        }
        
        String concatSub = classObj.concatSubstring("Hello", 2, 3, "world");
        System.out.println(concatSub);
    }
}