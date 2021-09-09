package com.javeriana.Game.repository;
import com.javeriana.Game.model.Star;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepository  extends CrudRepository<Star, Long> {
}
