package com.programacion4.unidad4ej5.feature.socio.dtos.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AdultValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Adult {

    String message() default "El socio debe ser mayor de 18 años";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}