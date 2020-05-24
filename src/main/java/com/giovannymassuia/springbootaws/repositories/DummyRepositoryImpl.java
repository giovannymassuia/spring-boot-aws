package com.giovannymassuia.springbootaws.repositories;

import com.giovannymassuia.springbootaws.dtos.DummyDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class DummyRepositoryImpl implements DummyRepository {

    @Override
    public List<DummyDto> findAll() {

        List<DummyDto> dummyList = new ArrayList<>();

        dummyList.add(DummyDto.builder().id(UUID.randomUUID()).firstName("John").lastName("Doe").build());
        dummyList.add(DummyDto.builder().id(UUID.randomUUID()).firstName("Jone").lastName("Tre").build());
        dummyList.add(DummyDto.builder().id(UUID.randomUUID()).firstName("Daniel").lastName("Hank").build());
        dummyList.add(DummyDto.builder().id(UUID.randomUUID()).firstName("Bill").lastName("Gates").build());
        dummyList.add(DummyDto.builder().id(UUID.randomUUID()).firstName("Alex").lastName("Smith").build());

        return dummyList;
    }
}
