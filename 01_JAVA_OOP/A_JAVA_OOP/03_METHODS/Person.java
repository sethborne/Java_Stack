// Calling static methods from inside its own class 
public class Person {
    public static void main(String[] args) {
        getName();
    }

    static void getName() {
        System.out.println("My name is Dojo.");
    }
}

// Calling static methods from outside the Person class. Assume that this class is in its own file in the same directory
// This would be for the TEST Scenario?
// public class School {
//     public static void main(String[] args) {
//         Person.getName();
//     }
// }