package com.example.cv_auth.service;

import com.example.cv_auth.model.Restaurant;
import com.example.cv_auth.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository repo;

    public RestaurantService(RestaurantRepository repo) {
        this.repo = repo;
    }

    public List<Restaurant> getAll() {
        return repo.findAll();
    }

    public Restaurant save(Restaurant restaurant) {
        return repo.save(restaurant);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
