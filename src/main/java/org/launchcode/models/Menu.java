package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Rebecca on 4/10/2017.
 */
@SuppressWarnings("DefaultFileTemplate")
@Entity
public class Menu {

    @NotNull
    @Size(min=3, max=15)
    public String name;

    @Id
    @GeneratedValue
    public int id;

    @ManyToMany
    public List<Cheese> cheeses;

    public Menu() { }

    public Menu(String name) {
        this.name = name;
    }

    public void addItem(Cheese item) {
        cheeses.add(item);
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

}