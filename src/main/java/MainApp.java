import model.Bug;

public class MainApp {

    public static void main(String[] args) {

        Bug firstBug = new Bug("Pierwsze testowe zgłoszenie", "tester@testowy.pl", 534);
        firstBug.getAllData();
        firstBug.getBugReporter();
        firstBug.getBugStatus();
        System.out.println(firstBug.getBugPriority());

        System.out.println(firstBug.getBugReportersemail());
        firstBug.setBugReportersemail("aaaaa@bbbbb.cccc");
        System.out.println(firstBug.getBugReportersemail());

        System.out.println(firstBug.getBugPriority());
        firstBug.setBugPriority(89);
        System.out.println(firstBug.getBugPriority());
    }

}
