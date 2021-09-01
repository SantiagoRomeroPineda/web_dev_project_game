package com.javeriana.Game.repository;
import com.javeriana.Game.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository  extends JpaRepository<Planet, Long> {
}
