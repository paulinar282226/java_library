package classes;

public abstract class Item implements Comparable<Item>{
    private String title;
    private Author author;
    private boolean available;

    private final int id;

    public Item(String title, Author author, int id){
        this.title = title;
        this.author = author;
        this.available = true;
        this.id = id;
    }
    public final String getTitle() {
        return title;
    }

    public final Author getAuthor() {
        return author;
    }

    public final int getId() {
        return id;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public final boolean ifAvailable() {
        return available;
    }

    public final void setTitle(String title){
        this.title = title;
    }

    public final void setAuthor(Author author) {
        this.author = author;
    }


    @Override
    public int compareTo(Item other) {
        int result = this.getAuthor().getSurname().compareTo(other.getAuthor().getSurname());
        if (result == 0) {
            result = this.getTitle().compareTo(other.getTitle());
        }
        return result;

    }

    @Override
    public String toString() {
        return " [tytul=" + this.getTitle() + ", autor=" + this.getAuthor().getSurname() + ", dostepna=" + this.ifAvailable();
    }

}
