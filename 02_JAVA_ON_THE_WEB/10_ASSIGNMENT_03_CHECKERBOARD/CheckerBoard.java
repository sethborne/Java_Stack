public class CheckerBoard {
    // private int numValRow;
    // private int numValColumn;
    
    public CheckerBoard () {
    }
    // public Checkerboard (int numValRow, int numValColumn) {
    //     this.numValRow = numValRow;
    //     this.numValColumn = numValColumn;
    // }
    public void makeBoard(){
        for(int i = 1; i <= 3; i += 1){
            for(int j = 1; j <= 5; j += 1){
                // System.out.println("i = " + i + " j = " + j);
                // System.out.println(i + j);
                int sum = i + j;
                if( (i + j) % 2 == 0){
                    System.out.println("white");
                }
                else{
                    System.out.println("black");
                }
            }
            System.out.println("            ");
        }
    }
    
}