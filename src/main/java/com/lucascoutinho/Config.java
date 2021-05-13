package com.lucascoutinho;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class Config {
    @ConfigProperty(name = "formatoRelatorios")
    private String formatoRelatorios = "pdf";

    @ConfigProperty(name = "tiposGraficos")
    private String tiposGraficos = "barras";

    public String getFormatoRelatorios() {
        return formatoRelatorios;
    }

    public String setFormatoRelatorios(String valor) {
        return this.formatoRelatorios = valor;
    }

    public String getTiposGraficos() {
        return tiposGraficos;
    }

    public String setTiposGraficos(String valor) {
        return this.tiposGraficos = valor;
    }
}