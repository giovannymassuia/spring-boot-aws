package com.giovannymassuia.springbootaws.controllers;

import com.giovannymassuia.springbootaws.dtos.DummyDto;
import com.giovannymassuia.springbootaws.services.DummyService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Arrays;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DummyController.class)
class DummyControllerTest {

    @MockBean
    DummyService dummyService;

    @Autowired
    MockMvc mockMvc;

    @DisplayName("Should be able to return a list of dummy data")
    @Test
    void findAll() throws Exception {
        given(dummyService.findAll()).willReturn(Arrays.asList(
                DummyDto.builder().id(UUID.randomUUID()).firstName("John").lastName("Doe").build(),
                DummyDto.builder().id(UUID.randomUUID()).firstName("Jone").lastName("Tre").build()
        ));

        mockMvc.perform(get("/dummy"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("[0].firstName", is("John")))
                .andReturn();
    }
}
