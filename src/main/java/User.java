public class User {

    // 1. POLA OBIEKTU
    // OPISUJĄ Z CZEGO BĘDZIE SKŁADAŁ SIĘ DANY OBIEKT

    String firstName; // default = null
    String lastName; // default = null
    String email; // default = null
    int age; // default = 0
    boolean isAdult; // default = false


    // 3. KONSTRUKTOR
    // DOMYŚLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

    // NAZWA KONSTRUKTORA JEST TAKA SAMA JAK NAZWA KLASY
    // KONSTRUKTOR PISZEMY WIELKĄ LITERĄ
    // KONSTRUKTOR NIE MA ZWRACANEGO TYPU

    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    // 2. METODY
    // OPISUJĄ CO DANY OBIEKT BĘDZIE MÓGŁ ZROBIĆ

    // Tworzenie metody -> zwracany typ + nazwa metody

    void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }
}
