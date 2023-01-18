package com.modeling.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modeling.api.model.CarModel;

public interface CarRepository extends JpaRepository<CarModel, Long> {

}
