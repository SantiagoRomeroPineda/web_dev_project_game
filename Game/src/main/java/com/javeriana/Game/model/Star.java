package com.javeriana.Game.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

@Entity
@Table(name = "star")
public class Star {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "star_id")
    private Long starId;

    @Column(name= "star_name")
    private String starName;

    @OneToMany(mappedBy="star")
    @JsonManagedReference
    private List<Planet> planets = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Position position;

    @ManyToMany
    @JoinTable(name="star_connection",
            joinColumns=@JoinColumn(name="star_id"),
            inverseJoinColumns=@JoinColumn(name="connected_star")
    )
    private List<Star> connectedStars;

    @ManyToMany
    @JoinTable(name="star_connection",
            joinColumns=@JoinColumn(name="star_id"),
            inverseJoinColumns=@JoinColumn(name="star_of")
    )
    @JsonManagedReference
    private List<Star> connectedStarFrom;

    public Star() {}

    public Star(Long starId, String starName, List<Planet> planets, Position position, List<Star> connectedStars, List<Star> connectedStarFrom) {
        this.starId = starId;
        this.starName = starName;
        this.planets = planets;
        this.position = position;
        this.connectedStars = connectedStars;
        this.connectedStarFrom = connectedStarFrom;
    }

    public List<Star> getConnectedStars() {
        return connectedStars;
    }

    public void setConnectedStars(List<Star> connectedStars) {
        this.connectedStars = connectedStars;
    }

    public List<Star> getConnectedStarFrom() {
        return connectedStarFrom;
    }

    public void setConnectedStarFrom(List<Star> connectedStarFrom) {
        this.connectedStarFrom = connectedStarFrom;
    }

    public Long getStarId() {
        return starId;
    }

    public void setStarId(Long starId) {
        this.starId = starId;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
