package n1exercici1;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Undo.getUndo();
        System.out.println("type ''help'' for a list of commands");
        String message;
        do {
            message = Entrada.leerString("type a command");
            if (message.equals("add")) {
                String message2 = Entrada.leerString("type a command to save");
                Undo.commandAdd(message2);
            } else if (message.equals("remove")) {
                try {
                    Undo.commandDel();
                    System.out.println("Last command removed");
                } catch (NoSuchElementException e) {
                    System.out.println("The command List is empty");
                }

            } else if (message.equals("print")) {
                Undo.commandPrint();
            } else if (message.equals("help")) {
                help();
            }
        } while (!(message.equals("exit")));
        System.out.println("bye bye");
    }

    public static void help() {
        System.out.println("add: introduce a command in the command list");
        System.out.println("remove: remove a command in the command list");
        System.out.println("print: the last 4 commands");
        System.out.println("exit: finnish the program");
    }
}