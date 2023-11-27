package n1exercici1;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;

    private static final List<String> commandList = new ArrayList<String>();

    private Undo() {
    }

    public static Undo getUndo() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public static void commandAdd(String s) {
        commandList.add(s);
    }

    public static void commandDel(String s) {
        commandList.removeIf(s::equals);
    }

    public static void commandPrint() {
        System.out.println("Últimos 4 comandos introducidos");
        int i = 0;
        do {
            System.out.println(commandList.get(i));
            i++;
        } while (i < 4 && i < commandList.size());
    }
}

