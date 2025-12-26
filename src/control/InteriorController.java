/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import model.modeel;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class InteriorController {
    private ArrayList<modeel> itemList = new ArrayList<>();

    // ADD ITEM
    public void addItem(modeel item) {
        itemList.add(item);
    }

    // UPDATE ITEM
    public boolean updateItem(modeel updatedItem) {
        for (modeel item : itemList) {
            if (item.getItemId().equals(updatedItem.getItemId())) {
                item.setItemName(updatedItem.getItemName());
                item.setItemPrice(updatedItem.getItemPrice());
                item.setItemCategory(updatedItem.getItemCategory());
                return true;
            }
        }
        return false;
    }

    // DELETE ITEM
    public boolean deleteItem(String itemId) {
        for (modeel item : itemList) {
            if (item.getItemId().equals(itemId)) {
                itemList.remove(item);
                return true;
            }
        }
        return false;
    }

    // GET ALL ITEMS (for JTable)
    public ArrayList<modeel> getAllItems() {
        return itemList;
    }
}

