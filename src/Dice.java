import java.util.Random;

public class Dice {

    private int number;

    public void roll(String go, int turns) {
        if(go.equals("roll")) {
            Random rand = new Random();
            for (int i = 0; i < turns; i++) {
                number = rand.nextInt(6) + 1;
                System.out.print(getNumber() + " ");
            }
        } else
            System.out.println("Invalid!");
    }

    public int getNumber() {
        return number;
    }
}
