package br.ufjf.dcc193.trb01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trb01.models.Sede;
import br.ufjf.dcc193.trb01.repositories.SedeRepository;

@Controller
public class SedeController{
    @Autowired
    private SedeRepository repositorySede;

    @RequestMapping("sedes.html")
    public ModelAndView sedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes.jsp");
        List<Sede> sedes = repositorySede.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @GetMapping("cadastro-sedes.html")
    public ModelAndView sedeCadastrar()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cadastro-sedes.jsp");
        return mv;
    }
}