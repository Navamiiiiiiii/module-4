class Book {
    String title;
    int price;

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }
}

class Car {}

class Student {
    int roll;

    Student(int roll) {
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return this.roll == s.roll;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(roll);
    }
}

class Movie {
    String name;
    int rating;

    Movie(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie[name=" + name + ", rating=" + rating + "]";
    }
}

class Player {
    int age;

    Player(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(age);
    }
}

public class TestAll {
    public static void main(String[] args) {

        // Book toString()
        Book b = new Book("Java", 500);
        System.out.println(b);

        // Car getClass()
        Car c = new Car();
        System.out.println(c.getClass());

        // Student equals & hashCode
        Student s1 = new Student(101);
        Student s2 = new Student(101);
        System.out.println("Students equal? " + s1.equals(s2));
        System.out.println("s1 hash: " + s1.hashCode());
        System.out.println("s2 hash: " + s2.hashCode());

        
        Movie m = new Movie("Avengers", 9);
        System.out.println(m);

        
        Player p = new Player(25);
        System.out.println("Player hash: " + p.hashCode());
    }
}
