package divan.springframework.divanarticlewebapp.repositories;

import divan.springframework.divanarticlewebapp.domain.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
