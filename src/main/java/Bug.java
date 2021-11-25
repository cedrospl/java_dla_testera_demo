public class Bug {
    // POLA OBIEKTU
    // - opis błędu
    // - adres email osoby zgłaszającej błąd
    // - priorytet błędu (1-5)
    // - status błędu (otwarty zamknięty) - domyślnie, podczas tworzenia zawsze otwarty

    // KONSTRUKTOR

    // METODY
    // - pokaż wszystkie informacje na temat błędu
    // - pokaż osobe zgłaszającą błąd
    // - pokaż status błędu
    // - zwróć priorytet błędu
    String bugDescription;
    String bugReportersemail;
    int bugPriority;
    String bugStatus;
    String bugOpened = "otwarty";
    String bugClosed = "zamknięty";

    Bug(String bugDescription, String bugReportersemail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReportersemail = bugReportersemail;
        this.bugPriority = isBugSevereOrNot();
        this.bugStatus = bugOpened;
    }

    void getAllData() {
        System.out.println(bugDescription + " " + bugReportersemail + " " + bugPriority + " " + bugStatus);
    }

    void getBugReporter() {
        System.out.println(bugReportersemail);
    }

    void getBugStatus() {
        System.out.println(bugStatus);
    }

    int getBugPriority() {
        return bugPriority;
    }

    int isBugSevereOrNot() {
        if (bugPriority >= 1 && bugPriority <= 5) {
            return bugPriority;
        }
        if (bugPriority < 1) {
            return 1;
        } else {
            return 5;
        }
    }
}

