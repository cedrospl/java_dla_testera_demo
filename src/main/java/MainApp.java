public class MainApp {

    public static void main(String[] args) {

        Bug firstBug = new Bug("Pierwsze testowe zgłoszenie", "tester@testowy.pl", 534, "chybaTy");
        firstBug.getAllData();
        firstBug.getBugReporter();
        firstBug.getBugStatus();
        System.out.println(firstBug.getBugPriority());
    }
}
