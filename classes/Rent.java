package classes;

import java.util.Date;

public class Rent {
    private static int latestId = 1;
    private final Item item;
    private final Reader reader;
    private final Date rentDate;
    private int daysToReturn;
    private final int rentID;
    private boolean returned;
    private boolean penalty;

    private double penaltyAmount;

    public Rent(Reader reader, Item item, int daysToReturn){
        this.reader = reader;
        this.rentDate = new Date();
        this.daysToReturn = daysToReturn;
        this.rentID = latestId;
        this.returned = false;
        this.penalty = false;
        this.penaltyAmount = 0;
        this.item = item;

        latestId +=1;
    }

    public Item getItem() {
        return item;
    }

    public Reader getReader() {
        return reader;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public int getRentID() {
        return rentID;
    }

    public int getDaysToReturn() {
        return daysToReturn;
    }

    public boolean isReturned() {
        return returned;
    }

    public boolean isPenalty() {
        return penalty;
    }

    public double getPenaltyAmount() {
        return penaltyAmount;
    }

    public static int getLatestId() {
        return latestId;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public void setDaysToReturn(int daysToReturn) {
        this.daysToReturn = daysToReturn;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }

    public void setPenaltyAmount(double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    @Override
    public String toString() {
        return "classes.Rent ID: " + rentID + "\n" +
                "classes.Reader: " + reader + "\n" +
                "classes.Item: " + item + "\n" +
                "classes.Rent date: " + rentDate + "\n" +
                "Days to return: " + daysToReturn + "\n" +
                "Returned: " + returned + "\n" +
                "Penalty: " + penalty + "\n" +
                "Penalty amount: " + penaltyAmount + "\n";
    }
}



