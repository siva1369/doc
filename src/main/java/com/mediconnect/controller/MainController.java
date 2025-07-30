package com.example.doctorapp.controller;

import com.example.doctorapp.model.Doctor;
import com.example.doctorapp.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private DoctorRepository doctorRepo;

    @GetMapping("/")
    public String home() {
        return "index";  // loads templates/index.html
    }

    @GetMapping("/doctors")
    public String viewDoctors(Model model) {
        model.addAttribute("doctors", doctorRepo.findAll());
        return "doctor_list";  // loads templates/doctor_list.html
    }

    @GetMapping("/doctor/register")
    public String showDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "doctor_register";  // loads templates/doctor_register.html
    }

    @PostMapping("/doctor/save")
    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
        doctorRepo.save(doctor);
        return "redirect:/doctors";
    }
}
