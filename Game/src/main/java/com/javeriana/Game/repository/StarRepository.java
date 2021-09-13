package com.javeriana.Game.repository;
import com.javeriana.Game.model.Star;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepository  extends JpaRepository<Star, Long> {
}
