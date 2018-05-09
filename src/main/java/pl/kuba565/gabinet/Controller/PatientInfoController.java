package pl.kuba565.gabinet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.kuba565.gabinet.Model.Patient;
import pl.kuba565.gabinet.Repository.PatientRepository;

import javax.validation.Valid;

@Controller
@RequestMapping("/patient")
public class PatientInfoController {


    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/info/{id}")
    public String patientsList(Model model, @PathVariable Long id) {
        Patient patient = patientRepository.getOne(id);
        model.addAttribute("patient", patient);


        return "patient-info";
    }
}