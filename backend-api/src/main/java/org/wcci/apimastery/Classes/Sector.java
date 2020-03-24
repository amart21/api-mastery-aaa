package org.wcci.apimastery.Classes;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Sector {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "sector")
    Collection<Stock> stocks;

    private String description;

    private String name;

    protected Sector(){
    }
    public Sector(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Long getId(){
        return id;
    }
    public Collection<Stock> getStocks(){
        return stocks;
    }
    public String getName(){
        return name;
    }
    public String  getDescription(){
        return description;
    }


}
