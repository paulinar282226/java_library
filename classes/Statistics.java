package classes;

import java.util.*;

public class Statistics {
    private  Map<String, Integer> itemRentCount;
    private  Map<Reader, Integer> readerRentCount;

    private HashSet<Item> allItems;


    public Statistics() {
        itemRentCount = new HashMap<>();
        readerRentCount = new HashMap<>();
        allItems = new HashSet<>();
    }

    public Map<String, Integer> getItemRentCount() {
        return itemRentCount;
    }

    public HashSet<Item> getAllItems() {
        return allItems;
    }

    public Map<Reader, Integer> getReaderRentCount() {
        return readerRentCount;
    }

    public void addRent(Rent rent) {
        Item item = rent.getItem();
        String key = item.getTitle() + item.getAuthor();
        if (itemRentCount.containsKey(key)) {
            itemRentCount.put(key, itemRentCount.get(key) + 1);
        } else {
            itemRentCount.put(key, 1);
        }
    }

    public void addReader(Reader reader) {
        if (readerRentCount.containsKey(reader)) {
            readerRentCount.put(reader, readerRentCount.get(reader) + 1);
        } else {
            readerRentCount.put(reader, 1);
        }
    }

    public String getMostRentedItem() {
        String mostRentedItem = "";
        int maxRentCount = 0;
        for (Map.Entry<String, Integer> entry : itemRentCount.entrySet()) {
            if (entry.getValue() > maxRentCount) {
                maxRentCount = entry.getValue();
                mostRentedItem = String.valueOf(entry.getKey());
            }
        }
        return mostRentedItem;
    }

    public String getMostActiveReader() {
        String mostActiveReader = "";
        int maxRentsCount = 0;
        for (Map.Entry<Reader, Integer> entry : readerRentCount.entrySet()) {
            if (entry.getValue() > maxRentsCount) {
                maxRentsCount = entry.getValue();
                mostActiveReader = String.valueOf(entry.getKey());
            }
        }
        return mostActiveReader;
    }

    public void addAllItems(Item item){
        allItems.add(item);
    }


    public void addItem(Item item){
        String key = item.getTitle() + item.getAuthor();
        if(itemRentCount.containsKey(key)){
            itemRentCount.put(key, itemRentCount.get(key) + 1);
        }else{
            itemRentCount.put(key, 1);
        }
    }

    public List<Item> getBooksNeverRented(){
        List<Item> neverRentedBooks = new ArrayList<>();
        for(Item item : allItems){
            String key = item.getTitle() + item.getAuthor();
            if(!itemRentCount.containsKey(key)){
                neverRentedBooks.add(item);
            }
        }
        return neverRentedBooks;
    }








}