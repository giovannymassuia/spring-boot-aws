package com.giovannymassuia.springbootaws.controllers;

import com.giovannymassuia.springbootaws.dtos.DummyDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Dummy Controller Integration Test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DummyControllerIT {

    @Autowired
    TestRestTemplate testRestTemplate;

    @DisplayName("Should be able to return a list of dummy data")
    @Test
    void testFindAll(){
        List<DummyDto> returnedList = testRestTemplate.getForObject("/dummy", List.class);

        assertThat(returnedList).hasSize(5);
    }

}
