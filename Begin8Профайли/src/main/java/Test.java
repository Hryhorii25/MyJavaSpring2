
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


//Профайли це інструмент який використовується коли у програмі є багато бінів.І при відкритті різних сайтів або при взаємодії з
// різними базами даних потрібно задіювати не усі біни які є у програмі а тільки порібні для роботи з даним ресурсом біни.
// Є  два способи задавати коли задіювати бін через анотацію @Profile через яку задається профайл активації біна
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       context.getEnvironment().acceptsProfiles("dev");
       Persons bean = context.getBean(Persons.class);
        bean.getNamePerson();
        GenericXmlApplicationContext context1 = new GenericXmlApplicationContext();
    }}

