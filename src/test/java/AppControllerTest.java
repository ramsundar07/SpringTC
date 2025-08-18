package com.ramz;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class AppControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        AppController appController = new AppController();
        mockMvc = MockMvcBuilders.standaloneSetup(appController).build();
    }

    @Test
    public void testIndex() throws Exception {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(view().name("index.jsp"));
    }
}
