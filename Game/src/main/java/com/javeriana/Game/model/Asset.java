package com.javeriana.Game.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "asset")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "asset_id")
    private Long assetId;

    @Column(name= "asset_name")
    private String assetName;

    @Column(name= "asset_volume", columnDefinition = "Decimal(10,2) default '000.00'")
    private Long assetVolume;

    @ManyToMany
    @JsonManagedReference
    private List<Team> teams  = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "price", joinColumns = @JoinColumn(name="asset_id"), inverseJoinColumns = @JoinColumn(name="planet_id"))
    private List<Planet> planets = new ArrayList<>();

    public Asset() {}
    public Asset(Long assetId, String assetName, Long assetVolume, List<Team> teams, List<Planet> planets) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.assetVolume = assetVolume;
        this.teams = teams;
        this.planets = planets;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public Long getAssetVolume() {
        return assetVolume;
    }

    public void setAssetVolume(Long assetVolume) {
        this.assetVolume = assetVolume;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeam(List<Team> teams) {
        this.teams = teams;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }
}
