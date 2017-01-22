package com.bootcamp.controllers;

import static org.hamcrest.Matchers.equalTo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.javabootcamp.Application;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration (classes= Application.class)
@AutoConfigureMockMvc
public class StockControllerTest {


    @Autowired
    private MockMvc mvc;

    @Test
    public void getHealth() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/health").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Ok")));
    }
    
    @Test
    public void getStocks() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders
                .get("/stocks/British")
                .accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk())
        		.andReturn();
        
        String str = result.getResponse().getContentAsString();
      
        Assert.assertTrue(str.contains("British"));
    }
}