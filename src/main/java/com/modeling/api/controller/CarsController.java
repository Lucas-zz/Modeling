package com.modeling.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modeling.api.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @GetMapping
    public String getCars() {
        return "List of cars";
    }

    @PostMapping
    public String createCar(@RequestBody CarDTO req) {
        System.out.println(req.anoModelo());
        return "Created";
    }
}
