public class Bus {
    private int busNumber;
    private boolean ac;
    private int capacity;
    Bus(int busNumber, boolean ac, int capacity) {
        this.busNumber = busNumber;
        this.ac = ac;
        this.capacity = capacity;
    }
    public int getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(int newBusNumber) {
        this.busNumber = newBusNumber;
    }
    public boolean getAc() {
        return ac;
    }
    public void setAc(boolean newAc) {
        this.ac = newAc;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }
    public void displayBusInfo() {
        System.out.println("BusNumber:" + busNumber + "Ac" + ac + "Total Capacity" + capacity);
    }
}

