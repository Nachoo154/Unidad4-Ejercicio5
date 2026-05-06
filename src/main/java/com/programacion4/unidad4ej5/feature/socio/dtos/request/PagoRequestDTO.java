package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PagoRequestDTO {

    @DecimalMin("1000.00")
    @Digits(integer = 10, fraction = 2)
    private BigDecimal monto;

    @Pattern(regexp = "^PAY-[A-Z0-9]{4}-[A-Z0-9]{4}$")
    private String codigoTransaccion;

    @Future
    private LocalDate fechaVencimiento;

    @Pattern(regexp = "EFECTIVO|DEBITO|TRANSFERENCIA")
    private String tipopago;

    //
    //Getters y Setters
    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }
}