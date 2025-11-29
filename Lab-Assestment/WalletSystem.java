abstract class WalletAccount {
    protected int idNumber;
    protected String ownerName;
    protected double currentAmount;

    WalletAccount(int idNumber, String ownerName, double currentAmount) {
        this.idNumber = idNumber;
        this.ownerName = ownerName;
        this.currentAmount = currentAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }


    abstract void addFunds(double cash);
    abstract void makePayment(double cash); 

    void displayPayment() {
        System.out.println("Remaining Amount: " + currentAmount );
    }
}



class DigitalWallet extends WalletAccount {

    DigitalWallet(int idNumber, String ownerName, double currentAmount) {
        super(idNumber, ownerName, currentAmount);
    }

    @Override
    void addFunds(double cash) {
        if (cash > 0) {
            setCurrentAmount(getCurrentAmount() + cash);
            System.out.println("Added: " +cash);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    @Override
    void makePayment(double cash) {
        if (cash <= 0) {
            System.out.println("Invalid payment amount.");
        } else if (cash > getCurrentAmount()) {
            System.out.println("Not enough balance.");
        } else {
            setCurrentAmount(getCurrentAmount() - cash);
            System.out.println("Paid: " + cash );
        }
    }
}
public class WalletSystem {
    public static void main(String[] args) {
        WalletAccount myWallet = new DigitalWallet(2025, "Jamima Afroz", 10000);

        myWallet.addFunds(3000);      
        myWallet.makePayment(1200);    
        myWallet.displayPayment();       
    }
}
