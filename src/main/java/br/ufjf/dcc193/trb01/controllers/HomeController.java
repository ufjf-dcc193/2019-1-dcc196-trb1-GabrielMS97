package br.ufjf.dcc193.trb01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("index.html")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("sedes.html")
    public String sedes() {
        return "sedes.jsp";
    }

    @RequestMapping("membros.html")
    public String membros() {
        return "membros.jsp";
    }

    @RequestMapping("atividades.html")
    public String atividades() {
        return "atividades.jsp";
    }

}
