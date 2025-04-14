package com.example.cv_auth.service;

import com.example.cv_auth.model.Transport;
import com.example.cv_auth.repository.TransportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {
    private final TransportRepository repo;

    public TransportService(TransportRepository repo) {
        this.repo = repo;
    }

    public List<Transport> getAll() {
        return repo.findAll();
    }

    public Transport save(Transport ts) {
        return repo.save(ts);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
