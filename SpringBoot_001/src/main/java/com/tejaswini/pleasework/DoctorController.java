package com.tejaswini.pleasework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class DoctorController {
    private final DoctorDAO doctorDAO;

    public DoctorController(DoctorDAO doctorDAO) {
        this.doctorDAO = doctorDAO;
    }

    @PostMapping("/doctors")
    public Doctor createNewDoctorRecord(@RequestBody Doctor doctor) {
        // logic to add record in table will go here
        Doctor d = null;
        int added = doctorDAO.addDoctor(doctor);
        if (added == 1)
            return doctor;
        return d;
    }

    @GetMapping("/doctors/{id}")
    public Doctor findDoctorById(@PathVariable int id) {
        // logic to find doctor by id will go here
        return new Doctor(id, "dummy name", "dummy specialization" );
    }

    //@GetMapping("/doctors/specialization/{specialization}")
    //public List<Doctor> findDoctorBySpecialization(@PathVariable("specialization") String doctor_specialization) {

    //@GetMapping(value={"/doctors/specialization","/doctors/specialization/{specialization}"})
    //public List<Doctor> findDoctorBySpecialization(
            //@PathVariable(name="specialization",required = false) String doctor_specialization) {

    //@GetMapping(value={"/doctors/specialization","/doctors/specialization/{specialization}"})
    //public List<Doctor> findDoctorBySpecialization(
            //@PathVariable(value="specialization",required = false) String doctor_specialization) {

    //@GetMapping(value={"/doctors/specialization","/doctors/specialization/{specialization}"})
    //public List<Doctor> findDoctorBySpecialization(@PathVariable
                //(name="specialization",required = false,value="specialization") String doctor_specialization) {
        // logic to find all doctors by specialization will go here
        //return Arrays.asList(new Doctor(1, "dummy name", doctor_specialization));
    //}

    @GetMapping(value = { "/doctors/specialization", "/doctors/specialization/{specialization}" })
    public List<Doctor> findDoctorBySpecialization(
            @PathVariable(name = "specialization") Optional<String> doctor_specialization) {
        // logic to find all doctors by specialization will go here
        System.out.println(doctor_specialization);
        String specialization = "all";
        List<Doctor> doctors=new ArrayList<>();
        if (doctor_specialization.isPresent()) {
            return Arrays.asList(new Doctor(5, "dummy name", doctor_specialization.get()));
        }
        return Arrays.asList(new Doctor(4,"dummy name", "any specialization"));
    }

    @PutMapping("/doctors")
    public Doctor modifyDoctorInfo(@RequestBody Doctor doctor) {
        // logic to update the doctor's information if the id exists will go
        // here otherwise we will create a new record in DB
        return doctor;
    }
}
