package com.consulta.fipe.Consulta.Fipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelosRetorno(List<DadosConsulta> modelos) {
}
