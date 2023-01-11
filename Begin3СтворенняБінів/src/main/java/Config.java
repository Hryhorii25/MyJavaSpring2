import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//В класі вручну створюється бін клас Config буде повертати бін який буде являтись обєктом класу Toyota
@Configuration
public class Config {
    @Bean
    public Car getToyota(){
        return new Toyota();
    }
}
