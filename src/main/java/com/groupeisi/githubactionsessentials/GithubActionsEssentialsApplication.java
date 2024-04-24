package com.groupeisi.githubactionsessentials;

import com.groupeisi.githubactionsessentials.dao.SentimentRepository;
import com.groupeisi.githubactionsessentials.entities.Sentiment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GithubActionsEssentialsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsEssentialsApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(SentimentRepository repository) {
        return args -> {
          repository.save(new Sentiment(null,"holla",1));
            repository.save(new Sentiment(null,"world",0));
        };
    }
}
