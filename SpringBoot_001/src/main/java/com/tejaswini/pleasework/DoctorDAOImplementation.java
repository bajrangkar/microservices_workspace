package com.tejaswini.pleasework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DoctorDAOImplementation implements DoctorDAO {

    private final JdbcTemplate jdbcTemplate;

    public DoctorDAOImplementation(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addDoctor(Doctor doctor) {
        int added = 0;
        String INSERT_DOCTOR = "insert into doctor values(?,?,?)";
        added = jdbcTemplate.update(INSERT_DOCTOR, doctor.getDoctorId(), doctor.getDoctorName(),
                doctor.getSpecialization());
        return added;
    }

    @Override
    public boolean updateDoctor(Doctor doctor) {
        return false;
    }

    @Override
    public boolean updateSpecialization(int doctorId, String specialization) {
        return false;
    }

    @Override
    public int deleteDoctorById(int doctorId) {
        return 0;
    }

    @Override
    public Doctor findDoctorById(int doctorId) {
        return null;
    }

    @Override
    public List<Doctor> findAllDoctors() {
        return null;
    }

    @Override
    public List<Doctor> findAllDoctorsBySpecialization() {
        return null;
    }
}
