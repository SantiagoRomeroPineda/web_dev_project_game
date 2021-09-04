package com.javeriana.Game.repository;
import com.javeriana.Game.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PlanetRepository  extends JpaRepository<Planet, Long> {
    @Query(value = "SELECT * FROM planet where star_id = ?1  ", nativeQuery = true)
    List<Planet> findPlanetsByStar(Long planet_id);
}
