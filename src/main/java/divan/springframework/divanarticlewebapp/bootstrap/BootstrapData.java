package divan.springframework.divanarticlewebapp.bootstrap;

import divan.springframework.divanarticlewebapp.domain.Article;
import divan.springframework.divanarticlewebapp.domain.Employee;
import divan.springframework.divanarticlewebapp.repositories.ArticleRepository;
import divan.springframework.divanarticlewebapp.repositories.EmpolyeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final EmpolyeeRepository empolyeeRepository;
    private final ArticleRepository articleRepository;

    public BootstrapData(EmpolyeeRepository empolyeeRepository, ArticleRepository articleRepository) {
        this.empolyeeRepository = empolyeeRepository;
        this.articleRepository = articleRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Employee sadeneh = new Employee();
        sadeneh.setFirstName("Sadeneh");
        sadeneh.setLastName("Sadeghi");
        sadeneh.setPosition("Intern");
        sadeneh.setProvince("Tehran");

        Employee mehdi= new Employee();
        mehdi.setFirstName("Mehdi");
        mehdi.setLastName("Rahimi");
        mehdi.setPosition("Developer");
        mehdi.setProvince("Tehran");

        Article dip =new Article();
        dip.setTitle("Digital Image processing");

        Article jsf= new Article();
        jsf.setTitle("JavaServer Face");


        Employee sadenehSaved =empolyeeRepository.save(sadeneh);
        Employee mehdiSaved= empolyeeRepository.save(mehdi);
        Article dipSaved= articleRepository.save(dip);
        Article jsfSaved= articleRepository.save(jsf);

        sadenehSaved.getArticles().add(dipSaved);
        mehdiSaved.getArticles().add(jsfSaved);
        dipSaved.setEmployee(sadenehSaved);
        jsfSaved.setEmployee(mehdiSaved);

        empolyeeRepository.save(sadenehSaved);
        empolyeeRepository.save(mehdiSaved);
        articleRepository.save(dipSaved);
        articleRepository.save(jsfSaved);

        System.out.println("In Bootstrap");
        System.out.println("Employee Count: " + empolyeeRepository.count());
        System.out.println("Article Count: " + articleRepository.count());


    }
}
