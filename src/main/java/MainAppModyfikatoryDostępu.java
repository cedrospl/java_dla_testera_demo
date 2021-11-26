import model.User;

public class MainAppModyfikatoryDostępu {

    public static void main(String[] args) {

//        String str1 = "Hello";
//        String str2 = "hello";
        // METODY WYKONYWANE NA STRINGACH
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//
//        String s = str1.toUpperCase();
//        System.out.println(s);
//        String s1 = str1.toLowerCase();
//        System.out.println(s1);
//
//        boolean startsWith = str1.startsWith("He");
//        System.out.println(startsWith);
//        System.out.println(str1.endsWith("lo"));
//        System.out.println(str1.contains("ll"));
//
//        System.out.println("          b".isBlank());
//        System.out.println(" ".isEmpty());
//
//        String replace = str1.replace("llo", "QWE");
//        System.out.println(replace);
//
//        String s = str1.replaceAll("l", "x");
//        System.out.println(s);
//
//        String substring = str1.substring(1, 4);
//        System.out.println(substring);
//
//        String textWithWhiteSpaces = "    to jest jakiś tekst   ";
//        System.out.println(textWithWhiteSpaces.length());
//
//        String strip = textWithWhiteSpaces.strip();
//        System.out.println(strip);
//        System.out.println(strip.length());

        // MODYFIKATORY DOSTĘPU - access modifiers

        // DOMYŚLNY - działa w obrębie jednego pakietu
        // PUBLICZNY - dostęp w całym projekcie
        // PROTECTED -
        // PRIVATE - dostęp do pola lub metody w obrębie danej klasy

        User user1 = new User("Bartek", "Testowy", "bk@test.com", 17);

        System.out.println(user1.getEmail());

        user1.setEmail("bartek@javadlatestera.ru");

        System.out.println(user1.getEmail());
    }
}
