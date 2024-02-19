package divan.springframework.divanarticlewebapp.services;

import divan.springframework.divanarticlewebapp.domain.Article;
import divan.springframework.divanarticlewebapp.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Iterable<Article> findAll() {
        return articleRepository.findAll();
    }
}
