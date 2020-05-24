package com.giovannymassuia.springbootaws.services;

import com.giovannymassuia.springbootaws.dtos.DummyDto;
import com.giovannymassuia.springbootaws.repositories.DummyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DummyServiceImpl implements DummyService {

    private final DummyRepository dummyRepository;

    @Override
    public List<DummyDto> findAll() {
        return this.dummyRepository.findAll();
    }

}
