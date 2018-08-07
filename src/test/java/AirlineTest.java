import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AirlineTest {

    Airline airline;
    Flight flight;
    Customer customer;

    @Before
    public void before(){
        airline = new Airline();
        customer = new Customer("Mike");
        flight = new Flight(2, 250);
    }

    @Test
    public void canCheckIn(){
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
}
