package oit.is.z0968.kaizi.janken.controller;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import oit.is.z0968.kaizi.janken.model.Janken;
import oit.is.z0968.kaizi.janken.model.Entry;

@Controller
public class Lec02Controller {

  @Autowired
  private Entry entry;

  @GetMapping("/lec02")
  public String lec02(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    // Entry newRoom = new Entry();
    this.entry.addUser(loginUser);
    model.addAttribute("loginuser", loginUser);
    model.addAttribute("entry", this.entry);
    return "lec02.html";
  }

  @GetMapping("/lec02-1")
  public String lec02(@RequestParam Integer Janken_hand, ModelMap model) {
    Janken a = new Janken(Janken_hand);
    model.addAttribute("Janken_hand",a.result());
    model.addAttribute("result2",a.result3());
    return "lec02.html";
  }

  @PostMapping("/lec02")
  public String lec02(@RequestParam String name, ModelMap model) {
    model.addAttribute("name", name);
    return "lec02.html";
  }

}
