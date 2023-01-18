package com.modeling.api.model;

import com.modeling.api.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class CarModel {

    public CarModel(CarDTO data) {
        this.modelo = data.modelo();
        this.fabricante = data.fabricante();
        this.dataFabricacao = data.dataFabricacao();
        this.anoModelo = data.anoModelo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 20, nullable = false)
    private String modelo;

    @Column(length = 20, nullable = false)
    private String fabricante;

    @Column(length = 20, nullable = false)
    private String dataFabricacao;

    @Column(length = 20, nullable = false)
    private int anoModelo;
}
