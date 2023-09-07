package classes;

public class CD extends Item{

    private int duration;
    private String cdCategory;

    private Statistics statistics;

    //Konstruktor
    public CD(String title, Author author, int duration, String cdCategory, int id, Statistics statistics){
        super(title,author, id);
        this.duration = duration;
        this.cdCategory = cdCategory;
        statistics.addAllItems(this);
    }

    //Akcesory


    public int getDuration() {
        return this.duration;
    }

    public String getCdCategory() {
        return this.cdCategory;
    }

    //Mutatory


    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCdCategory(String cdCategory) {
        this.cdCategory = cdCategory;
    }

    @Override
    public String toString() {
        return "CD" + super.toString() + ", czas trwania=" + this.duration +  ", kategoria= " + this.cdCategory + "]";
    }

}
