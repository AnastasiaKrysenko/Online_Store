package com.example.fishshop.repositories;

import com.example.fishshop.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<ClientModel, Long> {
}
