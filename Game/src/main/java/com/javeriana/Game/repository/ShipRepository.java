package com.javeriana.Game.repository;
import com.javeriana.Game.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface ShipRepository  extends JpaRepository<Ship, Long> {
    List<Ship> findAll();
}
