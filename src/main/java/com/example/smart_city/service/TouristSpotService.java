package com.example.cv_auth.service;

import com.example.cv_auth.model.TouristSpot;
import com.example.cv_auth.repository.TouristSpotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristSpotService {
    private final TouristSpotRepository repo;

    public TouristSpotService(TouristSpotRepository repo) {
        this.repo = repo;
    }

    public List<TouristSpot> getAll() {
        return repo.findAll();
    }

    public TouristSpot save(TouristSpot spot) {
        return repo.save(spot);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
