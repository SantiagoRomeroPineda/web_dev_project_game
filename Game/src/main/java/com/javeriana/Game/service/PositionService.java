package com.javeriana.Game.service;
import com.javeriana.Game.model.Position;
import com.javeriana.Game.repository.PositionRepository;
import org.springframework.stereotype.Service;


@Service
public class PositionService {

    private final PositionRepository positionRepo;

    public  PositionService(PositionRepository positionRepo) {
        this.positionRepo=positionRepo;
    }

    public Position addPosition(Position position) {
        return positionRepo.save(position);
    }

    public Position updatePosition(Position position) {
        return positionRepo.save(position);
    }

    public void deletePositionById(Long id) {
        positionRepo.deleteById(id);
    }

}
