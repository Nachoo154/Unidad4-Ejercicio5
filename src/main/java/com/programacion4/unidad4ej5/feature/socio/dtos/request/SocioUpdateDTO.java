package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import com.programacion4.unidad4ej5.feature.socio.dtos.validation.OnUpdate;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

public class SocioUpdateDTO {
    @NotNull(groups = OnUpdate.class)
    private Long id;
    @URL
    private String fotoUrl;
    @Size(min = 3, max = 15)
    @Pattern(regexp = "^\\S+$")
    private String alias;
    //
    //Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
