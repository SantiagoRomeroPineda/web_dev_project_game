package com.javeriana.Game.model;


import java.util.Random;

import javax.transaction.Transactional;

import com.javeriana.Game.model.User.UserRoles;
import com.javeriana.Game.repository.AssetRepository;
import com.javeriana.Game.repository.AssetsByTeamRepository;
import com.javeriana.Game.repository.PlanetRepository;
import com.javeriana.Game.repository.PositionRepository;
import com.javeriana.Game.repository.PriceRepository;
import com.javeriana.Game.repository.ShipRepository;
import com.javeriana.Game.repository.StarRepository;
import com.javeriana.Game.repository.TeamRepository;
import com.javeriana.Game.repository.UserRepository;
import com.javeriana.Game.service.UserService;

import org.apache.commons.text.RandomStringGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInit implements ApplicationRunner {

    private static final Team NULL = null;
    private static final Planet NULLP = null;
    private static final Star NULLS = null;


    // Repositorios
    @Autowired
    PriceRepository priceRepository;

    @Autowired
    AssetRepository assetRepository;

    @Autowired
    PlanetRepository planetRepository;

    @Autowired
    PositionRepository positionRepository;

    @Autowired
    ShipRepository shipRepository;

    @Autowired
    StarRepository starRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    AssetsByTeamRepository assetsByTeamRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

    final int NUM_SHIPS = 20;
    final int NUM_TEAMS = 10;
    final int NUM_USER = 100;
    final int NUM_ASSET = 500;
    final int NUM_STAR = 40000;

    Random random = new Random(1234);
    RandomStringGenerator randomGen = new RandomStringGenerator.Builder().withinRange('a', 'z')
            .usingRandom(random::nextInt).build();

            System.out.println("BASE DE DATOS------------------");

    for(
    int i = 0;i<NUM_USER;i++)
    {

        String name = randomGen.generate(5, 10);
        String document = randomGen.generate(5, 10);
        String password = randomGen.generate(5, 10);
        int id = random.nextInt(1000000);
        UserRoles m = UserRoles.MERCHANT;
        UserRoles p = UserRoles.PILOT;
        UserRoles c = UserRoles.CAPTAIN;
        if (i < 40) {
            userRepository.save(new User((long) id, name, document, password, m));
            System.out.println("CREANDO");
        } else if (i < 80) {
            userRepository.save(new User((long) id, name, document, password, p));
        } else {
            userRepository.save(new User((long) id, name, document, password, c));
        }

    }

    for(int j=0; j<NUM_SHIPS; j++)
    {
        String type = randomGen.generate(5, 10);
        int id = random.nextInt(1000000);
        int speed = random.nextInt(1000000);
        int volume = random.nextInt(1000000);
        
        shipRepository.save(new Ship((long)id,type,(long)speed,(long)volume));

    }
    
    for(int k=0;k<NUM_TEAMS;k++)
    {

        int id = random.nextInt(1000000);   
        String name = randomGen.generate(5, 10);
        int money = random.nextInt(1000000);  
        int time = random.nextInt(1000000);  
        teamRepository.save(new Team((long) id, name, (long)money, (long)time));

    }

    
 }
}
