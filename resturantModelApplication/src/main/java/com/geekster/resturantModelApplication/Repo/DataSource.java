package com.geekster.resturantModelApplication.Repo;

import com.geekster.resturantModelApplication.Entity.Resturant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class DataSource {

@Bean
    List<Resturant>  getResturantListSource(){
        return new ArrayList<>();
    }
}
