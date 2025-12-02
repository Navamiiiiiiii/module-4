interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
        return 6.5f;
    }
}

class HDFC implements Bank {
    public float rateOfInterest() {
        return 7.2f;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI ROI: " + b1.rateOfInterest());
        System.out.println("HDFC ROI: " + b2.rateOfInterest());
    }
}
