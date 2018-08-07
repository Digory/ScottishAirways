import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Customer mike;
    private Customer raphael;
    private Customer molly;
    private Luggage mikebag;
    private Luggage mollybag;
    private Luggage raphaelbag;

    @Before
    public void before(){
        flight = new Flight(1, 2, 1000);
        mike = new Customer("Mike", 1);
        raphael = new Customer("Raphael", 2);
        molly = new Customer("Molly", 3);
        mikebag = new Luggage(flight.getFlightNumber(), mike.getID(), 10 );
        mollybag = new Luggage(flight.getFlightNumber(), molly.getID(), 50 );
        raphaelbag = new Luggage(flight.getFlightNumber(), raphael.getID(), 30 );
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

    @Test
    public void testGetWeightOfBagsCheckedIn(){
        flight.addLuggage(mollybag);
        flight.addLuggage(mikebag);
        flight.addLuggage(raphaelbag);
        assertEquals(90, flight.getWeightOfBagsCheckedIn(),0);
    }

    @Test
    public void addBag_returns_true(){
        boolean actual = flight.addLuggage(mollybag);
        assertEquals(true, actual);
    }

    @Test
    public void addBag_returns_false(){
        flight = new Flight(1, 2, 10);
        boolean actual = flight.addLuggage(mollybag);
        assertEquals(false, actual);
    }


}
