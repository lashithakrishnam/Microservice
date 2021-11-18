package com.example.onetoone.mappingdemo.controller;

import com.example.onetoone.mappingdemo.models.Student;
import com.example.onetoone.mappingdemo.models.University;
import com.example.onetoone.mappingdemo.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("University")
public class UniversityController {

   @Autowired
    UniversityService universityService;


   @GetMapping(value="/university/join")
           public List<String> getDataJoin()
   {
      return universityService.getStudentsAndUniversity();
   }
   @PostMapping(value = "/university")
    public String addData(@RequestBody University university)
   {
       universityService.addDatatoDatabase(university);


       return "data is added to database";
   }
   @GetMapping(value="/university")
    public List<University> getData()
   {

       return universityService.getData();
   }

    @GetMapping(value = "university/{id}")
    public University dataGet(@PathVariable long id )
    {
        return universityService.dataGetById(id);
    }
   @PutMapping(value = "university/{id}")
   public String dataUpdate(@PathVariable long id , @RequestBody University university)
   {
       return universityService.dataUpdateById(id,university);
   }

   @DeleteMapping(value="university/{id}")
    public String deleteData(@PathVariable long id)
   {
       return universityService.deleteData(id);
   }



}
