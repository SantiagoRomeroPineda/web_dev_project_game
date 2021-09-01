package com.javeriana.Game.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "planet")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "planet_id")
    private Long planetId;

    @Column(name= "planet_name")
    private String planetName;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Position position;

    @ManyToMany
    private List<Asset> assets =  new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="star_id", nullable=false)
    private Star star;

    public Planet() {}

    public Planet(Long planetId, String planetName, Position position, List<Asset> assets, Star star) {
        this.planetId = planetId;
        this.planetName = planetName;
        this.position = position;
        this.assets = assets;
        this.star = star;
    }

    public Long getPlanetId() {
        return planetId;
    }

    public void setPlanetId(Long planetId) {
        this.planetId = planetId;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }
}
