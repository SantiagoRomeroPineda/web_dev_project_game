package com.javeriana.Game.service;
//import com.javeriana.Game.model.Ship;
import com.javeriana.Game.model.Team;
import com.javeriana.Game.model.User;
import com.javeriana.Game.repository.TeamRepository;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

//@Slf4j
@Service
public class TeamService {
    private final TeamRepository teamRepo;

    public  TeamService(TeamRepository teamRepo) {
        this.teamRepo=teamRepo;
    }

    public Team addTeam(Team team) {
        return teamRepo.save(team);
    }

    public List<Team> findAllTeams(){
        return teamRepo.findAll();
    }

    public Team updateTeam(Team team) {
        return teamRepo.save(team);
    }

    public void deleteTeamById(Long id) {
        teamRepo.deleteById(id);
    }

    public User addUserToTeam(Team team, User user){
        team.getUsers().add(user);
        //log.info("New user named: {} with id {} added to the team {}",user.getUserName(), String.valueOf(user.getUserId()), team.getTeamName());
        teamRepo.save(team);
        return user;
    }

    public List<User> getUsersFromTeam(Team team){
        return team.getUsers();
    }
}
