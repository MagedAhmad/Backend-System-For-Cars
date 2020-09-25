package com.udacity.pricing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PricingServiceApplicationTests {
	@Autowired
	private MockMvc mvc;

	@Test
	public void contextLoads() {
	}

	@Test
    public void testGetPriceRequest() throws Exception {
        mvc.perform(
                get("/services/price?vehicleId=1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
