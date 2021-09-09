package com.javeriana.Game.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "team_id")
    Long teamId;

    @Column(name= "team_name")
    String teamName;

    @Column(name= "team_current_money" , columnDefinition = "Decimal(10,2) default '000.00'")
    Long teamCurrentMoney;

    @Column(name= "team_time_game", columnDefinition = "Decimal(10,2) default '000.00'")
    Long teamTimeGame;

    @ManyToOne
    Ship ship;

    @OneToMany(mappedBy="team")
    List<User> users =  new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "assets_by_team", joinColumns = @JoinColumn(name="team_id"), inverseJoinColumns = @JoinColumn(name="asset_id"))
    List<Asset> assets = new ArrayList<>();


    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    Position position;

    public Team() {}

    public Team(Long teamId, String teamName, Long teamCurrentMoney, Long teamTimeGame) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamCurrentMoney = teamCurrentMoney;
        this.teamTimeGame = teamTimeGame;
     
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Long getTeamCurrentMoney() {
        return teamCurrentMoney;
    }

    public void setTeamCurrentMoney(Long teamCurrentMoney) {
        this.teamCurrentMoney = teamCurrentMoney;
    }

    public Long getTeamTimeGame() {
        return teamTimeGame;
    }

    public void setTeamTimeGame(Long teamTimeGame) {
        this.teamTimeGame = teamTimeGame;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
