package divan.springframework.divanarticlewebapp.controllers;

import divan.springframework.divanarticlewebapp.services.ArticleService;
import divan.springframework.divanarticlewebapp.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/articles")
    public String getArticles (Model model){
        model.addAttribute("articles" , articleService.findAll());
        return "articles";
    }
}
