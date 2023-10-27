import java.util.Random;

public class Terning {
    private int øjne;
    private Random random;

    public Terning() {
        random = new Random();
        kast(); // Kast terningen ved oprettelse
    }

    public void kast() {
        øjne = random.nextInt(6) + 1; // Generer et tilfældigt tal mellem 1 og 6
    }

    public int getØjne() {
        return øjne;
    }

    public boolean erEns(Terning other) {
        return this.øjne == other.getØjne();
    }
}

