package com.javeriana.Game.repository;
import com.javeriana.Game.model.Planet;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PlanetRepository  extends CrudRepository<Planet, Long> {
    @Query(value = "SELECT * FROM planet where star_id = ?1  ", nativeQuery = true)
    List<Planet> findPlanetsByStar(Long planet_id);
}
