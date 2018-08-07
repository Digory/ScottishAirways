import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Customer mike;
    private Customer raphael;
    private Customer molly;

    @Before
    public void before(){
        flight = new Flight(1, 2);
        Customer mike = new Customer("Mike");
        Customer raphael = new Customer("Raphael");
        Customer molly = new Customer("Molly");
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.getCustomers().size());
    }

    @Test
    public void getCapacity(){
        assertEquals(2, flight.getCapacity());
    }

    @Test
    public void getFlightNumber(){
        assertEquals(1, flight.getFlightNumber());
    }

    @Test
    public void addCustomer_returns_true(){
        boolean actual = flight.addCustomer(molly);
        assertEquals(true, actual);
    }

    @Test
    public void addCustomer_returns_false(){
        flight.addCustomer(mike);
        flight.addCustomer(raphael);
        boolean actual = flight.addCustomer(molly);
        assertEquals(false, actual);
    }
}
