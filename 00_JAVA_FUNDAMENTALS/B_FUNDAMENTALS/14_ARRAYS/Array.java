import java.util.Arrays;
import java.util.ArrayList;
class Array  {
    public static void main(String[] args) {
        // 01
        // int[] arrayTest;
        // arrayTest = new int[5];
        // arrayTest[0] = 4;
        // arrayTest[1] = 8;
        // arrayTest[2] = 8;
        // arrayTest[3] = 5;
        // arrayTest[4] = 9;
        
        // 02
        // int[] arrayTest = {4, 8, 8, 5, 9};
        
        // System.out.println(Arrays.toString(arrayTest));
        
        // ArrayList
        ArrayList<Integer> arrayListTest = new ArrayList<>();
        arrayListTest.add(10);
        arrayListTest.add(100);
        int num = arrayListTest.get(0);
        // System.out.println(num);
        System.out.println(arrayListTest);
    }
}