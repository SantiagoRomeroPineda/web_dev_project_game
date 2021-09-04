package com.javeriana.Game.service;
import com.javeriana.Game.model.Asset;
import com.javeriana.Game.repository.AssetRepository;
import org.springframework.stereotype.Service;

@Service
public class AssetService {

    private final AssetRepository assetRepo;

    public  AssetService(AssetRepository assetRepo) {
        this.assetRepo=assetRepo;
    }

    public Asset addAsset(Asset asset) {
        return assetRepo.save(asset);
    }

    public Asset updateAsset(Asset asset) {
        return assetRepo.save(asset);
    }


}
