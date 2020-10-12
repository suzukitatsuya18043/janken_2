package oit.is.z0968.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Janken {

  @GetMapping("/lec02janken")
  public String lec02() {
    return "lec02janken.html";
  }

  @PostMapping("/lec02janken")
  public String lec02(@RequestParam Integer onclick, ModelMap model) {
    model.addAttribute("onclick", onclick);
        return "lec02janken.html";
  }

}
