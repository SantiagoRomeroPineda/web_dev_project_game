package com.javeriana.Game.repository;
import com.javeriana.Game.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository  extends JpaRepository<Position, Long> {
}
