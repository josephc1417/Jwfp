package com.example.java_web_final_Project.service;


import com.example.java_web_final_Project.entity.Computer;
import com.example.java_web_final_Project.repository.ComputerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerService {

    private final ComputerRepo computerRepo;

    public ComputerService(ComputerRepo computerRepo) {
        this.computerRepo = computerRepo;
    }

    //read
    public List<Computer> getComputers() {
        return computerRepo.findAll();
    }

    public Optional<Computer> getComputerById(Integer id) {
        return computerRepo.findById(id);
    }
    public Computer saveComputer(Computer computer) {
        computerRepo.save(computer);
        return computer;
    }

    public void deleteComputer(Integer id) {
        computerRepo.deleteById(id);
    }

    public void updateComputer(Computer computer) {
        Integer id = computer.getId();
        computerRepo.delete(computer);
        computerRepo.save(computer);
    }


}