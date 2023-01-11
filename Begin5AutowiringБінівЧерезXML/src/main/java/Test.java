import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Інколи є випадки коли клас з якого потрібно створити бін є не доступним напряму.Тоді щоб створити бін даного класу потрібно в класі конфігураторі
// прописати код який буде поветати бін потрібного закритого класу
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Car bean = context.getBean(Car.class);
        bean.drive();
    }
}
