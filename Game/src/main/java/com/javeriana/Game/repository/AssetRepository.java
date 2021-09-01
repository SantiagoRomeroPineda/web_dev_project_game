package com.javeriana.Game.repository;
import com.javeriana.Game.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository  extends JpaRepository<Asset, Long> {
}
