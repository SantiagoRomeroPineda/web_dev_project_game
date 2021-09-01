package com.javeriana.Game.repository;
import com.javeriana.Game.model.Star;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarRepository  extends JpaRepository<Star, Long> {
}
