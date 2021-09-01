package com.javeriana.Game.service;
import com.javeriana.Game.model.Ship;
import com.javeriana.Game.repository.ShipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {
    private final ShipRepository shipRepo;

    public  ShipService(ShipRepository shipRepo) {
        this.shipRepo=shipRepo;
    }

    public Ship addShip(Ship ship) {
        return shipRepo.save(ship);
    }

    public List<Ship> findAllShips(){
        return shipRepo.findAll();
    }

    public Ship updateShip(Ship ship) {
        return shipRepo.save(ship);
    }

    public void deleteShipById(Long id) {
        shipRepo.deleteById(id);
    }


}
