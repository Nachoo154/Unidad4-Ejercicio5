package com.programacion4.unidad4ej5.feature.socio.dtos.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

public class AdultValidator implements ConstraintValidator <Adult, LocalDate> {
    @Override
    public boolean isValid(LocalDate fechaNacimiento, ConstraintValidatorContext context){

       int edad= Period.between(fechaNacimiento, LocalDate.now()).getYears();

       return edad>=18;

    }
}
