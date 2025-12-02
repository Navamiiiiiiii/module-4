class Transport {
    void deliver() {
        System.out.println("General transport delivering goods...");
    }
}

class Truck extends Transport {
    void deliver() {
        System.out.println("Truck delivering goods by road.");
    }
}

class Ship extends Transport {
    void deliver() {
        System.out.println("Ship delivering goods by sea.");
    }
}

class Airplane extends Transport {
    void deliver() {
        System.out.println("Airplane delivering goods by air.");
    }
}

public class TestTransport {
    public static void main(String[] args) {

        Transport t;

        t = new Truck();
        t.deliver();

        t = new Ship();
        t.deliver();

        t = new Airplane();
        t.deliver();
    }
}
