package com.example.cv_auth.controller;

import com.example.cv_auth.model.Hotel;
import com.example.cv_auth.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service) {
        this.service = service;
    }

    @GetMapping
    public List<Hotel> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Hotel create(@RequestBody Hotel hotel) {
        return service.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
