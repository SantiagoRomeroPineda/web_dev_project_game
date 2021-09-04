package com.javeriana.Game.repository;
import com.javeriana.Game.model.AssetsByTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AssetsByTeamRepository extends JpaRepository<AssetsByTeam, Long>{

    @Query(value = "SELECT * FROM assets_by_team where team_id = ?1 and asset_id = ?2 ", nativeQuery = true)
    AssetsByTeam findByTeamAndAsset(Long teamId, Long assetId);

    @Query(value = "SELECT * FROM assets_by_team where team_id = ?1 ", nativeQuery = true)
    List<AssetsByTeam> findAllByTeam(Long teamId);
}
