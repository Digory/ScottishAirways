public class Airline {

    public boolean checkInCustomer(Customer customer, Flight flight){
        return flight.addCustomer(customer);
    }

    public int getSeatsAvailable(Flight flight){
        return flight.getCapacity()  - flight.getCustomers().size();
    }

    public boolean checkInLuggage(Luggage luggage, Flight flight){
        return flight.addLuggage(luggage);
    }

}
