public class Spiller {
    private String navn;
    private int pengebeholdning;

    public Spiller(String navn) {
        this.navn = navn;
        this.pengebeholdning = 1000;
    }

    public String getNavn() {
        return navn;
    }

    public void setPengebeholdning(int nyPengebeholdning) {
        this.pengebeholdning = nyPengebeholdning;
    }

    public int getPengebeholdning() {
        return pengebeholdning;
    }

    public void indsætPenge(int beløb) {
        if (beløb >= 0) {
            pengebeholdning += beløb;
        }
    }

    public void hævPenge(int beløb) {
        if (pengebeholdning - beløb >= 0) {
            pengebeholdning -= beløb;
        }
    }

    public String toString() {
        return navn + "'s" + " konto: " + pengebeholdning;
    }
}