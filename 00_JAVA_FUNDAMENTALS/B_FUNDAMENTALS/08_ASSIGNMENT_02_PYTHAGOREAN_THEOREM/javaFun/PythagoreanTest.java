class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean leg = new Pythagorean();
        double legLength = leg.calculateHypotenuse(3, 4);
        System.out.println(legLength);
    }
}