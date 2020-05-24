package com.giovannymassuia.springbootaws.repositories;

import com.giovannymassuia.springbootaws.dtos.DummyDto;

import java.util.List;

public interface DummyRepository {

    List<DummyDto> findAll();

}
