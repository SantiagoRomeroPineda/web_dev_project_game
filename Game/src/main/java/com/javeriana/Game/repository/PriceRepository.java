package com.javeriana.Game.repository;
import com.javeriana.Game.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository  extends JpaRepository<Price, Long> {
}
