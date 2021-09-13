package com.javeriana.Game.service;
import com.javeriana.Game.model.Asset;
import com.javeriana.Game.model.AssetsByTeam;
import com.javeriana.Game.model.Team;
import com.javeriana.Game.repository.AssetsByTeamRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AssetsByTeamService {

    private final AssetsByTeamRepository assetsByTeamRepo;

    public AssetsByTeamService(AssetsByTeamRepository assetsByTeamRepo) {
        this.assetsByTeamRepo = assetsByTeamRepo;
    }

    public AssetsByTeam addAssetsByTeam(AssetsByTeam assetsByTeam) {
        return assetsByTeamRepo.save(assetsByTeam);
    }

    public List<AssetsByTeam> findAllAssetsByTeam() {
        return (List<AssetsByTeam>) assetsByTeamRepo.findAll();
    }

    public AssetsByTeam updateAssetsByTeam(AssetsByTeam assetsByTeam) {
        return assetsByTeamRepo.save(assetsByTeam);
    }

    public void deleteAssetsByTeamById(Long id) {
        assetsByTeamRepo.deleteById(id);
    }

    public List<AssetsByTeam> findAllByTeam(Team team) {
        return assetsByTeamRepo.findAllByTeam(team.getTeamId());
    }

    public AssetsByTeam findByTeamAndAsset(Team team, Asset asset ) {
        return assetsByTeamRepo.findByTeamAndAsset(team.getTeamId(), asset.getAssetId());
    }




}
