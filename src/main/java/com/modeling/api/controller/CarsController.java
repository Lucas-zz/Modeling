package com.modeling.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modeling.api.dto.CarDTO;
import com.modeling.api.model.CarModel;
import com.modeling.api.repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<CarModel> getCars() {
        return repository.findAll();
    }

    @PostMapping
    public void createCar(@RequestBody CarDTO req) {
        repository.save(new CarModel(req));
    }
}
