public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double hypo = Math.sqrt(legA*legA + legB*legB);
        return hypo;
    }
}