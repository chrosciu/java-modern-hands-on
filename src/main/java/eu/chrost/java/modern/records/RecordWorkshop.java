package eu.chrost.java.modern.records;

// Przykład nielegalnego dziedziczenia
// record Employee(String name, int age, String position) extends Person {} // ERROR

public class RecordWorkshop {
    public static void main(String[] args) {
        // Testy tworzenia rekordów
        Person person1 = new Person("Alice", 25);
        Person person2 = Person.of("Bob", 30);

        System.out.println(person1.greet());
        System.out.println(person2.greet());

        // Test statycznych pól i metod
        System.out.println("Total Persons Created: " + Person.totalCreated());

        // Test implementacji interfejsu
        System.out.println("ID: " + person1.getId());

        // Próba modyfikacji pola
        // person1.name = "Mike"; // ERROR - pola są finalne
    }
}

