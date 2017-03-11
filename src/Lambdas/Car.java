package Lambdas;

public class Car {

    private int year;
    private int km;
    private String color;
    private boolean isWorking;
    private boolean isNew;
    private boolean inPretty;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isInPretty() {
        return inPretty;
    }

    public void setInPretty(boolean inPretty) {
        this.inPretty = inPretty;
    }

    public Car(int year, int km, String color, boolean isWorking, boolean isNew, boolean inPretty) {
        this.year = year;
        this.km = km;
        this.color = color;
        this.isWorking = isWorking;
        this.isNew = isNew;
        this.inPretty = inPretty;
    }
}
