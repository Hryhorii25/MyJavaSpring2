import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// В даній програмі показано приклад застосування анотації Autowiring вона використовується у класі Toyota
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car bean = context.getBean(Car.class);
        bean.drive();
    }
}



