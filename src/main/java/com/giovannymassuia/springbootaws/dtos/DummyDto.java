package com.giovannymassuia.springbootaws.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DummyDto {

    private UUID id;
    private String firstName;
    private String lastName;


}
