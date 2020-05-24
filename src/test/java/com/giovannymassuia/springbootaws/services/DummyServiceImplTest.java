package com.giovannymassuia.springbootaws.services;

import com.giovannymassuia.springbootaws.dtos.DummyDto;
import com.giovannymassuia.springbootaws.repositories.DummyRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class DummyServiceImplTest {

    @Mock
    DummyRepository dummyRepository;

    @InjectMocks
    DummyServiceImpl service;

    @DisplayName("Should be able to return a list of dummy data")
    @Test
    void findAll() {
        //given
        given(dummyRepository.findAll()).willReturn(Arrays.asList(
                DummyDto.builder().id(UUID.randomUUID()).firstName("John").lastName("Doe").build(),
                DummyDto.builder().id(UUID.randomUUID()).firstName("Jone").lastName("Tre").build()
        ));

        //when
        List<DummyDto> returnedList = service.findAll();

        //then
        then(dummyRepository).should().findAll();
        assertThat(returnedList).hasSize(2);
        assertThat(returnedList.get(0)).hasFieldOrPropertyWithValue("firstName", "John");
    }
}
