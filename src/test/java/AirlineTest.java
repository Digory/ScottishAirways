import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineTest {

    Airline airline;
    Flight flight;
    Customer customer;
    Luggage luggage;

    @Before
    public void before(){
        airline = new Airline();
        customer = new Customer("Mike", 1);
        flight = new Flight(2, 250, 2000);
        luggage = new Luggage(flight.getFlightNumber(), customer.getID(), 30);
    }

    @Test
    public void canCheckInCustomers(){
        assertEquals(true, airline.checkInCustomer(customer, flight));
    }

    @Test
    public void getSeatsAvailable_no_customers(){
        int actual = airline.getSeatsAvailable(flight);
        assertEquals(250, actual);
    }

    @Test
    public void getSeatsAvailable_one_customer(){
        airline.checkInCustomer(customer, flight);
        int actual = airline.getSeatsAvailable(flight);
        assertEquals(249, actual);
    }

    @Test
    public void canCheckInLuggage(){
        assertEquals(true, airline.checkInLuggage(luggage, flight));
    }

}
