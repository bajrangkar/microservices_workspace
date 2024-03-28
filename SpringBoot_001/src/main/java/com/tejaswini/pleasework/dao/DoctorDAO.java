package com.tejaswini.pleasework.dao;

import com.tejaswini.pleasework.domain.Doctor;

import java.util.List;

public interface DoctorDAO {
    int addDoctor(Doctor doctor);
    boolean updateDoctor(Doctor doctor);
    boolean updateSpecialization(int doctorId,String specialization);
    int deleteDoctorById(int doctorId);
    Doctor findDoctorById(int doctorId);
    List<Doctor> findAllDoctors();
    List<Doctor>findAllDoctorsBySpecialization();
}

