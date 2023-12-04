package n2exercici1.main;

import java.util.Map;
import java.util.TreeMap;

public class Agenda {
    private final Map<String, String> entries;

    public Agenda() {
        this.entries = new TreeMap<>();
    }

    public Map<String, String> getEntries() {
        return entries;
    }
}
