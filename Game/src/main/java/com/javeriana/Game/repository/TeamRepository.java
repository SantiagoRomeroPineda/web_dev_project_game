package com.javeriana.Game.repository;
import com.javeriana.Game.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository  extends JpaRepository<Team, Long> {
}
