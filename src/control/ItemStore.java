package control;

import model.modeel;
import java.util.ArrayList;

public class ItemStore {

    // ✅ Single shared controller
    private static InteriorController controller = new InteriorController();

    // Preload default items (only if controller is empty)
    static {
        if (controller.getAllItems().isEmpty()) {
            controller.addItem(new modeel("101", "Sofa", 50000, "Furniture"));
            controller.addItem(new modeel("102", "Dining Table", 42000, "Furniture"));
            controller.addItem(new modeel("103", "Snake Plant", 400, "Plant"));
            controller.addItem(new modeel("103", "Lily", 500, "Plant"));
             controller.addItem(new modeel("103", "Palm Plant", 300, "Plant"));
        }
    }

    // Method to get the shared controller
    public static InteriorController getController() {
        return controller;
    }

    // Shortcut to get all items directly
    public static ArrayList<modeel> getItems() {
        return controller.getAllItems();
    }
}
