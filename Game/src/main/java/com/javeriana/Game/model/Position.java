package com.javeriana.Game.model;

import javax.persistence.*;

@Entity
@Table(name = "position")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "position_id")
    private Long positionId;

    @Column(name= "position_x", columnDefinition = "Decimal(10,5) default '000.00000'")
    private Long positionX;

    @Column(name= "position_y", columnDefinition = "Decimal(10,5) default '000.00000'")
    private Long positionY;

    @Column(name= "position_z", columnDefinition = "Decimal(10,5) default '000.00000'")
    private Long positionZ;

    @OneToOne
    @MapsId
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToOne
    @MapsId
    @JoinColumn(name = "planet_id")
    private Planet planet;

    @OneToOne
    @MapsId
    @JoinColumn(name = "star_id")
    private Star star;

    public Position(){}

    public Position(Long positionId, Long positionX, Long positionY, Long positionZ, Team team, Planet planet, Star star) {
        this.positionId = positionId;
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
        this.team = team;
        this.planet = planet;
        this.star = star;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getPositionX() {
        return positionX;
    }

    public void setPositionX(Long positionX) {
        this.positionX = positionX;
    }

    public Long getPositionY() {
        return positionY;
    }

    public void setPositionY(Long positionY) {
        this.positionY = positionY;
    }

    public Long getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(Long positionZ) {
        this.positionZ = positionZ;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }
}
