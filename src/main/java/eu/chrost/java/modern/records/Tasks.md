### Warsztat: Ćwiczymy Rekordy w Javie

#### Cel:

Poznanie i praktyczne wykorzystanie funkcji rekordów w Javie. Zadanie obejmuje różne typy konstruktorów, metody statyczne i instancyjne, implementację interfejsów oraz ograniczenia rekordów.


---

**Część 1: Wprowadzenie – Klasa `Person` jako rekord** 

**Opis zadania:**
Utwórz rekord `Person`, który będzie przechowywać dane o osobie:
- `String name` (imię)

- `int age` (wiek)
  **Wymagania:**
1. Dodaj walidację w konstruktorze kompaktowym:
- `name` nie może być pusty lub `null`.

- `age` musi być większy niż 0.

2. Dodaj statyczną metodę `of`, która utworzy instancję `Person` na podstawie `String fullName` i `int age`.

3. Dodaj metodę instancyjną `greet`, która zwraca tekst powitania w formie: `"Hello, my name is <name> and I am <age> years old."`.


---

**Część 2: Rozbudowa – Statystyki osób** 

**Opis zadania:**
1. Dodaj pole statyczne `int totalPersons`, które będzie zliczać liczbę utworzonych osób.

2. Zaimplementuj statyczną metodę `totalCreated()`, która zwraca wartość `totalPersons`.

3. Przetestuj poprawność działania poprzez utworzenie kilku instancji `Person` i sprawdzenie wartości `totalPersons`.


---

**Część 3: Implementacja interfejsu** 

**Opis zadania:**
1. Utwórz interfejs `Identifiable` z metodą `String getId()`.

2. Zaimplementuj ten interfejs w rekordzie `Person`:
- `getId()` powinno zwracać wartość w formacie `"<name>:<age>"`.

---

**Część 4: Ograniczenia rekordów** 

**Opis zadania:**
1. Spróbuj stworzyć nowy rekord `Employee`, który rozszerza rekord `Person`.
- **Oczekiwany rezultat:**  kompilator powinien zgłosić błąd, ponieważ rekordy nie mogą dziedziczyć ani być dziedziczone.

2. Dodaj próbę modyfikacji pól rekordu (np. przypisania nowej wartości do `name`).
- **Oczekiwany rezultat:**  kompilator powinien zgłosić błąd, ponieważ pola rekordu są niezmienne.

---

**Uwagi organizacyjne:**
1. Czas na realizację: około 90 minut.

2. Uczestnicy mogą pracować indywidualnie lub w parach.

3. Po zakończeniu przeprowadzamy wspólne omówienie.

4. Warto dodać testy jednostkowe, aby przećwiczyć poprawność implementacji.

Czy takie podejście odpowiada? 😊
