public class Konto {
        private int balance;
    
        public Konto() {
            balance = 0;
        }
    
        public int getBalance() {
            return balance;
        }
    
        public boolean indsætPenge(int beløb) {
            if (beløb >= 0) {
                balance += beløb;
                return true;
            }
            return false;
        }
    
        public boolean hævPenge(int beløb) {
            if (balance - beløb >= 0) {
                balance -= beløb;
                return true;
            }
            return false;
        }
    
        public String toString() {
            return "Konto balance: " + balance;
        }
    }

