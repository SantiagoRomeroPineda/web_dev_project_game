package com.javeriana.Game.repository;
import com.javeriana.Game.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository  extends JpaRepository<Ship, Long> {
}
