import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customers;
    private ArrayList<Luggage> bags;
    private int capacity;
    private double bagWeightCapacity;
    private int flightNumber;

    public Flight(int flightNumber, int capacity, double bagWeightCapacity){
        customers = new ArrayList<>();
        bags = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.bagWeightCapacity = bagWeightCapacity;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public ArrayList<Luggage> getBags() {
        return this.bags;
    }

    public boolean addCustomer(Customer customer){
        if(customers.size() < capacity){
            customers.add(customer);
            return true;
        }
        else{
            return false;
        }
    }

    public double getLuggageCapacityRemaining(){
        return (1-(getWeightOfBagsCheckedIn()/bagWeightCapacity))*100;
    }

    public boolean addLuggage(Luggage luggage){
        if ((luggage.getWeight() + getWeightOfBagsCheckedIn()) <= this.bagWeightCapacity) {
            bags.add(luggage);
            return true;
        }
        return false;
    }

    public double getWeightOfBagsCheckedIn(){
        double weightTotal = 0;
        for(Luggage bag : bags ){
            weightTotal += bag.getWeight();
        }
        return weightTotal;
    }







}
