package classes;

public class Book extends Item{

    private int numberOfPages;
    private String bookCategory;

    //Konstruktor
    public Book(String title, Author author, int numberOfPages, String bookCategory, int id, Statistics statistics){
        super(title,author, id);
        this.numberOfPages = numberOfPages;
        this.bookCategory = bookCategory;
        statistics.addAllItems(this);
    }

    //Akcesory

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    //Mutatory

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setBookCategory(String bookCategory) { this.bookCategory = bookCategory; }


    @Override
    public String toString() {
        return "Ksiazka" + super.toString() + ", liczba stron=" + this.numberOfPages +  ", kategoria= " + this.bookCategory + "]";
    }

}
