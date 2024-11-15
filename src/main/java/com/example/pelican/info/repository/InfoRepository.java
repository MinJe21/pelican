package com.example.pelican.info.repository;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Info, Long> {
}
