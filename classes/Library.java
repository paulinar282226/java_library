package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Library implements RentMethods {
    private ArrayList<People> people;
    private ArrayList<Rent> rents;
    private Statistics statistics;

    public Library(){
        this.people = new ArrayList<People>();
        this.rents = new ArrayList<Rent>();
        this.statistics = new Statistics();
    }

    public Library(ArrayList<People> people, ArrayList<Rent> rents, Statistics statistics){
        this.people = people;
        this.rents = rents;
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public ArrayList<Rent> getRents() {
        return rents;
    }

    @Override
    public int rentItem(Item item, Reader reader) {
        if(item.ifAvailable()){
            Rent rent = new Rent(reader, item, 30);
            this.rents.add(rent);
            item.setAvailable(false);
            statistics.addRent(rent);
            statistics.addReader(reader);
            return rent.getRentID();
        } else {
            throw new IllegalArgumentException();
        }
    }


    @Override
    public void returnItem(Rent rent) {
        if(this.rents.contains(rent)){
            rent.getItem().setAvailable(true);
            rent.setReturned(true);
            rents.remove(rent);
        }
    }

    public long getDiff(Rent rent){
        long returnDate = rent.getRentDate().getTime() + TimeUnit.MILLISECONDS.convert(30, TimeUnit.DAYS);
        Date today = new Date();
        long diff = returnDate - today.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public void countPenalty(Rent rent) {
        long diff = this.getDiff(rent);
        if (diff < 0){
            rent.setPenalty(true);
            rent.setPenaltyAmount(40);
        }
    }

    public Rent getRentById(int id) {
        for (Rent rent : rents) {
            if (rent.getRentID() == id) {
                return rent;
            }
        }
        return null;
    }

    public String toString() {
        return "classes.Library{people=" + this.people +
                ", rents=" + this.rents +
                ", statistics=" + this.statistics +
                '}';
    }


}
