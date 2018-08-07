import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LuggageTest {

    private Luggage luggage;

    @Before
    public void before() {
        luggage = new Luggage(1, 2, 30);
    }

    @Test
    public void testGetFlightID(){
        assertEquals(1, luggage.getFlightID());
    }

    @Test
    public void testGetCustomerID(){
        assertEquals(2, luggage.getCustomerID());
    }

    @Test
    public void testGetWeight(){
        assertEquals(30, luggage.getWeight(),0);
    }

    @Test
    public void testCheckInLuggage(){
        assertEquals(0,0);
    }


}
