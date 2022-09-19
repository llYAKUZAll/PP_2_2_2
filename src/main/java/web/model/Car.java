package web.model;

public class Car {

    private String vehicle;
    private String color;
    private int speed;

    public Car() {
    }

    public Car(String vehicle, String color, int speed) {
        this.vehicle = vehicle;
        this.speed = speed;
        this.color = color;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
