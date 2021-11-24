public class MainAppTypyDanych {

    public static void main(String[] args) {

        // liczby całkowite

        // typy proste

        //byte b;
        //short s;
        //int i;
        //long l;

        int number = 10;
        System.out.println(number);

        // liczby zmiennoprzecinkowe

        //float f;
        //double d;

        double doubleNumber = 10.5;
        System.out.println(doubleNumber);

        // tekst
        // typ złożony/referencyjny
        String someText = "tekst w javie";
        System.out.println(someText);

        // znak
        char someChar = 'a';
        System.out.println(someChar);

        // prawda
        boolean trueValue = true;
        System.out.println(trueValue);

        // fałsz
        boolean falseValue = false;
        System.out.println(falseValue);

        // operatory matematyczne
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        double a = 10;
        double b = 4;
        System.out.println(10 / 4);
        System.out.println(a / b);

        // operatory porównania
        int numOne = 10;
        int numTwo = 2;

        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        // operatory logiczne
        // || - lub
        System.out.println(numOne > numTwo || numOne == 1);
        System.out.println(numOne > numTwo || numOne != 1);
        System.out.println(numOne < numTwo || numOne != 1);

        // && - i
        System.out.println(numOne < numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne != 1);

        // instrukcje sterujące
//        if(numOne < numTwo){
//            System.out.println("number one is less than number two");
//        } else {
//            System.out.println("number one is greater than number two");
//        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "Jakaś strona";

        switch (page) {
            case "Home":
                System.out.println("Przełączam się do strony Home");
                break;
            case "Login":
                System.out.println("Przełączam się do strony Login");
                break;
            case "Contact":
                System.out.println("Przełączam się do strony Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }

        // Operator modulo - reszta z dzielenia
        System.out.println(10 % 5);
        System.out.println(10 % 3);
        System.out.println(10 % 4);

        if (9 % 2 == 0) {
            System.out.println("jest liczbą parzystą");
        } else {
            System.out.println("nie jest liczbą parzystą");
        }
    }

}
