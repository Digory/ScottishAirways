public class Luggage {

    private int flightID;
    private int customerID;
    private double weight;

    public Luggage(int flightID, int customerID, double weight) {
        this.flightID = flightID;
        this.customerID = customerID;
        this.weight = weight;
    }

    public int getFlightID() {
        return flightID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public double getWeight() {
        return weight;
    }

}
