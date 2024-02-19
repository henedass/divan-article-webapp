package divan.springframework.divanarticlewebapp.services;

import divan.springframework.divanarticlewebapp.domain.Article;
import divan.springframework.divanarticlewebapp.domain.Employee;

public interface ArticleService {
    Iterable<Article> findAll();

}
