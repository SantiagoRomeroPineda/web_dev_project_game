package com.javeriana.Game.service;
import com.javeriana.Game.model.Planet;
import com.javeriana.Game.repository.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService {

    private final PlanetRepository planetRepo;

    public  PlanetService(PlanetRepository planetRepo) {
        this.planetRepo=planetRepo;
    }

    public Planet addPlanet(Planet planet) {
        return planetRepo.save(planet);
    }

    public List<Planet> findAllPlanets(){
        return (List<Planet>) planetRepo.findAll();
    }

    public Planet updatePlanet(Planet planet) {
        return planetRepo.save(planet);
    }

    public void deletePlanetById(Long id) {
        planetRepo.deleteById(id);
    }

    public List<Planet> findPlanetsByStar(Planet planet){
        return planetRepo.findPlanetsByStar(planet.getPlanetId());
    }


}
