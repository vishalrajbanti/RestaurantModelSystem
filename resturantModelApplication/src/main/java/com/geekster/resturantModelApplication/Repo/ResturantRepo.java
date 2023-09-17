package com.geekster.resturantModelApplication.Repo;

import com.geekster.resturantModelApplication.Entity.Resturant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ResturantRepo {
@Autowired
 private List<Resturant> resturantList;

    public List<Resturant> getResturantList() {
        return resturantList;
    }
}
