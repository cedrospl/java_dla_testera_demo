package model;

public class User {

    // 1. POLA OBIEKTU
    // OPISUJĄ Z CZEGO BĘDZIE SKŁADAŁ SIĘ DANY OBIEKT

    private String firstName; // default = null
    private String lastName; // default = null
    private String email; // default = null
    private int age; // default = 0
    private boolean isAdult; // default = false


    // 3. KONSTRUKTOR
    // DOMYŚLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

    // NAZWA KONSTRUKTORA JEST TAKA SAMA JAK NAZWA KLASY
    // KONSTRUKTOR PISZEMY WIELKĄ LITERĄ
    // KONSTRUKTOR NIE MA ZWRACANEGO TYPU

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.endsWith(".ru")) {
            System.out.println("RU emails are not allowed");
        } else {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    // 2. METODY
    // OPISUJĄ CO DANY OBIEKT BĘDZIE MÓGŁ ZROBIĆ

    // Tworzenie metody -> zwracany typ + nazwa metody

    public void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you!");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    public int yourAgePlus10(int userAge) {
        return userAge + 10;
    }
}
