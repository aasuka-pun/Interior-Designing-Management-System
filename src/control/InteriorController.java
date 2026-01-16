package control;

import java.util.ArrayList;
import model.modeel;

public class InteriorController {

    // 🔥 ONE shared list for whole app
    private static final ArrayList<modeel> items = new ArrayList<>();
    private static boolean initialized = false;

    public InteriorController() {
        // Load default items ONLY ONCE
        if (!initialized) {
            items.add(new modeel("101", "Sofa", 2000, "Furniture"));
            items.add(new modeel("102", "Dining Table", 3000, "Furniture"));
            items.add(new modeel("103", "Snake Plant", 400, "Plant"));
            items.add(new modeel("104", "Lily", 500, "Plant"));
            items.add(new modeel("105", "Palm Plant", 300, "Plant"));
            initialized = true;
        }
    }

    // ===== CRUD METHODS =====

    public ArrayList<modeel> getAllItems() {
        return items;
    }

    public void addItem(modeel item) {
        items.add(item);
    }

    public void updateItem(int index, modeel updatedItem) {
        items.set(index, updatedItem);
    }

    public void deleteItem(int index) {
        items.remove(index);
    }
}
