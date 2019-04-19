package br.ufjf.dcc193.trb01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController{
    @RequestMapping("index.html")
    public String home(){
        return "home.jsp";
    }
    
}
