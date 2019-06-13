package pl.lucky.springboottraining1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.lucky.springboottraining1.beans.NamesRepository;

import java.util.List;

@SpringBootApplication
public class SpringBootTraining1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootTraining1Application.class, args);

        NamesRepository namesRepo = ctx.getBean(NamesRepository.class);
        List<String> allNames = namesRepo.getAll();
        allNames.forEach(System.out::println);

        ctx.close();
    }
}
