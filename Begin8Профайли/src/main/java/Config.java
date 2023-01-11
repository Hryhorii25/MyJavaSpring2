import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
    @Bean
    @Profile("dev1")  //Дана анотація задає при активації якого профайлу буде задіяний даний бін
    public Persons getPerson() {
        return new Person();
    }

    @Bean
    @Profile("dev1")
    public Persons getPerson2() {
        return new Person2();
    }

    @Bean
    public Persons getPerson3() {
        return new Person2();


    }
}