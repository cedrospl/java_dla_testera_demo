public class MainApp {

    public static void main(String[] args) {

        Bug firstBug = new Bug("Pierwsze testowe zgłoszenie", "tester@testowy.pl", 534);
        firstBug.getAllData();
        firstBug.getBugReporter();
        firstBug.getBugStatus();
        System.out.println(firstBug.getBugPriority());
    }
}
