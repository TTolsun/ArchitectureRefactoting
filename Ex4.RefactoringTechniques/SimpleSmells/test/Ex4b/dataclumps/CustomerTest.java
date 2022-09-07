package Ex4b.dataclumps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    public void addressSummaryIncludesHouseStreetCityPostCodeCountry() throws Exception {
        Customer customer = new Customer();
        Address address = new Address();
        address.setHouse("55");
        address.setStreet("Hanyang-ro");
        address.setCity("Ansan");
        address.setPostcode("15588");
        address.setCountry("Korea");
        assertEquals("55, Hanyang-ro, Ansan, 15588, Korea", customer.getAddressSummary());
    }
}
