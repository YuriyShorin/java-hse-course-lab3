package course.hse.service;

import course.hse.model.AgeAndSexDeterminant;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AgeAndSexDeterminantService {

    public String startWindow(Model model) {
        model.addAttribute("ageAndSexDeterminant", new AgeAndSexDeterminant());
        return "index";
    }

    public String define(Model model, AgeAndSexDeterminant ageAndSexDeterminant) {
        ageAndSexDeterminant.define();
        model.addAttribute("ageAndSexDeterminant", ageAndSexDeterminant);
        return "index";
    }
}
