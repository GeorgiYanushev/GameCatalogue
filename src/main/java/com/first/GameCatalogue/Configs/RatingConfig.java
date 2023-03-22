package com.first.GameCatalogue.Configs;

import com.first.GameCatalogue.Repositories.RatingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.first.GameCatalogue.Classes.Rating;
import java.util.List;

@Configuration
@EnableAutoConfiguration
public class RatingConfig {
    @Bean
    CommandLineRunner commandLineRunner(RatingRepository repository){
        return args->{
            Rating IGN= new Rating(1600,6);
            Rating New= new Rating(160,5);
        repository.saveAll(List.of(IGN,New));
        };
    }
}
