package com.geekster.resturantModelApplication.Service;

import com.geekster.resturantModelApplication.Entity.Resturant;
import com.geekster.resturantModelApplication.Repo.ResturantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResturantService {
    @Autowired
    ResturantRepo resturantRepo;
 public  List<Resturant> getAllResturant() {
       return resturantRepo.getResturantList();
   }
    public String addResturant(Resturant myResturant) {
        resturantRepo.getResturantList().add(myResturant);
        return "added";
    }

    public List<Resturant> getResturants() {
        return resturantRepo.getResturantList();
    }

    public String updateSpeciality(String speciality,Integer id) {


        for (Resturant resturant : getAllResturant()) {
            if(resturant.getResturantId().equals(id)){
                resturant.setSpeciality(speciality);
                return "speciality added";
            }

        }
        return "resturant " + id + " not found";
    }

    public String deleteResturantById(Integer id) {
        for (Resturant resturant : getAllResturant()) {
            if(resturant.getResturantId().equals(id)){
                getAllResturant().remove(resturant);
                return "resturant removed";
            }

            }
        return "Resturant " + id + " is invalid can't remove";
    }

    public List<Resturant> getResturantById(Integer id) {
        List<Resturant> ans= new ArrayList<>();
        for (Resturant resturant : getAllResturant()) {
            if(resturant.getResturantId().equals(id)){
                ans.add(resturant);
                return ans;
            }
    }
        throw  new IllegalStateException("userId not found");
}

    public String addSomeResturant(List<Resturant> myresturant) {
     getAllResturant().addAll(myresturant);
     return "resturants added";
    }
}