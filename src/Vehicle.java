public class Vehicle {

    private boolean isOperable;
    private int PassengerCapacity;
    private String powerSource;


    public Vehicle() {
    }

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource) {
        this.isOperable = isOperable;
        PassengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public boolean isOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

    public int getPassengerCapacity() {
        return PassengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        PassengerCapacity = passengerCapacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void turnOn(){
        System.out.println("Vehicle is turning on... ");

//    public Vehicle turnOn();

    }
}
