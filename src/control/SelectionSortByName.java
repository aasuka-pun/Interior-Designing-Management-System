/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.util.List;
import model.modeel;

/**
 *
 * @author Acer
 */
public class SelectionSortByName {
    

    public void sort(List<modeel> itemList) {

        int n = itemList.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (itemList.get(j).getItemName()
                        .compareToIgnoreCase(itemList.get(minIndex).getItemName()) < 0) {
                    minIndex = j;
                }
            }

            // swap
            modeel temp = itemList.get(i);
            itemList.set(i, itemList.get(minIndex));
            itemList.set(minIndex, temp);
        }
    }
}


