package org.example;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<String> items = new ArrayList<>();

    public void add(String item) {
        if (item != null && !item.trim().isEmpty()) {
            items.add(item.trim());
        }
    }

    public boolean remove(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return true;
        }
        return false;
    }

    public List<String> getAll() {
        return new ArrayList<>(items);
    }

    public int size() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public boolean markDone(int index) {
        if (index >= 0 && index < items.size()) {
            // Простая реализация: добавляем "[x]" к задаче
            String task = items.get(index);
            if (!task.startsWith("[x] ")) {
                items.set(index, "[x] " + task);
            }
            return true;
        }
        return false;
    }

    public List<String> search(String query) {
        List<String> results = new ArrayList<>();
        for (String item : items) {
            if (item.toLowerCase().contains(query.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }
}