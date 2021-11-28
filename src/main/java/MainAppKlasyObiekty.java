import model.User;

public class MainAppKlasyObiekty {

    public static void main(String[] args) {
        // CO TO JEST KLASA
        // Z CZEGO SKŁADA SIĘ KLASA

        // Tworzenie obiektu -> Typ nazwa = nowy obiekt;

        User bartek = new User("Bartek", "Testowy", "bartek@test.pl", 17); // wywołanie konstruktora

        bartek.getAllInfo();

        User tomek = new User("Tomek", "Brown", "tomek@brown.pl", 30);
        tomek.getAllInfo();
    }
}
