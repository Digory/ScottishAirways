import java.util.ArrayList;

public class Flight {

    private ArrayList<Customer> customers;
    private int capacity;
    private int flightNumber;


    public Flight(int flightNumber, int capacity){
        customers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.capacity = capacity;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }


    public ArrayList<Customer> getCustomers()
    {
        return this.customers;
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
}
