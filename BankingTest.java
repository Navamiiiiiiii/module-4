final class CentralBankRules {
    void rules() {
        System.out.println("Central Bank Rules applied.");
    }
}

class Account {
    final String accountNumber; 
    Account(String acc) {
        this.accountNumber = acc;
    }

    final void bankPolicy() { 
        System.out.println("Default Bank Policy.");
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String acc) {
        super(acc);
    }

  
}

public class BankingTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123");
        System.out.println("Account No: " + sa.accountNumber);
        sa.bankPolicy();

        CentralBankRules c = new CentralBankRules();
        c.rules();
    }
}
