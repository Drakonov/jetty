package ru.drakonov;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @GetMapping("/")
    public String index(@RequestParam(name = "usesRam", required = false, defaultValue = "World") String usesRam, Model model) {
        model.addAttribute("usesRam", RamJava.getUsesRam() + " megabit");
        model.addAttribute("totalRam", RamJava.getTotalRam() + " megabit");
        model.addAttribute("nowDate", FormatedDate.getFormattedDateNow());
        model.addAttribute("computerName", ComputerName.getHostname());

        return "index";
    }
}