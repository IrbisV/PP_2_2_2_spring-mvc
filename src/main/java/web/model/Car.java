package web.model;

public class Car {
    private String model;
    private String vin;
    private int numberOfSeats;

    public Car() {

    }
    public Car(String model, String vin, int numberOfSeats) {
        this.model = model;
        this.vin = vin;
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
