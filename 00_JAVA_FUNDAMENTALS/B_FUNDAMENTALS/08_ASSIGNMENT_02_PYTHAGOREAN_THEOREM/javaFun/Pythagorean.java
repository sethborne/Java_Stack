import java.lang.Math;
class Pythagorean {
    public double calculateHypotenuse(int sideLegA, int sideLegB){
        double hypotenuse = Math.sqrt((sideLegA * sideLegA) + (sideLegB * sideLegB));
        return hypotenuse;
    }
}