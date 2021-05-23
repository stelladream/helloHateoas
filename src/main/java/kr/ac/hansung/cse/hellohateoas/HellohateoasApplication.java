package kr.ac.hansung.cse.hellohateoas;

import kr.ac.hansung.cse.hellohateoas.entity.ActorEntity;
import kr.ac.hansung.cse.hellohateoas.repository.ActorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HellohateoasApplication {

    public static void main(String[] args) {

        SpringApplication.run(HellohateoasApplication.class, args);
    }

}
