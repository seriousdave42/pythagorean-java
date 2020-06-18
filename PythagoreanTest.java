import java.util.Scanner;

public class PythagoreanTest {
    public static void main(String[] args) {
        Scanner pythagInput = new Scanner(System.in);
        System.out.println("Enter integer length of side A:");
        int legA = pythagInput.nextInt();
        System.out.println("Enter integer length of side B:");
        int legB = pythagInput.nextInt();
        Pythagorean pythag = new Pythagorean();
        double hypotenuse = pythag.calculateHypotenuse(legA, legB);
        System.out.println("Side A = " + legA);
        System.out.println("Side B = " + legB);
        System.out.println("Hypotenuse = " + hypotenuse);
        pythagInput.close();
    }
}