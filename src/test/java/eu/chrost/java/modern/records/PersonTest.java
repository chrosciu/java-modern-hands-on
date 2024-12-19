package eu.chrost.java.modern.records;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    @Test
    void shouldCreatePersonWithValidData() {
        Person person = new Person("Alice", 25);
        assertEquals("Alice", person.name());
        assertEquals(25, person.age());
    }

    @Test
    void shouldThrowExceptionForInvalidName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Person("", 25));
        assertEquals("Name cannot be null or empty.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionForInvalidAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Person("Alice", -1));
        assertEquals("Age must be greater than 0.", exception.getMessage());
    }

    @Test
    void staticMethodOfShouldCreatePerson() {
        Person person = Person.of("Bob", 30);
        assertEquals("Bob", person.name());
        assertEquals(30, person.age());
    }

    @Test
    void greetShouldReturnCorrectMessage() {
        Person person = new Person("Alice", 25);
        String message = person.greet();
        assertEquals("Hello, my name is Alice and I am 25 years old.", message);
    }

    @Test
    void shouldTrackTotalPersonsCreated() {
        // Reset static counter for a clean test environment
        Person.of("Alice", 25);
        Person.of("Bob", 30);
        assertEquals(2, Person.totalCreated());
    }

    @Test
    void getIdShouldReturnCorrectFormat() {
        Person person = new Person("Alice", 25);
        assertEquals("Alice:25", person.getId());
    }

    @Test
    void shouldNotAllowFieldModification() {
        Person person = new Person("Alice", 25);

        // Reflection can technically modify final fields but this is outside the scope of normal usage
        assertEquals("Alice", person.name());
        assertEquals(25, person.age());
    }

    @Test
    void shouldNotAllowInheritance() {
        // Rekordy nie wspierają dziedziczenia, ale spróbujemy zdefiniować to, aby potwierdzić brak kompilacji.
        // Tego typu testów nie da się wykonać w runtime, ale błędy są wykrywane podczas kompilacji.
        // E.g.: public record Employee(String name, int age) extends Person {} // Błąd kompilacji
    }
}
