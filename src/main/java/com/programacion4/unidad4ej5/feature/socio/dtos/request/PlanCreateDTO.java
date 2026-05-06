package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;

import java.util.List;

public class PlanCreateDTO {
    @Size(min=10, max=200)
    private String objetivo;

    @Min(1)
    @Max(7)
    private Integer frecuenciaSemanal;

    @DecimalMin("30.0")
    @DecimalMax("250.0")
    private Double pesoInicial;

    @DecimalMin("1.0")
    @DecimalMax("2.5")
    private Double altura;

    @NotEmpty
    @Size(min = 3)
    private List<String> ejercicios;

    //
    //Getters y setters
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Integer getFrecuenciaSemanal() {
        return frecuenciaSemanal;
    }

    public void setFrecuenciaSemanal(Integer frecuenciaSemanal) {
        this.frecuenciaSemanal = frecuenciaSemanal;
    }

    public Double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(Double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public List<String> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<String> ejercicios) {
        this.ejercicios = ejercicios;
    }
}
