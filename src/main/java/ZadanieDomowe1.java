public class ZadanieDomowe1 {

    // 1. 4 zmienne typu int.
    // 2. Sprawdzamy czy suma dwóch pierwszych jest parzysta.
    // 3. Sprawdzamy czy suma dwóch pozostałych jest parzysta.
    // 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste.

    public static void main(String[] args) {
        int number1 = 342423;
        int number2 = 41232;
        int number3 = 5422;
        int number4 = 34246;

        int firstSum = number1 + number2;
        int secondSum = number3 + number4;

        System.out.println(firstSum);
        System.out.println(secondSum);

        if (firstSum % 2 == 0 && secondSum % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste!");
        } else {
            System.out.println("Nie wszystkie liczby są parzyste :(");
        }
    }


}
