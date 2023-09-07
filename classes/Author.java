package classes;

import java.util.ArrayList;

public class Author extends People {
    private ArrayList<Item> items;

    // Konstruktor
    public Author(String name, String surname, int age){
        super(name, surname, age);
        this.items = new ArrayList<Item>();
    }


    public ArrayList<Item> getBooks() {
        return items;
    }

    //metoda dodaj ksiazke
    public void addItem(Item item){
        if (!items.contains(item)){
        items.add(item);}
    }

    //metoda usun ksiazke
    public void removeItem(Item item){
        items.remove(item);
    }


    @Override
    public String toString() {
        return "Autor [imie=" + this.getName() + ", nazwisko=" + this.getSurname() + ", dzieła=" + items + "]";
    }

}
