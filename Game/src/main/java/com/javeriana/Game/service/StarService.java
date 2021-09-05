package com.javeriana.Game.service;
import com.javeriana.Game.model.Planet;
import com.javeriana.Game.model.Star;
//import com.javeriana.Game.model.Team;
//import com.javeriana.Game.model.User;
import com.javeriana.Game.repository.StarRepository;
//import com.javeriana.Game.repository.TeamRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StarService {
    private final StarRepository starRepo;

    public  StarService(StarRepository starRepo) {
        this.starRepo=starRepo;
    }

    public Star addStar(Star star) {
        return starRepo.save(star);
    }

    public List<Star> findAllStars(){
        return starRepo.findAll();
    }

    public Star updateStar(Star star) {
        return starRepo.save(star);
    }

    public void deleteStarById(Long id) {
        starRepo.deleteById(id);
    }

    public Planet addPlanetToStar(Star star, Planet planet){
        star.getPlanets().add(planet);
        //log.info("New planet named: {} with id {} added to the star {}",planet.getPlanetName(), String.valueOf(planet.getPlanetId()), star.getStarName());
        starRepo.save(star);
        return planet;
    }

    public boolean connectStar(Star starA, Star starB){
        if(starA.getStarId() == starB.getStarId()  ){
            log.warn("Stars sent are equals id: {} ", String.valueOf(starB.getStarId()));
            return false;
        }
        starA.getConnectedStars().add(starB);
        starA.getConnectedStarFrom().add(starB);
        starB.getConnectedStars().add(starB);
        starB.getConnectedStarFrom().add(starB);
        starRepo.save(starA);
        starRepo.save(starB);
        log.info("Connection created between: {} and {} ", String.valueOf(starA.getStarId()), String.valueOf(starB.getStarId()));
        return true;
    }

    public boolean isConnected(Star starA, Star starB){
     return starA.getConnectedStars().contains(starB);
    }

    public List<Planet> getPlanetsFromStar(Star star){
        return star.getPlanets();
    }
}
