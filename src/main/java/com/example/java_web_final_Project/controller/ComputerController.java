package com.example.java_web_final_Project.controller;

import com.example.java_web_final_Project.entity.Computer;
import com.example.java_web_final_Project.service.ComputerService;
import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin    //This is to allow the API to be accessed from different domains
@RestController
@RequestMapping("/api/computer")
public class ComputerController {

private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
    this.computerService = computerService;
    }

   @GetMapping
    public List<Computer> getComputer() {
        return computerService.getComputers();
    }

    @GetMapping("/{id}")
    public Optional<Computer> getComputerById(@PathVariable (name = "id") Integer id) {
        Optional<Computer> returned = computerService.getComputerById(id);
        return Optional.of(returned.orElseGet(Computer::new));

    }



    //Posting and deleting a computer
    @PostMapping
    public void addComputer(@RequestBody Computer computer) {
        computerService.saveComputer(computer);
    }
    //update a computer
    @PutMapping
    public void updateComputer(@RequestBody Computer computer) {
        computerService.saveComputer(computer);
    }

    @DeleteMapping("/{id}")
    public String  deleteComputer(@PathVariable (name = "id") Integer id) {
        computerService.deleteComputer(id);
        return "Computer deleted";
    }
}


