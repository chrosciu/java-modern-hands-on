### Warsztat: Klasy zapieczętowane w Javie (z polami i metodami)

#### Cel:

Przećwiczenie użycia klas zapieczętowanych z uwzględnieniem pól, metod, modyfikatorów oraz użycia w różnych scenariuszach programistycznych.


---

**Część 1: Zapieczętowana klasa `Shape` z polami i metodami** 

**Opis zadania:**
1. Utwórz zapieczętowaną klasę `Shape`
 
2. Dodaj metodę abstrakcyjną:
- `double calculateArea()`.

3. W podklasach dodaj:
- **`Circle`:**
    - Pole `double radius` z walidacją w konstruktorze (wartość > 0).

    - Implementacja metody `calculateArea()`.

- **`Rectangle`:**
    - Pola `double width` i `double height` z walidacją (wartości > 0).

    - Implementacja metody `calculateArea()`.

- **`Triangle`:**
    - Pola `double base` i `double height` z walidacją (wartości > 0).

    - Implementacja metody `calculateArea()`.


---

**Część 2: Zapieczętowany interfejs `Movable` z metodami** 

**Opis zadania:**
1. Utwórz zapieczętowany interfejs `Movable` z metodami:
- `int getSpeed()`;

- `void accelerate(int delta)` (z domyślną implementacją: "increase speed by delta").

2. Klasy implementujące:
- **`Car`:**  pole `int speed`, metoda `getSpeed()` oraz specyficzna metoda `void honk()`.

- **`Bike`:**  pole `int speed`, metoda `getSpeed()` oraz specyficzna metoda `void ringBell()`.

- **`Train`:**  implementacja dowolna, pole `int speed`.


---

**Część 3: Niedozwolone konstrukcje** 

**Opis zadania:**
1. Spróbuj dodać klasę implementującą `Movable` lub dziedziczącą `Shape` spoza zapieczętowanego kontekstu.
- **Oczekiwany rezultat:**  błąd kompilatora.


---

**Część 4: Klasy zapieczętowane i `switch`** 

**Opis zadania:**
1. Utworz klasę utilową `ShapeUtils` z statyczną metodą `String describeShape(Shape shape)`, która:
* Wykorzystuje switch do obsługi różnych typów kształtów.
* Dla każdego kształtu zwraca opis:
  * `Circle`: "Circle with radius {radius}".
  * `Rectangle`: "Rectangle with dimensions {width}x{height}".
  * `Triangle`: "Triangle with base {base} and height {height}".
* Obsługuje wartość `null`, zwracając "Unknown shape".
* Korzysta z arrow labels i pattern matching.



---

**Część 5: Klasy w jednym pliku (opcjonalnie)** 

**Opis zadania:**
1. Przenieś definicję klasy `Shape` i jej podklas do jednego pliku `.java`.