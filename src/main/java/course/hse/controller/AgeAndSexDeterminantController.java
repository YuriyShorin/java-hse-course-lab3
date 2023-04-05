package course.hse.controller;

import course.hse.model.AgeAndSexDeterminant;
import course.hse.service.AgeAndSexDeterminantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AgeAndSexDeterminantController {

    private final AgeAndSexDeterminantService ageAndSexDeterminantService;

    @Autowired
    public AgeAndSexDeterminantController(AgeAndSexDeterminantService ageAndSexDeterminantService) {
        this.ageAndSexDeterminantService = ageAndSexDeterminantService;
    }

    @GetMapping("/")
    public String startWindow(Model model) {
        return ageAndSexDeterminantService.startWindow(model);
    }

    @PostMapping(value = "/define")
    public String define(Model model, AgeAndSexDeterminant ageAndSexDeterminant) {
        return ageAndSexDeterminantService.define(model, ageAndSexDeterminant);
    }
}
