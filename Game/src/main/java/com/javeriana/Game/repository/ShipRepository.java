package com.javeriana.Game.repository;
import com.javeriana.Game.model.Ship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface ShipRepository  extends CrudRepository<Ship, Long> {
    List<Ship> findAll();
}
