package Products.model;

import java.util.ArrayList;
import java.util.HashSet;

import javafx.scene.layout.Pane;

public class Cart {
    
    private ArrayList<Pane> items = new ArrayList<>();

    public void addItem(Pane pane) {
        
        if (!items.contains(pane)) {
            items.add(pane);
        }
        
    }

    public void showItems() {
        System.out.println(items);
    }

    public ArrayList<Pane> getItemList() {
        return items;
    }

}