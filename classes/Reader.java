package classes;

import java.util.ArrayList;

public class Reader extends People {
    private String cardNum;
    private ArrayList<Item> rentedItems;

    //Konstruktor

    public Reader(String name, String surname,int age, String cardNum){
        super(name,surname, age);
        this.cardNum = cardNum;
        rentedItems = new ArrayList<Item>();
    }


    //Akcesory (gettery)


    public String getCardNum() {
        return cardNum;
    }

    public ArrayList<Item> getRentedItems() {
        return rentedItems;
    }

    //Mutatory (settery)

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    //metoda "wypożycz"

    public void rentItem(Item item){
        rentedItems.add(item);
    }

    //metoda "zwróć"

    public void returnItem(Item item) {
        rentedItems.remove(item);
    }

    public boolean ifRented(){
        return !rentedItems.isEmpty();
    }



    @Override
    public String toString() {
        return "Czytelnik [imie=" + this.getName() + ", nazwisko=" + this.getSurname() +  ", numerKarty=" + cardNum + ", wypozyczone przedmioty=" + rentedItems + "]";
    }
}


