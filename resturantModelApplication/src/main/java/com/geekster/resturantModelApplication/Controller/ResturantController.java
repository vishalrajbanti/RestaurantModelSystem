package com.geekster.resturantModelApplication.Controller;

import com.geekster.resturantModelApplication.Entity.Resturant;
import com.geekster.resturantModelApplication.Service.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturantController {
@Autowired
    ResturantService resturantService;

// add a resturant
@PostMapping("resturant")
public String addResturant(@RequestBody Resturant myResturant){
    return resturantService.addResturant(myResturant);
}
// add some resturant(list of resurant)
    @PostMapping("resturants")
    public String addSomeResturant(@RequestBody List<Resturant> myresturant){
    return resturantService.addSomeResturant(myresturant);
    }

// get a resturant by Id
@GetMapping("resturant/id/{id}")
    public List<Resturant> getResturantByid(@PathVariable Integer id){
    return resturantService.getResturantById(id);
    }


 // get all resturant
    @GetMapping("resturants")
 public List<Resturant>  getResturants(){
    return resturantService.getResturants();
 }
 // update resturant by speciality
    @PutMapping("update/{id}")
 public String updateSpeciality(@RequestParam String speciality,@PathVariable Integer id) {
    return resturantService.updateSpeciality(speciality,id);
 }

 // delete a Resturant by id
    @DeleteMapping("delete/{id}")
    public String deleteResturantById(@PathVariable Integer id){
    return resturantService.deleteResturantById(id);
    }
}
