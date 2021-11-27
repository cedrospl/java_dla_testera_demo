package model;

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
    private String bugDescription;
    private String bugReportersemail;
    private int bugPriority;
    private String bugStatus;
    private String bugOpened = "otwarty";
    private String bugClosed = "zamknięty";

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Bug description cannot be so short!");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getBugReportersemail() {
        return bugReportersemail;
    }

    public void setBugReportersemail(String bugReportersemail) {
        if (bugReportersemail.contains("@") && bugReportersemail.contains(".")) {
            this.bugReportersemail = bugReportersemail;
        } else {
            System.out.println("Email should contain '@' and '.' signs!");
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if (bugPriority >= 5) {
            this.bugPriority = 5;
        }
        else if (bugPriority <= 1) {
            this.bugPriority = 1;
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        this.bugStatus = bugStatus;
    }

    public Bug(String bugDescription, String bugReportersemail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReportersemail = bugReportersemail;
        this.bugPriority = bugPriority;
        this.bugStatus = bugOpened;
    }

    public void getAllData() {
        System.out.println(bugDescription + " " + bugReportersemail + " " + bugPriority + " " + bugStatus);
    }

    public void getBugReporter() {
        System.out.println(bugReportersemail);
    }
}

