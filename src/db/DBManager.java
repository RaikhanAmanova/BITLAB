package db;

import model.Item;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Item> itemArrayList = new ArrayList<>();

    static {
        itemArrayList.add(new Item(1L, "Iphone 13Pro Max", 300000, 20));
        itemArrayList.add(new Item(2L, "Iphone 14Pro Max", 400000, 40 ));
        itemArrayList.add(new Item(3L, "Samsung S8", 30000, 10));


    }

    public static ArrayList<Item> getAllItems() {
        return itemArrayList;
    }

    public static Item getItemById(Long id) {
        for(Item item: itemArrayList){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }
    public static void deleteItem(Long id){
        for (int i = 0; i < itemArrayList.size(); i++) {
            if(itemArrayList.get(i).getId()==id){
                itemArrayList.remove(i);
                break;
            }
        }
    }

    public static Item updateItem(Item item) {
        for (int i = 0; i < itemArrayList.size(); i++) {
            if(item.getId()==itemArrayList.get(i).getId()){
                itemArrayList.set(i, item);
                return item;
            }
        }
        return null;
    }
    public static void addItem(Item item){

        itemArrayList.add(item);
    }
}
