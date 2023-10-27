import java.util.Random;

public class Raflebaeger {
    private Terning terning1;
    private Terning terning2;
    private Random random;

    public Raflebaeger() {
        terning1 = new Terning();
        terning2 = new Terning();
        random = new Random();
    }

    public void slå() {
        terning1.kast();
        terning2.kast();
    }

    public int getSum() {
        return terning1.getØjne() + terning2.getØjne();
    }

    public boolean getEns() {
        return terning1.erEns(terning2);
    }

    public boolean harSlåetToEttere() {
        return terning1.getØjne() == 1 && terning2.getØjne() == 1;
    }

    public boolean harSlåetToSeksere() {
        return terning1.getØjne() == 6 && terning2.getØjne() == 6;
    }

    public void ekstraTur() {

    }
}