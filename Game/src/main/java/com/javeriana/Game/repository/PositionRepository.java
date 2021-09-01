package com.javeriana.Game.repository;
import com.javeriana.Game.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository  extends JpaRepository<Position, Long> {
}
