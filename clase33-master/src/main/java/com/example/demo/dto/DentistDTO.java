package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DentistDTO {
    private int idDentist;
    private String name;
    private String lastName;
    private int dni;
}
