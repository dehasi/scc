package me.greet.greet;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import me.greet.greet.controllers.GreetController;
import org.junit.Before;

public class MvcTest {
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new GreetController());
    }
}
