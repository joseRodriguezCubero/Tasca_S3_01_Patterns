package n2exercici1.main;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Menu.choseMenu(agenda.getEntries());
    }
}
