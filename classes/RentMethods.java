package classes;

public interface RentMethods {
    int rentItem(Item item, Reader reader);
    void returnItem(Rent rent);
    void countPenalty(Rent rent);
}
