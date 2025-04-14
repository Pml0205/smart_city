package com.example.cv_auth.controller;

import com.example.cv_auth.model.TouristSpot;
import com.example.cv_auth.service.TouristSpotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/touristspots")
public class TouristSpotController {

    private final TouristSpotService service;

    public TouristSpotController(TouristSpotService service) {
        this.service = service;
    }

    @GetMapping
    public List<TouristSpot> getAll() {
        return service.getAll();
    }

    @PostMapping
    public TouristSpot create(@RequestBody TouristSpot spot) {
        return service.save(spot);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
