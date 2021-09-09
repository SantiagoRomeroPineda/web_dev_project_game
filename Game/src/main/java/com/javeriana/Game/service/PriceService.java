package com.javeriana.Game.service;
import com.javeriana.Game.model.*;
import com.javeriana.Game.repository.PriceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    private final PriceRepository priceRepo;

    public PriceService(PriceRepository priceRepo) {
        this.priceRepo = priceRepo;
    }

    public Price addPrice(Price price) {
        return priceRepo.save(price);
    }

    public List<Price> findAllPrices() {
        return (List<Price>) priceRepo.findAll();
    }

    public Price updatePrice(Price price) {
        return priceRepo.save(price);
    }

    public void deletePrice(Long id) {
        priceRepo.deleteById(id);
    }

    public Price findByPlanetAndAsset(Planet planet, Asset asset) {
        return priceRepo.findByPlanetAndAsset(planet.getPlanetId(),asset.getAssetId());
    }



}
