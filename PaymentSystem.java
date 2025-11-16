 public class PaymentSystem {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay();

        p = new UPIPayment();
        p.pay();

        p = new NetBankingPayment();
        p.pay();

        p = new CryptocurrencyPayment();
        p.pay();
    }
}

class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Paying using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Paying using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay() {
        System.out.println("Paying using Net Banking");
    }
}

class CryptocurrencyPayment extends Payment {
    void pay() {
        System.out.println("Paying using Cryptocurrency");
    }
}
