import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Клас конфігурації даний калас являє собою такий собі сканер який  сканує інші класи і шукає анотацію  @Component  в ньому прописується логіка роботи
@Configuration
@ComponentScan
public class Conf {
}
//@ComponentScan() В даній анотації можна задавати яку область буде сканувати спрінг або якйи конкректний пакет