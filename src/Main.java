import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type roll: ");
        String rolling = in.next();
        System.out.print("Turns: ");
        int turns = in.nextInt();
        Dice d = new Dice();
        d.roll(rolling, turns);

    }
}