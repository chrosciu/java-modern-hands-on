package eu.chrost.java.modern.records;

record Person(String name, int age) implements Identifiable {
    // Konstruktor kompaktowy z walidacją
    public Person {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0.");
        }
    }

    // Pole statyczne
    private static int totalPersons = 0;

    // Statyczny konstruktor fabryczny
    public static Person of(String fullName, int age) {
        totalPersons++;
        return new Person(fullName, age);
    }

    // Metoda statyczna do sprawdzenia liczby utworzonych osób
    public static int totalCreated() {
        return totalPersons;
    }

    // Metoda instancyjna
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }

    // Implementacja interfejsu
    @Override
    public String getId() {
        return name + ":" + age;
    }
}

