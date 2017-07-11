public class ConditionalDemo {
    public static void main(String[] args) {
        // 01 - if
        // boolean defenderGuarding = true;
        // if(defenderGuarding == true){
        //     System.out.println("Pass the Bill");
        // }
        
        // 02 - if else
        // boolean defenderGuarding = false;
        // if(defenderGuarding == true){
        //     System.out.println("Pass The Ball");
        // }
        // else {
        //     System.out.println("Shoot The Ball");
        // }
        
        // 03 if / else if / else
        boolean defenderGuarding = false;
        boolean closeToBasket = false;
        if(defenderGuarding == true){
            System.out.println("Pass the Ball");
        } else if(closeToBasket == true){
            System.out.println("Shoot the Ball");
        } else {
            System.out.println("Dribble the Ball");
        }
    }
}