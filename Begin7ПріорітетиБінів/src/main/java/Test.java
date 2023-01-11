import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//В даній програмі представлено випадок роботи програми при якому задіються два біна які імплементять один інтерфейс Car
// в такому випадку програма не знає який бін використовувати. В таких випадках застосовуються анотації @Primary @Qualifier
public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car bean = context.getBean(Car.class);
        bean.drive();

    }
}



