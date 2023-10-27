import java.util.Random;
import java.util.Scanner;

public class Spil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til spillet!");
        System.out.print("Navn på spiller 1: ");
        String navnSpiller1 = scanner.nextLine();
        Spiller spiller1 = new Spiller(navnSpiller1);

        System.out.print("Navn på spiller 2: ");
        String navnSpiller2 = scanner.nextLine();
        Spiller spiller2 = new Spiller(navnSpiller2);

        boolean skiftSpiller = false;
        boolean ekstraTur = false;

        while (spiller1.getPengebeholdning() < 3000 && spiller2.getPengebeholdning() < 3000) {
            if (!skiftSpiller) {
                System.out.println(spiller1.getNavn() + ", tryk Enter for at kaste terningerne...");
                scanner.nextLine();

                int kast1 = kastTerning();
                int kast2 = kastTerning();

                int sum = kast1 + kast2;
                String feltTekst = "";

                if (kast1 == kast2) {
                  ekstraTur = true;
                  System.out.println("ekstra tur");  
                }

            switch (sum) {
            case 2:
                feltTekst = "Tower: Du er nået toppen af tårnet og finder 250";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() + 250);
                break;
            case 3:
                feltTekst = "Crater: Du falder og mister 100";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() - 100);
                break;
            case 4:
                feltTekst = "Palace Gates: Du er belønnet 100 for at træde gennem porten";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() + 100);
                break;
            case 5:
                feltTekst = "Cold Desert: Du sidder fast i ørken og mister 20";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() - 20);
                break;
            case 6:
                feltTekst = "Walled City: Du er belønnet 180";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() + 180);
                break;
            case 7:
                feltTekst = "Monastery: Du tar en kort pause";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() + 0);
                break;
            case 8:
                feltTekst = "Black Cave: Du sidder fast i en grotte og mister 70";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() - 70);
                break;
            case 9:
                feltTekst = "Huts in the Mountain: Du er belønnet 60 for at finde bjergfolket";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() + 60);
                break;
            case 10:
                feltTekst = "The Werewall (werewolf-wall): Du møder en vareulv og giver den 80, men du får lov at slå igen";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() - 80);
                ekstraTur = true;
                break;
            case 11:
                feltTekst = "The Pit: Du falder ned i et hul og mister 50";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() - 50);
                break;
            case 12:
                feltTekst = "Goldmine: Du finder en guldmine, du er rig";
                spiller1.setPengebeholdning(spiller1.getPengebeholdning() + 650);
                break;
            }

            System.out.println(spiller1.getNavn() + " kastede " + sum + ": " + kast1 + " og " + kast2);
            System.out.println(feltTekst);
                System.out.println(spiller1);

                if (!ekstraTur) {
                    skiftSpiller = true;
                }
            } else {
                System.out.println(spiller2.getNavn() + ", tryk Enter for at kaste terningerne...");
                scanner.nextLine();

                int kast1 = kastTerning();
                int kast2 = kastTerning();

                int sum = kast1 + kast2;
                String feltTekst = "";

                switch (sum) {
            case 2:
                feltTekst = "Tower: Du er nået toppen af tårnet og finder 250";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() + 250);
                break;
            case 3:
                feltTekst = "Crater: Du falder og mister 100";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() - 100);
                break;
            case 4:
                feltTekst = "Palace Gates: Du er belønnet 100 for at træde gennem porten";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() + 100);
                break;
            case 5:
                feltTekst = "Cold Desert: Du sidder fast i ørken og mister 20";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() - 20);
                break;
            case 6:
                feltTekst = "Walled City: Du er belønnet 180";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() + 180);
                break;
            case 7:
                feltTekst = "Monastery: Du tar en kort pause";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() + 0);
                break;
            case 8:
                feltTekst = "Black Cave: Du sidder fast i en grotte og mister 70";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() - 70);
                break;
            case 9:
                feltTekst = "Huts in the Mountain: Du er belønnet 60 for at finde bjergfolket";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() + 60);
                break;
            case 10:
                feltTekst = "The Werewall (werewolf-wall): Du møder en vareulv og giver den 80, men du får lov at slå igen";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() - 80);
                ekstraTur = true;
                break;
            case 11:
                feltTekst = "The Pit: Du falder ned i et hul og mister 50";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() - 50);
                break;
            case 12:
                feltTekst = "Goldmine: Du finder en guldmine, du er rig";
                spiller2.setPengebeholdning(spiller2.getPengebeholdning() + 650);
                break;
                }

                System.out.println(spiller2.getNavn() + " kastede " + sum + ": " + kast1 + " og " + kast2);
            System.out.println(feltTekst);
                System.out.println(spiller2);

                if (!ekstraTur) {
                    skiftSpiller = false;
                }
            }

            ekstraTur = false;
        }

        if (spiller1.getPengebeholdning() >= 3000) {
            System.out.println(spiller1.getNavn() + " har vundet!");
        } else {
            System.out.println(spiller2.getNavn() + " har vundet!");
        }

        scanner.close();
    }

    public static int kastTerning() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}