package com.tejaswini.pleasework;

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

