import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Інколи є випадки коли клас з якого потрібно створити бін є не доступним напряму.Тоді щоб створити бін даного класу потрібно в класі конфігураторі
// прописати код який буде поветати бін потрібного закритого класу
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car bean = context.getBean(Car.class);
        bean.drive();
    }
}
