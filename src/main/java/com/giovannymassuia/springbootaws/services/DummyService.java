package com.giovannymassuia.springbootaws.services;

import com.giovannymassuia.springbootaws.dtos.DummyDto;

import java.util.List;

public interface DummyService {

    List<DummyDto> findAll();

}
